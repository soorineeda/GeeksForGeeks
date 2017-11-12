package arrays;

import java.util.PriorityQueue;

public class SortKSortedArray {
    public static void sort(int[] arr, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k+1);

        for(int i = 0;i<= k ;i++){
            minHeap.add(arr[i]);
        }

        for(int i = 0;i < arr.length - k - 1 ; i++)
        {
            arr[i] = minHeap.poll();
            minHeap.add(arr[i+k+1]);
        }

        for(int i = arr.length - k -1 ; i< arr.length ;i++){
            arr[i] = minHeap.poll();
        }


    }

    public static void main(String args[]){
        int arr[] = {2,6,3,12,56,8};
        sort(arr, 3);
        print(arr);
    }

    public static void print(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
