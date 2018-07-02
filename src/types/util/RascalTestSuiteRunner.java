package types.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import types.testing.AbstractTestSuite;

public class RascalTestSuiteRunner {
//	private static final int NWARMUPS = 25; // number of warm-up runs to discard
//	private static final int NRUNS = 50; // number of runs to average over

	private static final int NWARMUPS = 5; // number of warm-up runs to discard
	private static final int NRUNS = 10; // number of runs to average over


	public static void main(String[] args) throws Throwable {
		if(args.length == 0) {
			System.out.println("usage: RascalTestSuiteRunner TestSuite.rsc");
			System.exit(1);
			return;
		}
		String rascalFile = args[0];
		//
		long[] totals = new long[NRUNS];
		long warmupStart = System.currentTimeMillis();
		for (int i = 0; i != NWARMUPS; ++i) {
			runExperiment(rascalFile);
		}
		long runsStart = System.currentTimeMillis();
		for (int i = 0; i != NRUNS; ++i) {
			//long start = System.nanoTime();
			long time = runExperiment(rascalFile);
			//long end = System.nanoTime();
			totals[i] = time;
			System.gc();
		}
		long finish = System.currentTimeMillis();
		System.out.println("Command-Line Options: " + Arrays.toString(args));
		System.out.println("Total time: " + (finish - warmupStart) + "ms");
		System.out.println("Warmup time: " + (runsStart - warmupStart) + "ms");
		System.out.println("Total run time: " + (finish - runsStart) + "ms");
		double mean = average(totals);
		double stddev = standardDeviation(totals);
		System.out.println("Mean run time: " + round(mean, 2) + "ns (" + (finish - runsStart) / NRUNS + "ms)");
		System.out.println("Standard deviation: " + round(stddev, 2) + "ns");
		System.out.println("Coefficiant of Variation: " + round(stddev / mean, 2));
		System.out.print("Runs: [");
		for (int i = 0; i != totals.length; ++i) {
			if (i != 0) {
				System.out.print(", ");
			}
			System.out.print(totals[i]);
		}
		System.out.println("]");
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

	public static String JAVA_CMD = System.getenv("JAVA_CMD");
	public static String CLASSPATH = System.getenv("CLASSPATH");

	private static long runExperiment(String rascalFile) throws Throwable {
		// ProcessTimerMethod.exec(500000, "types.util.RascalTestSuiteRunner",
		// "runRascal", rascalFile);
		Process p = Runtime.getRuntime()
				.exec(new String[] { JAVA_CMD, "-cp", CLASSPATH, "org.rascalmpl.shell.RascalShell", rascalFile });
		// Grabb all the output
		StringBuffer sysout = new StringBuffer();
		new StreamGrabber(p.getInputStream(), sysout);
		// Wait to see whether it terminates
		p.waitFor();
		//
		return extractRuntime(sysout);
	}

	private static long extractRuntime(StringBuffer buffer) {
		Scanner scanner = new Scanner(buffer.toString());
		scanner.nextLine(); // skip version
		int time = Integer.parseInt(scanner.nextLine().replace("ms",""));
		scanner.close();
		return time;
	}

	/**
	 * Grab everything produced by a given input stream until the End-Of-File
	 * (EOF) is reached. This is implemented as a separate thread to ensure that
	 * reading from other streams can happen concurrently. For example, we can
	 * read concurrently from <code>stdin</code> and <code>stderr</code> for
	 * some process without blocking that process.
	 *
	 * @author David J. Pearce
	 *
	 */
	static public class StreamGrabber extends Thread {
		private InputStream input;
		private StringBuffer buffer;

		public StreamGrabber(InputStream input, StringBuffer buffer) {
			this.input = input;
			this.buffer = buffer;
			start();
		}

		@Override
		public void run() {
			try {
				int nextChar;
				// keep reading!!
				while ((nextChar = input.read()) != -1) {
					buffer.append((char) nextChar);
				}
			} catch (IOException ioe) {
			}
		}
	}
}
