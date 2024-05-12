package com.pixel.arraysexample;

import java.util.Arrays;

public class CombineArrays {
    public static void main(String[] args) {
        int[] arr1 ={1,2,3};
        int[] arr2 ={4,5,6};
        int[] ints = combineTwoArrays(arr1, arr2);
        System.out.println(Arrays.toString(ints));
    }
    public static int[] combineTwoArrays(int[] arr1, int[] arr2) {
        int[] combine= new int[arr1.length + arr2.length];
        System.arraycopy(arr1,0,combine,0,arr1.length);
        System.arraycopy(arr2,0,combine,arr1.length,arr2.length);
        return combine;
    }
}
