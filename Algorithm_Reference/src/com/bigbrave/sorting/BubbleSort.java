package com.bigbrave.sorting;

public class BubbleSort {
    
    public static void bubbleSort(int[] list) {
        int temp; 
        boolean needNextPass = true; 
        for(int k = 1; k < list.length && needNextPass; k++){
            needNextPass = false; 
            for(int i=0; i< list.length - k; i++) {
                if(list[i] > list[i+1]) {
                    temp = list[i+1];
                    list[i+1] = list[i]; 
                    list[i] = temp; 
                    needNextPass = true; 
                }                
            }
        }
    }
}
