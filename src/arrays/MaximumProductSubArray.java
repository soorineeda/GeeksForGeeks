package arrays;

public class MaximumProductSubArray {
    public static int findMaxProduct(int[] arr){
        if(arr.length == 0){
            return 0;
        }

        int result = arr[0];
        int max = arr[0];
        int min = arr[0];

        for(int i=1; i< arr.length; i++){
            int temp = max;
            max = max(arr[i], max * arr[i], min * arr[i]);
            min = min(arr[i], temp * arr[i], min * arr[i]);

            //update result
            if(max > result){
                result = max;
            }

//            System.out.println(max + ":" + min);
        }
        return result;
    }

    private static int max(int n1, int n2, int n3) {
        if(n1 > n2){
            return (n1 > n3)? n1 : n3;
        }

        return (n2 > n3)? n2 : n3;
    }

    private static int min(int n1, int n2, int n3) {
        if(n1 < n2){
            return (n1 < n3)? n1 : n3;
        }

        return (n2 < n3)? n2 : n3;
    }

    public static void main(String args[]){
/*
        int arr[] = {6, -3, -10, 0, 2};
        System.out.println(findMaxProduct(arr));

        int arr2[] = {-1, -3, -10, 0, 60};
        System.out.println(findMaxProduct(arr2));


        int arr3[] = {-2, -3, 0, -2, -40};
        System.out.println(findMaxProduct(arr3));

*/

        int arr4[] = {2,0,3,-2};
        System.out.println(findMaxProduct(arr4));
    }
}
