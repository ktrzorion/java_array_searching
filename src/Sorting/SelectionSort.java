package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {12,34,11,9,5,30,32};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int last = nums.length - i - 1;
            int max = maxIndex(nums, 0, last);

            swap(nums, max, last);
        }
    }

    static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    static int maxIndex(int[] nums, int start, int end){
        int max = start;

        for (int i = start; i < end; i++){
            if(nums[max] < nums[i]){
                max = i;
            }
        }
        return max;
    }
}
