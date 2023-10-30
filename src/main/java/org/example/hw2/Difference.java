package org.example.hw2;

import java.util.Arrays;

/**
 * Написать функцию,
 * возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.
 */
public class Difference {
    public static void main(String[] args) {
        int[] array = {2, 5, 7, 9, 1, 3, 6};
        System.out.println(DifFind(array));

    }

    public static int DifFind(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[arr.length-1]-arr[0];
        return diff;
    }
}
