package algorithms;

public class Floor {
    public static void main(String[] args) {
        //sorted array
        int[] arr = {15, 23, 33, 41, 53, 65, 75, 82, 90, 103};
        int target = 10;
        int searched = floor(arr, target);
        System.out.println(searched);
    }

     static int floor(int[] arr, int target) {
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
        return end; // target not is an array

    }
}

