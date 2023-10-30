package org.example.hw2;

/**
 * Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
 */
public class IsNull {
    public static void main(String[] args) {
        int[]array1 = {0, 2 ,5 ,7, 8, 4};
        int[]array2 = {7, 2 ,0 ,0, 3, 6};
        System.out.println(NullNeighbour(array1));
        System.out.println(NullNeighbour(array2));
    }

    private static boolean NullNeighbour(int[] arr) {
        for (int i = 0; i < arr.length-2; i++) {
            if (arr[i]==0 && arr[i+1]==0)
                return true;
        }

        return false;
    }


}
