package com.company.selection;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arrays = {4, 6, 2, 6, 1, 8, 0};
        System.out.println(Arrays.toString(selectionSort(arrays)));
    }

    public static int[] selectionSort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            int minIndex = i;
            for (int j = i; j < size; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

}
