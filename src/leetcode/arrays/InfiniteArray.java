package leetcode.arrays;
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {
                3, 5, 7, 9, 10, 12, 15, 18, 20, 25,
                30, 35, 40, 45, 50, 55, 60, 65, 70, 75,
                80, 85, 90, 95, 100, 105, 110, 115, 120, 125,
                130, 135, 140, 145, 150, 155, 160, 165, 170, 175,
                180, 185, 190, 195, 200, 205, 210, 215, 220, 225,
                230, 235, 240, 245, 250, 255, 260, 265, 270, 275,
                280, 285, 290, 295, 300, 305, 310, 315, 320, 325,
                330, 335, 340, 345, 350, 355, 360, 365, 370, 375,
                380, 385, 390, 395, 400, 405, 410, 415, 420, 425,
                430, 435, 440, 445, 450, 455, 460, 465, 470, 475,
                500, 525, 550, 575
        };

        int target = 575;
        System.out.println(chunks(arr, target));
    }
    static int chunks(int[] arr, int target) {
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range

            while (target > arr[end]) {
                int temp = end + 1; // this is my new start
                // double the box value
                // end = previous end + sizeof box*2
                end = end + (end - start + 1) * 2;

                start = temp;

                //to avoid ArrayIndexOutOfBoundsException we have give actual length size
                if (end >= arr.length) {
                    end = arr.length - 1;
                    break;
                }
            }

        return binarySearch(arr, target, start, end);

    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // answer found
                return mid;
            }
        }
        return -1;
    }
}