package com.pixel.segrigatezeros;

import java.util.LinkedList;

public class ZerosAnsOnesSample {
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,1,0,1,1,0};
        getSegregateOutcome(arr);
    }
    public static void getSegregateOutcome(int[] arr) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i=0; i<arr.length;i++) {
            if(arr[i] ==0) {
                linkedList.addLast(arr[i]);
            }else {
                linkedList.addFirst(arr[i]);
            }
        }
        System.out.println(linkedList);
    }

}
