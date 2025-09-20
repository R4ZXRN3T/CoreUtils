package org.R4ZXRN3T;

class MergeSorts {
	protected static void mergeSort(int[] inputArray, int leftIndex, int rightIndex) {
		if (leftIndex < rightIndex) {
			int middleIndex = leftIndex + (rightIndex - leftIndex) / 2;

			mergeSort(inputArray, leftIndex, middleIndex);
			mergeSort(inputArray, middleIndex + 1, rightIndex);

			merge(inputArray, leftIndex, middleIndex, rightIndex);
		}
	}

	private static void merge(int[] inputArray, int leftIndex, int middleIndex, int rightIndex) {
		int leftArrayLength = middleIndex - leftIndex + 1;
		int rightArrayLength = rightIndex - middleIndex;

		int[] leftArray = new int[leftArrayLength];
		int[] rightArray = new int[rightArrayLength];

		System.arraycopy(inputArray, leftIndex, leftArray, 0, leftArrayLength);
		System.arraycopy(inputArray, middleIndex + 1, rightArray, 0, rightArrayLength);

		int i = 0, j = 0, k = leftIndex;

		while (i < leftArrayLength && j < rightArrayLength) {
			if (leftArray[i] <= rightArray[j]) {
				inputArray[k++] = leftArray[i++];
			} else {
				inputArray[k++] = rightArray[j++];
			}
		}

		while (i < leftArrayLength) inputArray[k++] = leftArray[i++];
		while (j < rightArrayLength) inputArray[k++] = rightArray[j++];
	}

	// TODO: Add merge sort for other data types
}
