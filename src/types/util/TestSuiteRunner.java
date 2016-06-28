package types.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import types.testing.AbstractTestSuite;

public class TestSuiteRunner {
	private static final int NWARMUPS = 50; // number of warm-up runs to discard
	private static final int NRUNS = 10; // number of runs to average over
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		if(args.length == 0) {
			System.out.println("usage: TestSuiteRunner --(rewriting|whiley) TestSuiteClass");
			System.exit(1);
		}
		boolean rewriting = args[0].equals("--rewriting");		
		String className = args[1];
		try {
			Class<? extends AbstractTestSuite> suiteClass = (Class<? extends AbstractTestSuite>) Class.forName(className);
			AbstractTestSuite.rewriting = rewriting;
			List<Method> testCases = findTestCases(suiteClass,className);
			List<Object> testInstances = new ArrayList<Object>();
			// Create class instances
			for(Method m : testCases) {
				testInstances.add(m.getDeclaringClass().newInstance());
			}
			long[] totals = new long[NRUNS];			
			long warmupStart = System.currentTimeMillis();
			for(int i=0;i!=NWARMUPS;++i)  {
				runExperiment(testInstances,testCases);
			}
			long runsStart = System.currentTimeMillis();
			for(int i=0;i!=NRUNS;++i) {
				long start = System.currentTimeMillis();
				runExperiment(testInstances,testCases);
				long end = System.currentTimeMillis();
				totals[i] = end - start;
				System.gc();
			}
			long finish = System.currentTimeMillis();
			System.out.println("Total time: " + (finish-warmupStart) + "ms");
			System.out.println("Warmup time: " + (runsStart-warmupStart) + "ms");
			System.out.println("Total run time: " + (finish-runsStart) + "ms");
			double mean = average(totals);
			double stddev = standardDeviation(totals);
			System.out.println("Mean run time: " + round(mean,2) + "ms");
			System.out.println("Standard deviation: " + round(stddev,2) + "ms");
			System.out.println("Coefficiant of Variation: " + round(stddev/mean,2));
			System.out.print("Runs: [");
			for(int i=0;i!=totals.length;++i) {
				if(i!=0) {
					System.out.print(", ");
				}
				System.out.print(totals[i]);
			}
			System.out.println("]");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static double round (double value, int precision) {
		int scale = (int) Math.pow(10, precision);
		return (double) Math.round(value * scale) / scale;
	}
	
	private static double average(long[] timings) {
		double r = 0;
		for(long t : timings) {
			r += t;
		}
		return r / timings.length;
	}
	
	private static double standardDeviation(long[] timings) {
		double mean = average(timings);
		double u2sum = 0d;
		for(int i=0;i!=timings.length;++i) {
			double u = timings[i] - mean;
			u2sum += (u*u);
		}
		double u2mean = u2sum / timings.length;
		return Math.sqrt(u2mean);
	}
	
	private static List<Method> findTestCases(Class<?> suite, String className) throws ClassNotFoundException {
		ArrayList<Method> methods = new ArrayList<Method>();
		for(Class<?> inner : suite.getClasses()) {
			for(Method m : inner.getDeclaredMethods()) {
				if(m.getName().startsWith("test_")) {
					methods.add(m);
				}
			}
		}
		return methods;
	}
	
	private static void runExperiment(List<Object> testInstances, List<Method> testCases) {
		for(int i=0;i!=testCases.size();++i) {
			runMethod(testInstances.get(i),testCases.get(i));
		}
	}
	
	private static void runMethod(Object testInstance, Method testCase) {
		try {
			testCase.invoke(testInstance);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
