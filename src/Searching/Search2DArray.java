package Searching;

import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,5},
                {8,10,12},
                {15,18,22}
        };
//        System.out.println(Arrays.toString(findIndex(arr, 8)));
        System.out.println(Arrays.toString(findIdxSorted(arr, 8)));
    }

    static int[] findIdxSorted(int[][] matrix, int target){
        int row  = matrix.length;
        int clm = matrix[0].length;

        if(row == 1){
            return bSearch(matrix, 0,0,clm-1, target);
        }
        int rStart = 0;
        int rEnd = row - 1;
        int cMid = clm/2;

        while(rStart < (rEnd - 1)){
            int mid = rStart + (rEnd - rStart) / 2;

            if(matrix[mid][cMid] == target){
                return new int[] { mid, cMid};
            }
            if(matrix[mid][cMid] < target){
                rStart = mid;
            }
            else{
                rEnd = mid;
            }
        }
        if(matrix[rStart][cMid] == target){
            return new int[] {rStart, cMid};
        }
        if(matrix[rStart + 1][cMid] == target){
            return new int[] {rStart + 1, cMid};
        }
        if(target <= matrix[rStart][cMid - 1]){
            return bSearch(matrix, rStart, 0, cMid - 1, target);
        }
        if(target >= matrix[rStart][cMid + 1]){
            return bSearch(matrix, rStart, cMid + 1, clm - 1 , target);
        }
        if(target <= matrix[rStart + 1][cMid - 1]){
            return bSearch(matrix, rStart + 1, 0, cMid - 1, target);
        }
        else{
            return bSearch(matrix, rStart + 1, cMid + 1, clm - 1, target);
        }
    }

    static int[] bSearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while (cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;

            if(matrix[row][mid] == target){
                return new int[] {row, mid};
            }
            if(matrix[row][mid] < target){
                cStart = mid + 1;
            }
            else{
                cEnd = mid - 1;
            }
        }
        return new int[] {-1, -1};
    }

//    static int[] findIndex(int[][] matrix, int target){
//        int row = 0;
//        int clm = matrix.length - 1;
//
//        while (row < matrix.length && clm >= 0){
//            if(matrix[row][clm] == target){
//                return new int[] {row, clm};
//            }
//            if(matrix[row][clm] < target){
//                row++;
//            }
//            else{
//                clm--;
//            }
//        }
//        return new int[] {-1, -1};
//    }
}
