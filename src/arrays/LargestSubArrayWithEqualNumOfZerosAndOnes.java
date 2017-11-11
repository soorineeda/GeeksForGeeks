package arrays;

import java.util.HashMap;

public class LargestSubArrayWithEqualNumOfZerosAndOnes {
    protected static void findSubArraywithEqualZerosAndOnes(int[] arr){
        //Replace all 0s with -1s
        for(int i = 0; i < arr.length; i++){
            arr[i] = (arr[i] == 0)?-1:1;
        }

        int tempSum = 0;
        int resultSize = 0;

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        hm.put(0,-1);

        for(int i = 0; i < arr.length; i++){
            tempSum += arr[i];

            if(!hm.containsKey(tempSum)){
                hm.put(tempSum, i);
                continue;
            }

            if((i - hm.get(tempSum)) > resultSize){
                resultSize = i - hm.get(tempSum);
                hm.put(arr.length + 2, tempSum);
            }
        }

        if(resultSize == 0){
            System.out.println("No such subarray");
            return;
        }

//        System.out.println("result size:" + resultSize);
        int indexI = (hm.get(hm.get(arr.length + 2)) + 1);
        int indexJ = (resultSize + hm.get(hm.get(arr.length + 2)));
        System.out.println( indexI + ":" + indexJ);
    }

    public static void main(String args[]){
        int arr[] = {1, 0, 1, 1, 1, 0, 0};
        findSubArraywithEqualZerosAndOnes(arr);

        int arr2[] = {1, 1, 1, 1};
        findSubArraywithEqualZerosAndOnes(arr2);

        int arr3[] = {0, 0, 1, 1, 0};
        findSubArraywithEqualZerosAndOnes(arr3);

    }
}
