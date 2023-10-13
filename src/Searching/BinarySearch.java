package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-12,-9,-3,-1,0,2,4,23,34,44};
        int ans = bSearch(nums, 0);
        int ceil = ceil(nums, 44);
        int floor = floor(nums, 45);
        System.out.println(ans);
        System.out.println(ceil);
        System.out.println(floor);
    }

    static int bSearch(int[] arr, int target){
        int index = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + ((end - start) / 2);

            if(arr[mid] == target){
                return mid;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
        }
        return -1;
    }

    static int floor(int[] arr, int target){
        if(target < arr[0]){
            return -1;
        }

        int index = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + ((end - start) / 2);

            if(arr[mid] == target){
                return mid;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
        }
        return end;
    }
    static int ceil(int[] arr, int target) {
        if(target > arr[arr.length-1]){
            return -1;
        }
        int index = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
        }
        return start;
    }
}
