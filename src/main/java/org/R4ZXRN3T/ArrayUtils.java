package org.R4ZXRN3T;

public class ArrayUtils {
	public static <T extends Comparable<T>> T[] sort(T[] inputArray) {
		MergeSorts.mergeSort(inputArray, 0, inputArray.length - 1);
		return inputArray;
	}

	public static int[] sort(int[] inputArray) {
		MergeSorts.mergeSort(inputArray, 0, inputArray.length - 1);
		return inputArray;
	}

	public static long[] sort(long[] inputArray) {
		MergeSorts.mergeSort(inputArray, 0, inputArray.length - 1);
		return inputArray;
	}

	public static float[] sort(float[] inputArray) {
		MergeSorts.mergeSort(inputArray, 0, inputArray.length - 1);
		return inputArray;
	}

	public static double[] sort(double[] inputArray) {
		MergeSorts.mergeSort(inputArray, 0, inputArray.length - 1);
		return inputArray;
	}

	public static short[] sort(short[] inputArray) {
		MergeSorts.mergeSort(inputArray, 0, inputArray.length - 1);
		return inputArray;
	}

	public static byte[] sort(byte[] inputArray) {
		MergeSorts.mergeSort(inputArray, 0, inputArray.length - 1);
		return inputArray;
	}
}