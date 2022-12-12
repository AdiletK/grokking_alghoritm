package com.company.binary_search;

public class BinarySearchExample {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(search(arr, 4));
        System.out.println(search(arr, -1));
    }

    public static int search(int[] list, int item) {
        int low = 0;
        int high = list.length -1;

        while (low <= high) {
            int mid = (high + low) / 2;
            int guess = list[mid];

            if (guess == item)
                return mid;

            if (guess > item)
                high = mid - 1;
            else
                low = mid  + 1;
        }
        return -1;
    }
}
