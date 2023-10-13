package Sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};

        cyclicSort(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void cyclicSort(int[] nums){
        for(int i = 0; i < nums.length;){
            if((nums[i] - 1) == i){
                i++;
            }
            else {
                int temp = nums[i];
                nums[i] =  nums[nums[i] - 1];
                nums[temp - 1] = temp;
            }
        }
    }
}
