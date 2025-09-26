package org.R4ZXRN3T;

class MergeSorts {
	private static final int INSERTION_SORT_THRESHOLD = 16;

	// Generic version
	protected static <T extends Comparable<T>> void mergeSort(T[] array, int left, int right) {
		@SuppressWarnings("unchecked")
		T[] aux = (T[]) new Comparable[array.length];
		mergeSort(array, aux, left, right);
	}

	private static <T extends Comparable<T>> void mergeSort(T[] array, T[] aux, int left, int right) {
		if (right - left + 1 <= INSERTION_SORT_THRESHOLD) {
			insertionSort(array, left, right);
			return;
		}
		int mid = left + (right - left) / 2;
		mergeSort(array, aux, left, mid);
		mergeSort(array, aux, mid + 1, right);
		if (array[mid].compareTo(array[mid + 1]) <= 0) return;
		merge(array, aux, left, mid, right);
	}

	private static <T extends Comparable<T>> void merge(T[] array, T[] aux, int left, int mid, int right) {
		System.arraycopy(array, left, aux, left, right - left + 1);
		int i = left, j = mid + 1, k = left;
		while (i <= mid && j <= right) {
			if (aux[i].compareTo(aux[j]) <= 0) array[k++] = aux[i++];
			else array[k++] = aux[j++];
		}
		while (i <= mid) array[k++] = aux[i++];
	}

	private static <T extends Comparable<T>> void insertionSort(T[] array, int left, int right) {
		for (int i = left + 1; i <= right; i++) {
			T key = array[i];
			int j = i - 1;
			while (j >= left && array[j].compareTo(key) > 0) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}
	}

	// int version
	protected static void mergeSort(int[] array, int left, int right) {
		int[] aux = new int[array.length];
		mergeSort(array, aux, left, right);
	}

	private static void mergeSort(int[] array, int[] aux, int left, int right) {
		if (right - left + 1 <= INSERTION_SORT_THRESHOLD) {
			insertionSort(array, left, right);
			return;
		}
		int mid = left + (right - left) / 2;
		mergeSort(array, aux, left, mid);
		mergeSort(array, aux, mid + 1, right);
		if (array[mid] <= array[mid + 1]) return;
		merge(array, aux, left, mid, right);
	}

	private static void merge(int[] array, int[] aux, int left, int mid, int right) {
		System.arraycopy(array, left, aux, left, right - left + 1);
		int i = left, j = mid + 1, k = left;
		while (i <= mid && j <= right) {
			if (aux[i] <= aux[j]) array[k++] = aux[i++];
			else array[k++] = aux[j++];
		}
		while (i <= mid) array[k++] = aux[i++];
	}

	private static void insertionSort(int[] array, int left, int right) {
		for (int i = left + 1; i <= right; i++) {
			int key = array[i];
			int j = i - 1;
			while (j >= left && array[j] > key) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}
	}

	// long version
	protected static void mergeSort(long[] array, int left, int right) {
		long[] aux = new long[array.length];
		mergeSort(array, aux, left, right);
	}

	private static void mergeSort(long[] array, long[] aux, int left, int right) {
		if (right - left + 1 <= INSERTION_SORT_THRESHOLD) {
			insertionSort(array, left, right);
			return;
		}
		int mid = left + (right - left) / 2;
		mergeSort(array, aux, left, mid);
		mergeSort(array, aux, mid + 1, right);
		if (array[mid] <= array[mid + 1]) return;
		merge(array, aux, left, mid, right);
	}

	private static void merge(long[] array, long[] aux, int left, int mid, int right) {
		System.arraycopy(array, left, aux, left, right - left + 1);
		int i = left, j = mid + 1, k = left;
		while (i <= mid && j <= right) {
			if (aux[i] <= aux[j]) array[k++] = aux[i++];
			else array[k++] = aux[j++];
		}
		while (i <= mid) array[k++] = aux[i++];
	}

	private static void insertionSort(long[] array, int left, int right) {
		for (int i = left + 1; i <= right; i++) {
			long key = array[i];
			int j = i - 1;
			while (j >= left && array[j] > key) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}
	}

	// float version
	protected static void mergeSort(float[] array, int left, int right) {
		float[] aux = new float[array.length];
		mergeSort(array, aux, left, right);
	}

	private static void mergeSort(float[] array, float[] aux, int left, int right) {
		if (right - left + 1 <= INSERTION_SORT_THRESHOLD) {
			insertionSort(array, left, right);
			return;
		}
		int mid = left + (right - left) / 2;
		mergeSort(array, aux, left, mid);
		mergeSort(array, aux, mid + 1, right);
		if (array[mid] <= array[mid + 1]) return;
		merge(array, aux, left, mid, right);
	}

