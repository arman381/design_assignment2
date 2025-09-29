package cli;

import algorithms.InsertionSort;

import java.util.Random;
import java.util.Scanner;

public class BenchmarkRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] array = generateRandomArray(n);

        InsertionSort sorter = new InsertionSort();
        sorter.sort(array);

        System.out.println("Sorting completed!");
        System.out.println(sorter.getTracker());
    }

    private static int[] generateRandomArray(int n) {
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(10000);
        }
        return arr;
    }
}
