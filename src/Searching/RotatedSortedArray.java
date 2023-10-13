package Searching;

public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};

        System.out.println("Pivot of array is " + pivot(nums) + ".");
        System.out.println("Array is rotated " + pivotCount(nums) + " times.");
    }

    static int pivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }
            if(nums[start] >= nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }

    static int pivotWithDupli(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }

            if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                if(nums[start] > nums[start+1]){
                    return start;
                }
                start++;
                if (nums[end] < nums[end - 1]){
                    return end - 1;
                }
                end--;
            } else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start  = mid + 1;
            } else{
                end  = mid - 1;
            }
        }
        return -1;
    }

    static int pivotCount(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(mid < end && nums[mid] > nums[mid + 1]){
                return mid + 1;
            }
            if(mid > start && nums[mid] < nums[mid - 1]){
                return mid;
            }
            if(nums[start] >= nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }

    static int bSearch(int[] nums, int target, int start, int end){
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
}
