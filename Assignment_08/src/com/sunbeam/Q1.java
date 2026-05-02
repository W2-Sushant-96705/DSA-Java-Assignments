package com.sunbeam;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4, 3, 2, 1};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int mode = arr[0];
        int maxCount = 0;

        // Find mode
        for (int key : map.keySet()) {
            if (map.get(key) > maxCount) {
                maxCount = map.get(key);
                mode = key;
            }
        }

        System.out.println("Mode: " + mode);
    }
}