package com.bigbrave.sorting;

import java.util.Scanner;

public class TestSortSelection {

    public static void main(String[] args) {
        
        int[] list = {4, 9, -1, 1, 0, 3, 5, 2, 8,7}; 
        //SelectionSort.selectionSort(list); 
        //InsertionSort.insertionSort(list); 
        //BubbleSort.bubbleSort(list); 
        //MergeSort.mergeSort(list);
        CountingSort.countingSort(list);
        
        for(int e : list)
            System.out.println(e); 
        
//        System.out.print("Enter a number to search: ");
//        Scanner in = new Scanner(System.in);
//        
//        int result = binarySearch(list, in.nextDouble());
//        if(result < 0)
//            System.out.println("Not found.");
//        else
//            System.out.printf("list[%d]", result);
    }
    
    private static int binarySearch(int[] list, double key) {        
        
        int low = 0; 
        int high = list.length - 1;

        while(high >= low){
            int mid = (low + high) / 2;
            if(key > list[mid]) 
                low = mid + 1;
            else if(key < list[mid])
                high = mid - 1; 
            else {
                return mid;
            }
        }
        return -low - 1; // not found 
    }

}

