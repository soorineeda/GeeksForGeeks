package arrays;

public class MaximumSumSubArray {
    public static int findMaxSum(int arr[]){
        if(arr.length == 0){
            return 0;
        }

        int result = Integer.MIN_VALUE; // has to be int min for negative cases
        int tempSum = 0;
        for(int i = 0; i < arr.length; i++){
            tempSum += arr[i];

            if(tempSum > result){
                result = tempSum;
            }

            if(tempSum < 0){
                tempSum = 0;
                continue;
            }

        }

        return result;
    }

    public static void main(String args[]){
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(findMaxSum(arr));

        int arr2[] = {-3,-1,2};
        System.out.println(findMaxSum(arr2));
    }

}
