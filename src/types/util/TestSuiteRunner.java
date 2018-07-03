package types.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import types.testing.AbstractTestSuite;

public class TestSuiteRunner {
	private static final int NWARMUPS = 25; // number of warm-up runs to discard
	private static final int NRUNS = 50; // number of runs to average over

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		boolean rewriting;
		if(args.length == 0) {
			System.out.println("usage: TestSuiteRunner --(rewriting|whiley) TestSuiteClass");
			System.exit(1);
			return;
		} else if(args[0].equals("--rewriting")) {
			rewriting = true;
		} else if(args[0].equals("--whiley")) {
			rewriting = false;
		} else {
			System.out.println("usage: TestSuiteRunner --(rewriting|whiley) TestSuiteClass");
			System.exit(1);
			return;
		}
		String className = args[1];
		try {
			Class<? extends AbstractTestSuite> suiteClass = (Class<? extends AbstractTestSuite>) Class.forName(className);
			AbstractTestSuite.rewriting = rewriting;
			List<Method> testCases = findTestCases(suiteClass,className);
			List<Object> testInstances = new ArrayList<>();
			// Create class instances
			for(Method m : testCases) {
				testInstances.add(m.getDeclaringClass().newInstance());
			}
			long[] totals = new long[NRUNS];
			System.gc();
			long warmupStart = System.currentTimeMillis();
			long warmupMemoryStart = Runtime.getRuntime().freeMemory();
			for(int i=0;i!=NWARMUPS;++i)  {
				runExperiment(testInstances,testCases);
			}
			System.gc();
			long runsStart = System.currentTimeMillis();
			long runsMemoryStart = Runtime.getRuntime().freeMemory();
			for(int i=0;i!=NRUNS;++i) {
				long start = System.nanoTime();
				runExperiment(testInstances,testCases);
				long end = System.nanoTime();
				totals[i] = end - start;
				System.gc();
			}
			long finish = System.currentTimeMillis();
			long finishMemory = Runtime.getRuntime().freeMemory();
			System.out.println("Command-Line Options: " + Arrays.toString(args));
			System.out.println("Total time: " + (finish-warmupStart) + "ms");
			System.out.println("Total memory: " + (finishMemory - warmupMemoryStart)/1024 + "mb");
			System.out.println("Warmup time: " + (runsStart-warmupStart) + "ms");
			System.out.println("Warmup memory: " + (runsMemoryStart - warmupMemoryStart)/1024 + "mb");
			System.out.println("Total run time: " + (finish-runsStart) + "ms");
			long runMemory = (finishMemory - runsMemoryStart);
			System.out.println("Total run memory: " + runMemory/1024 + "mb");
			double mean = average(totals);
			double stddev = standardDeviation(totals);
			System.out.println("Mean run time: " + round(mean,2) + "ns (" + (finish-runsStart)/NRUNS +"ms)");
			System.out.println("Mean memory: " + (runMemory / (NRUNS * 1024) + "mb"));
			System.out.println("Standard deviation: " + round(stddev,2) + "ns");
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
		ArrayList<Method> methods = new ArrayList<>();
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
