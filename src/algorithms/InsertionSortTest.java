package algorithms;

import java.util.Arrays;

public class InsertionSortTest {
    public static void main(String[] args) {
        InsertionSort sorter = new InsertionSort();

        int[] test1 = {};
        System.out.println("Empty: " + Arrays.toString(sorter.sort(test1)));

        int[] test2 = {42};
        System.out.println("Single: " + Arrays.toString(sorter.sort(test2)));

        int[] test3 = {1, 2, 3, 4, 5};
        System.out.println("Sorted: " + Arrays.toString(sorter.sort(test3)));

        int[] test4 = {5, 4, 3, 2, 1};
        System.out.println("Reverse: " + Arrays.toString(sorter.sort(test4)));

        int[] test5 = {4, 2, 2, 3, 1};
        System.out.println("Duplicates: " + Arrays.toString(sorter.sort(test5)));
    }
}
