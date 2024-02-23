package com.ndk.sorting;

public class MergeSort {
    private void merge(int[] arr, int low, int mid, int high){
        // Creating temp array with temp idx counter
        int[] temp = new int[high - low + 1];
        int tempIdx = 0;

        // Creating starting points for two hypothetical arrays
        int arr1Start = low;
        int arr2Start = mid + 1;

        // Comparing both hypothetical array elements and adding it to temp array in sorted manner
        while(arr1Start <= mid && arr2Start <= high){
            if(arr[arr1Start] < arr[arr2Start]){
                temp[tempIdx] = arr[arr1Start];
                tempIdx++;
                arr1Start++;
            } else {
                temp[tempIdx] = arr[arr2Start];
                tempIdx++;
                arr2Start++;
            }
        }
        // Adding balance elements to the temp array if any
        while(arr1Start <= mid){
            temp[tempIdx] = arr[arr1Start];
            tempIdx++;
            arr1Start++;
        }
        while(arr2Start <= high){
            temp[tempIdx] = arr[arr2Start];
            tempIdx++;
            arr2Start++;
        }
        // Copying temp array elements to original array
        tempIdx = 0;
        for(int i = low; i <= high; i++){
            arr[i] = temp[tempIdx];
            tempIdx++;
        }
    }

    public void mergeSort(int[] arr, int low, int high){
        if(high <= low) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }
}
