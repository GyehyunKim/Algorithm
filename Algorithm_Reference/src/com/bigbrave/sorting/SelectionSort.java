
package com.bigbrave.sorting;

public class SelectionSort {
    public static void selectionSort(int[] list) {
        
        // Find the smaillest element in the list        
        for(int i=0; i < list.length; i++){
            int currentMin = i;
            for(int j=i+1; j<list.length; j++){
                if(list[currentMin] > list[j])
                    currentMin = j; 
            }

            // Swap list[i] with list[currentMin] if necessary 
            if (currentMin != i) {
                int temp = list[i];
                list[i] = list[currentMin]; 
                list[currentMin] = temp;
            }
        }
    }  
}
