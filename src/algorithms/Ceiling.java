package algorithms;

public class Ceiling {
    public static void main(String[] args) {
        //sorted array
        int[] arr = {15, 23, 33, 41, 53, 65, 75, 82, 90, 103};
        int target = 106;
        int searched = ceiling(arr, target);
        System.out.println(searched);
    }

     static int ceiling(int[] arr, int target) {
        //if target number is greater than the greatest number rin an array then return -1
        if(target > arr.length-1){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        // when array is ascending order.
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid; //best case scenario
            }

        }
        return start; // target not is an array

    }
}

