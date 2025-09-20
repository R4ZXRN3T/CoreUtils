package org.R4ZXRN3T;

public class ArrayUtils {
	public static int[] sort(int[] inputArray) {
		int[] finalArray = inputArray.clone();
		MergeSorts.mergeSort(finalArray, 0, inputArray.length - 1);
		return finalArray;
	}
}