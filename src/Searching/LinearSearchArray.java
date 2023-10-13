package Searching;

public class LinearSearchArray {


    public int linerSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public int farea(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        int area  = 0;

        while( left < arr.length - 1){
            while( right > 0 ){
                if(arr[left] < arr[right]){
                    int tarea = arr[left] * (right - left);
                    area = (tarea > area) ? tarea : area;
                }
                else{
                    int tarea = arr[right] * (right - left);
                    area = (tarea > area) ? tarea : area;
                }
                right--;
            }
            left++;
            right = arr.length - 1;
        }
        return area;
    }
}
