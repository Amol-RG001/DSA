package leetcode.arrays;

import java.util.Arrays;

// problem 34 - https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstAndLastPositionSortedArray {
    public static void main(String[] args) {
        int []arr = {5,7,7,8,8,10};
        int target = 7;

       int []searchR= searchRange(arr,target);

        System.out.println(Arrays.toString(searchR));

    }

     static int[] searchRange(int[] arr, int target ) {
         int [] ans = {-1,-1};
         int start =  search(arr,target, true);
         int end = search(arr,target, false);
         ans[0] = start;
         ans[1] = end;

        return ans;
    }

    static int search(int[]nums, int target, boolean isFirstStartIndex){
        int ans = -1;
        int start = 0;
        int end  = nums.length-1;


        while (start <= end){
            int mid = start + (end - start)/2;
            if (nums[mid]< target){
                start = mid + 1;
            } else if (nums[mid]>target) {
                end = mid - 1;
            }else{
                ans = mid;
                if(isFirstStartIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}
