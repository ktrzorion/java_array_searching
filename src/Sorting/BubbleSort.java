package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12,34,11,9,5,32,32};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] nums){
        boolean swapped;
        for (int i = 0; i < nums.length; i++){
            swapped = false;
            for (int j = 1; j < nums.length - i; j++){
                if(nums[j] < nums[j - 1]){
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    j++;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
