package Searching;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {-32, -12, -9, -4, 0, 2, 12, 32, 34, 45, 56, 78};
        int target = 0;
        System.out.println(findRange(arr, target));
    }

    static int findRange(int[] nums, int target){
        int start = 0;
        int end = 1;

        while(nums[end] <= target){
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return find(nums, target, start, end);
    }
    static int find(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public int binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = nums.length / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
