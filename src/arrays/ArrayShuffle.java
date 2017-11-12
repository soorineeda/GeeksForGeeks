package arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayShuffle {
    public static void shuffle(int[] arr, int n){
        Random r = new Random();

        for(int i = n-1 ;i > 0; i--) {
            int random = r.nextInt(i);
            swap(arr, i, random);
        }
    }

    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        shuffle(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

}
