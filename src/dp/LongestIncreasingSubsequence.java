package dp;

import java.util.Scanner;
public class LongestIncreasingSubsequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i = 0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
			System.out.println(lis(arr));
		}
	}

	private static int lis(int[] arr) {
		int n = arr.length,lisSize = 1;
		int lis[] = new int[n];
		lis[0] = 1;
		for(int i=0; i<n; i++){
			int max_local = 1;
			for(int j = 0;j<i;j++){
				if(arr[j] < arr[i] && lis[j]+1 > max_local)
					max_local = lis[j]+1;
			}
			lis[i] = max_local;
			if(lis[i] > lisSize)
				lisSize = lis[i];
		}
		return lisSize;
	}
}
