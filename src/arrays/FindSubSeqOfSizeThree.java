package arrays;

/**
 * Created by nare0576 on 11/10/17.
 */
public class FindSubSeqOfSizeThree {
    private static void printsubSequence(int[] arr){
        if(arr.length < 3){
            System.out.println("Invalid input.. min three elements are requried");
        }

        int[] min = new int[arr.length];
        int[] max = new int[arr.length];

        int minTillNow = arr[0];
        int maxTillNow = arr[arr.length -1];

        for(int i = 1;i < arr.length; i++){
            min[i] = minTillNow;
            if(arr[i] < minTillNow){
                minTillNow = arr[i];
            }
        }

        for(int i = arr.length -2; i >=0 ; i--){
            max[i] = maxTillNow;
            if(arr[i] > maxTillNow){
                maxTillNow = arr[i];
            }
        }

        for(int i = 1; i < arr.length-1; i++){
            if(min[i] < arr[i] && max[i] > arr[i]){
                System.out.println(min[i] + ":" + arr[i] + ":" + max[i]);
                return;
            }
        }

        System.out.println("No sequence found");
    }


    public static void main(String args[]){
        int arr[] = {2, 11, 10, 5, 6, 2, 30};
        printsubSequence(arr);

    }
}
