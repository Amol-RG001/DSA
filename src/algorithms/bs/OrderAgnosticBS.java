package algorithms.bs;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int []arr = {10,32,43,53,65,76,78};
        //int []arr = {896,345, 333,222,111,53,22,32};
        int target = 503;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);

    }

    static int orderAgnosticBS(int []arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }
        //array is an ascending if block will run
           if(isAsc){
               if(target< arr[mid]){
                   end = mid - 1;
               }
               else {
                   start = mid + 1;
               }
           }else {
               if(target> arr[mid]){
                   end = mid - 1;
               }
               else {
                   start = mid + 1;
               }
           }

        }


        return -1;
    }
}
