package algorithms.bs;

import java.util.Arrays;

public class BinarySearch2D {
    public static void main(String[] args) {
//        int[][] arr = {
//                {1, 3, 5},
//                {2, 4, 6},
//                {7, 8, 9}
//        };
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 10;


        System.out.println(Arrays.toString(binarySearch2D(arr, target)));
    }

    static int [] binarySearch2D( int [][]matrix, int target) {

        int rStart = 0;
        int cEnd = matrix.length-1;

        while (rStart < matrix.length && cEnd >= 0){

          if (matrix[rStart][cEnd] == target){
              return new int[]{rStart, cEnd};
          }
          else if (matrix[rStart][cEnd] < target){
            rStart++;
          }
          else {
              cEnd--;
          }


        }

        return new int[]{-1,-1};
    }
}
