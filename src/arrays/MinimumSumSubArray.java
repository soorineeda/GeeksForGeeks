package arrays;

public class MinimumSumSubArray {
    public static int findMinSum(int[] arr){
        if(arr.length == 0){
            return 0;
        }

        int result = Integer.MAX_VALUE;
        int tempSum = 0;

        for(int i = 0; i < arr.length; i++){
            tempSum += arr[i];

            if(tempSum < result){
                result = tempSum;
            }

            if(tempSum > 0){
                tempSum =0;
            }
        }

        return result;
    }

    public static void main(String args[]){
        int a[] = {8, -8, 9, -9, 10, -11, 12};
        System.out.println(findMinSum(a));

        int arr2[] = {10, -3, -4, 7, 6, 5, -4, -1};
        System.out.println(findMinSum(arr2));

        int arr3[] = {-1, 40, -14, 7, 6, 5, -4, -1};
        System.out.println(findMinSum(arr3));
    }
}
