package algorithms;

import metrics.PerformanceTracker;


public class InsertionSort {

    private final PerformanceTracker tracker = new PerformanceTracker();

    public int[] sort(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }

        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            if (array[j] <= key) {
                tracker.incrementComparisons();
                continue;
            }

            while (j >= 0 && array[j] > key) {
                tracker.incrementComparisons();
                array[j + 1] = array[j];
                tracker.incrementSwaps();
                j--;
            }
            array[j + 1] = key;
        }

        return array;
    }

    public PerformanceTracker getTracker() {
        return tracker;
    }
}
