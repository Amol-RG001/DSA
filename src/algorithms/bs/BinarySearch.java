package algorithms.bs;

public class BinarySearch {
    public static void main(String[] args) {
        //sorted array
        int[] arr = {1543, 2545, 3345, 4121, 5132, 6532, 7532, 8322, 9325, 10322};
        int target = 8322;
        int searched = binarySearch(arr, target);
        System.out.println(searched);
    }

     static int binarySearch(int[] arr, int target) {
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
        return -1; // target not is an array

    }
}

