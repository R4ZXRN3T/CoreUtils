package org.R4ZXRN3T;

import java.util.Arrays;

class MergeSorts {
	protected static <T extends Comparable<T>> void mergeSort(T[] array, int left, int right) {
		if (left < right) {
			int mid = left + (right - left) / 2;
			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);
			merge(array, left, mid, right);
		}
	}

	private static <T extends Comparable<T>> void merge(T[] array, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		T[] leftArr = Arrays.copyOfRange(array, left, mid + 1);
		T[] rightArr = Arrays.copyOfRange(array, mid + 1, right + 1);

		int i = 0, j = 0, k = left;
		while (i < n1 && j < n2) {
			if (leftArr[i].compareTo(rightArr[j]) <= 0) {
				array[k++] = leftArr[i++];
			} else {
				array[k++] = rightArr[j++];
			}
		}
		while (i < n1) array[k++] = leftArr[i++];
		while (j < n2) array[k++] = rightArr[j++];
	}

	protected static void mergeSort(int[] array, int left, int right) {
		if (left < right) {
			int mid = left + (right - left) / 2;
			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);
			merge(array, left, mid, right);
		}
	}

	private static void merge(int[] array, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		int[] leftArr = Arrays.copyOfRange(array, left, mid + 1);
		int[] rightArr = Arrays.copyOfRange(array, mid + 1, right + 1);

		int i = 0, j = 0, k = left;
		while (i < n1 && j < n2) {
			if (leftArr[i] <= rightArr[j]) {
				array[k++] = leftArr[i++];
			} else {
				array[k++] = rightArr[j++];
			}
		}
		while (i < n1) array[k++] = leftArr[i++];
		while (j < n2) array[k++] = rightArr[j++];
	}

	protected static void mergeSort(long[] array, int left, int right) {
		if (left < right) {
			int mid = left + (right - left) / 2;
			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);
			merge(array, left, mid, right);
		}
	}

	private static void merge(long[] array, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		long[] leftArr = Arrays.copyOfRange(array, left, mid + 1);
		long[] rightArr = Arrays.copyOfRange(array, mid + 1, right + 1);

		int i = 0, j = 0, k = left;
		while (i < n1 && j < n2) {
			if (leftArr[i] <= rightArr[j]) {
				array[k++] = leftArr[i++];
			} else {
				array[k++] = rightArr[j++];
			}
		}
		while (i < n1) array[k++] = leftArr[i++];
		while (j < n2) array[k++] = rightArr[j++];
	}

	protected static void mergeSort(float[] array, int left, int right) {
		if (left < right) {
			int mid = left + (right - left) / 2;
			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);
			merge(array, left, mid, right);
		}
	}

	private static void merge(float[] array, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		float[] leftArr = Arrays.copyOfRange(array, left, mid + 1);
		float[] rightArr = Arrays.copyOfRange(array, mid + 1, right + 1);

		int i = 0, j = 0, k = left;
		while (i < n1 && j < n2) {
			if (leftArr[i] <= rightArr[j]) {
				array[k++] = leftArr[i++];
			} else {
				array[k++] = rightArr[j++];
			}
		}
		while (i < n1) array[k++] = leftArr[i++];
		while (j < n2) array[k++] = rightArr[j++];
	}

	protected static void mergeSort(double[] array, int left, int right) {
		if (left < right) {
			int mid = left + (right - left) / 2;
			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);
			merge(array, left, mid, right);
		}
	}

	private static void merge(double[] array, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		double[] leftArr = Arrays.copyOfRange(array, left, mid + 1);
		double[] rightArr = Arrays.copyOfRange(array, mid + 1, right + 1);

		int i = 0, j = 0, k = left;
		while (i < n1 && j < n2) {
			if (leftArr[i] <= rightArr[j]) {
				array[k++] = leftArr[i++];
			} else {
				array[k++] = rightArr[j++];
			}
		}
		while (i < n1) array[k++] = leftArr[i++];
		while (j < n2) array[k++] = rightArr[j++];
	}

	protected static void mergeSort(short[] array, int left, int right) {
		if (left < right) {
			int mid = left + (right - left) / 2;
			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);
			merge(array, left, mid, right);
		}
	}

	private static void merge(short[] array, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		short[] leftArr = Arrays.copyOfRange(array, left, mid + 1);
		short[] rightArr = Arrays.copyOfRange(array, mid + 1, right + 1);

		int i = 0, j = 0, k = left;
		while (i < n1 && j < n2) {
			if (leftArr[i] <= rightArr[j]) {
				array[k++] = leftArr[i++];
			} else {
				array[k++] = rightArr[j++];
			}
		}
		while (i < n1) array[k++] = leftArr[i++];
		while (j < n2) array[k++] = rightArr[j++];
	}

	protected static void mergeSort(byte[] array, int left, int right) {
		if (left < right) {
			int mid = left + (right - left) / 2;
			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);
			merge(array, left, mid, right);
		}
	}

	private static void merge(byte[] array, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		byte[] leftArr = Arrays.copyOfRange(array, left, mid + 1);
		byte[] rightArr = Arrays.copyOfRange(array, mid + 1, right + 1);

		int i = 0, j = 0, k = left;
		while (i < n1 && j < n2) {
			if (leftArr[i] <= rightArr[j]) {
				array[k++] = leftArr[i++];
			} else {
				array[k++] = rightArr[j++];
			}
		}
		while (i < n1) array[k++] = leftArr[i++];
		while (j < n2) array[k++] = rightArr[j++];
	}
}