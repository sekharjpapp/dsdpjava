package com.pixel.leetcode;

public class ArrayIntro {
    public static void main(String[] args) {
        int[] arr = {3,2,5,6,7,8};
        arr[2] =23;
        printArray(arr);
    }
    public static void printArray(int[] arr) {
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
