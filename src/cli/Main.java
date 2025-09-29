package cli;

import algorithms.InsertionSort;
import metrics.PerformanceTracker;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = {9, 4, 6, 2, 7};

        InsertionSort sorter = new InsertionSort();
        PerformanceTracker tracker = sorter.getTracker();

        System.out.println("Before sorting: " + Arrays.toString(arr));

        int[] sorted = sorter.sort(Arrays.copyOf(arr, arr.length));

        System.out.println("After sorting:  " + Arrays.toString(sorted));
        System.out.println("Performance:   " + tracker);
    }
}
