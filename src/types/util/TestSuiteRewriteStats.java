package types.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import types.core.RewritingSubtypeOperator;
import types.testing.AbstractTestSuite;

public class TestSuiteRewriteStats {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		if(args.length == 0) {
			System.out.println("usage: TestSuiteRewriteStats TestSuiteClass");
			System.exit(1);
		}	
		String className = args[0];
		try {
			Class<? extends AbstractTestSuite> suiteClass = (Class<? extends AbstractTestSuite>) Class.forName(className);
			List<Method> testCases = findTestCases(suiteClass,className);
			List<Object> testInstances = new ArrayList<Object>();
			// Create class instances
			for(Method m : testCases) {
				testInstances.add(m.getDeclaringClass().newInstance());
			}
			long[] rewrites = new long[testCases.size()];			
			
			for(int i=0;i!=testCases.size();++i) {
				rewrites[i] = runExperiment(testInstances.get(i),testCases.get(i));				
			}
			System.out.println("Command-Line Options: " + Arrays.toString(args));
			System.out.println("Total rewrites: " + total(rewrites) + " rewrites");
			double mean = average(rewrites);
			double stddev = standardDeviation(rewrites);
			System.out.println("Mean: " + round(mean,2) + " rewrites");
			System.out.println("Standard deviation: " + round(stddev,2) + " rewrites");
			System.out.println("Coefficiant of Variation: " + round(stddev/mean,2));
			System.out.print("Tests: [");
			for(int i=0;i!=rewrites.length;++i) {
				if(i!=0) {
					System.out.print(", ");
				}
				System.out.print(rewrites[i]);
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
	
	private static double average(long[] data) {		
		return total(data) / data.length;
	}
	
	private static long total(long[] data) {
		long sum = 0;
		for(long t : data) {
			sum += t;
		}
		return sum;
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
	
	
	private static long runExperiment(Object suite, Method testCase) {
		try {
			testCase.invoke(suite);
			return RewritingSubtypeOperator.numRewrites;
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
