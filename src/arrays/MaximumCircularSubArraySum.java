package arrays;

public class MaximumCircularSubArraySum {

    //small updates to find min sum sub array logic
    public static int findMaxCircularSum(int[] arr){
        if(arr.length == 0){
            return 0;
        }

        int minSum = Integer.MAX_VALUE;
        int tempSum = 0, totalSum = 0;

        for(int i = 0; i < arr.length; i++){
            totalSum += arr[i]; // update
            tempSum += arr[i];

            if(tempSum < minSum){
                minSum = tempSum;
            }

            if(tempSum > 0){
                tempSum =0;
            }
        }

        return totalSum - minSum; //update
    }

    public static void main(String args[]){
        int a[] = {8, -8, 9, -9, 10, -11, 12};
        System.out.println(findMaxCircularSum(a));

        int arr2[] = {10, -3, -4, 7, 6, 5, -4, -1};
        System.out.println(findMaxCircularSum(arr2));

        int arr3[] = {-1, 40, -14, 7, 6, 5, -4, -1};
        System.out.println(findMaxCircularSum(arr3));
    }
}
