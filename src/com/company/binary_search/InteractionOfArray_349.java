package com.company.binary_search;

import java.util.*;

public class InteractionOfArray_349 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};

        Set<Integer> hashSet = new HashSet<>();
        List<Integer> res = new ArrayList<>();

        if (arr1.length > arr2.length) {
            for (int i : arr2)
                hashSet.add(i);
            for (int i = 0; i < arr1.length; i++) {
                if (hashSet.contains(arr1[i])) {
                    res.add(arr1[i]);
                    hashSet.remove(arr1[i]);
                }
            }
        } else {
            for (int i : arr1)
                hashSet.add(i);

            for (int i = 0; i < arr2.length; i++) {
                if (hashSet.contains(arr2[i])) {
                    res.add(arr2[i]);
                    hashSet.remove(arr2[i]);
                }
            }
        }
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        System.out.println(Arrays.toString(result));
    }


}
