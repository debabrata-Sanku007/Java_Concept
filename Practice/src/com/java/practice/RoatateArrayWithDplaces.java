package com.java.practice;

import java.util.Arrays;

public class RoatateArrayWithDplaces {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 9, 12, 1, 1, 1};

        int len = arr.length;
        int d = 3;
        if (d > arr.length) {
            d = d % arr.length;
        }
        /*int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i < len; i++) {
            arr[i - d] = arr[i];
        }
        for (int j = 0; j < temp.length; j++) {
            arr[len - d + j] = temp[j];
        }*/
        int[] temp = new int[d];
        for (int m = len - d, n = 0; m < len; m++, n++) {
            temp[n] = arr[m];
        }

        for (int i = len - d - 1, j = len - 1; i >= 0; i--, j--) {
            arr[j] = arr[i];
        }

        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
