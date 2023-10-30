package org.example.hw2;

/**
 * Написать метод, возвращающий количество чётных элементов массива.
 * countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
 */
public class СountEvens {
    public static void main(String[] args) {
        int[] nums1 = {2, 1, 2, 3, 4};
        int[] nums2 = {2, 2, 0};
        int[] nums3 = {1, 3, 5};

        System.out.println(Counter(nums1));
        System.out.println(Counter(nums2));
        System.out.println(Counter(nums3));
    }

    public static int Counter(int[] nums1) {
        int count = 0;
        for (int el : nums1) {
            if (el % 2 == 0)
                count++;
        }
        return count;
    }

}