	private static void merge(float[] array, float[] aux, int left, int mid, int right) {
		System.arraycopy(array, left, aux, left, right - left + 1);
		int i = left, j = mid + 1, k = left;
		while (i <= mid && j <= right) {
			if (aux[i] <= aux[j]) array[k++] = aux[i++];
			else array[k++] = aux[j++];
		}
		while (i <= mid) array[k++] = aux[i++];
	}

	private static void insertionSort(float[] array, int left, int right) {
		for (int i = left + 1; i <= right; i++) {
			float key = array[i];
			int j = i - 1;
			while (j >= left && array[j] > key) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}
	}

	// double version
	protected static void mergeSort(double[] array, int left, int right) {
		double[] aux = new double[array.length];
		mergeSort(array, aux, left, right);
	}

	private static void mergeSort(double[] array, double[] aux, int left, int right) {
		if (right - left + 1 <= INSERTION_SORT_THRESHOLD) {
			insertionSort(array, left, right);
			return;
		}
		int mid = left + (right - left) / 2;
		mergeSort(array, aux, left, mid);
		mergeSort(array, aux, mid + 1, right);
		if (array[mid] <= array[mid + 1]) return;
		merge(array, aux, left, mid, right);
	}

	private static void merge(double[] array, double[] aux, int left, int mid, int right) {
		System.arraycopy(array, left, aux, left, right - left + 1);
		int i = left, j = mid + 1, k = left;
		while (i <= mid && j <= right) {
			if (aux[i] <= aux[j]) array[k++] = aux[i++];
			else array[k++] = aux[j++];
		}
		while (i <= mid) array[k++] = aux[i++];
	}

	private static void insertionSort(double[] array, int left, int right) {
		for (int i = left + 1; i <= right; i++) {
			double key = array[i];
			int j = i - 1;
			while (j >= left && array[j] > key) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}
	}

	// short version
	protected static void mergeSort(short[] array, int left, int right) {
		short[] aux = new short[array.length];
		mergeSort(array, aux, left, right);
	}

	private static void mergeSort(short[] array, short[] aux, int left, int right) {
		if (right - left + 1 <= INSERTION_SORT_THRESHOLD) {
			insertionSort(array, left, right);
			return;
		}
		int mid = left + (right - left) / 2;
		mergeSort(array, aux, left, mid);
		mergeSort(array, aux, mid + 1, right);
		if (array[mid] <= array[mid + 1]) return;
		merge(array, aux, left, mid, right);
	}

	private static void merge(short[] array, short[] aux, int left, int mid, int right) {
		System.arraycopy(array, left, aux, left, right - left + 1);
		int i = left, j = mid + 1, k = left;
		while (i <= mid && j <= right) {
			if (aux[i] <= aux[j]) array[k++] = aux[i++];
			else array[k++] = aux[j++];
		}
		while (i <= mid) array[k++] = aux[i++];
	}

	private static void insertionSort(short[] array, int left, int right) {
		for (int i = left + 1; i <= right; i++) {
			short key = array[i];
			int j = i - 1;
			while (j >= left && array[j] > key) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}
	}

	// byte version
	protected static void mergeSort(byte[] array, int left, int right) {
		byte[] aux = new byte[array.length];
		mergeSort(array, aux, left, right);
	}

	private static void mergeSort(byte[] array, byte[] aux, int left, int right) {
		if (right - left + 1 <= INSERTION_SORT_THRESHOLD) {
			insertionSort(array, left, right);
			return;
		}
		int mid = left + (right - left) / 2;
		mergeSort(array, aux, left, mid);
		mergeSort(array, aux, mid + 1, right);
		if (array[mid] <= array[mid + 1]) return;
		merge(array, aux, left, mid, right);
	}

	private static void merge(byte[] array, byte[] aux, int left, int mid, int right) {
		System.arraycopy(array, left, aux, left, right - left + 1);
		int i = left, j = mid + 1, k = left;
		while (i <= mid && j <= right) {
			if (aux[i] <= aux[j]) array[k++] = aux[i++];
			else array[k++] = aux[j++];
		}
		while (i <= mid) array[k++] = aux[i++];
	}

	private static void insertionSort(byte[] array, int left, int right) {
		for (int i = left + 1; i <= right; i++) {
			byte key = array[i];
			int j = i - 1;
			while (j >= left && array[j] > key) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}
	}
}