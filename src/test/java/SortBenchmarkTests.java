import org.R4ZXRN3T.ArrayUtils;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

public class SortBenchmarkTests {
	private static final int TOTAL_RUNS = 100;
	private static final int SORT_ARRAY_SIZE = 250_000;

	@Test
	void benchmarkSort() {
		double[] coreUtilsResult = new double[TOTAL_RUNS];
		double[] arraySortResult = new double[TOTAL_RUNS];

		for (int i = 0; i < coreUtilsResult.length; i++) {
			// int[] input = new Random().ints(SORT_ARRAY_SIZE, 0, SORT_ARRAY_SIZE).toArray();
			Random rnd = new Random();
			Integer[] input = new Integer[SORT_ARRAY_SIZE];
			for (int j = 0; j < SORT_ARRAY_SIZE; j++) {
				input[j] = rnd.nextInt();
			}

			long startTimeCoreUtils = System.nanoTime();
			ArrayUtils.sort(input);
			long endTimeCoreUtils = System.nanoTime();
			long startTimeArraySort = System.nanoTime();
			Arrays.sort(input);
			long endTimeArraySort = System.nanoTime();

			coreUtilsResult[i] = (double) (endTimeCoreUtils - startTimeCoreUtils);
			arraySortResult[i] = (double) (endTimeArraySort - startTimeArraySort);
		}

		double totalDurationCoreUtils = 0;
		double totalDurationArraySort = 0;

		for (int i = 0; i < TOTAL_RUNS; i++) {
			totalDurationCoreUtils += coreUtilsResult[i];
			totalDurationArraySort += arraySortResult[i];
		}

		IO.println("Total CoreUtil sort duration over " + TOTAL_RUNS + " runs: " + totalDurationCoreUtils / 1_000_000 + "ms");
		IO.println("Average CoreUtil sort time: " + (totalDurationCoreUtils / TOTAL_RUNS) / 1_000_000 + "ms");

		IO.println("Total Array Sort duration over " + TOTAL_RUNS + " runs: " + totalDurationArraySort / 1_000_000 + "ms");
		IO.println("Average Array Sort sort time: " + (totalDurationArraySort / TOTAL_RUNS) / 1_000_000 + "ms");
	}
}