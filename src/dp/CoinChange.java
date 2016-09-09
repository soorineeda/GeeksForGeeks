package dp;

import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int sum = sc.nextInt();
			int n = sc.nextInt();
			int coins[] = new int[n];
			for(int i=0; i<n; i++){
				coins[i] = sc.nextInt();
			}
			System.out.println(countCoinChanges(coins,n,sum));
		}
	}

	private static int countCoinChanges(int[] coins, int n, int sum) {
		int cc[] = new int[sum+1];
		cc[0] = 1;
		int temp[] = new int[sum+1];	//To avoid repeated counts
		for(int i=1; i<=sum; i++){
			int count = 0;
			for(int j=0; j<n; j++){
				if(i >= coins[j] && temp[coins[j]] != 1){
					count += cc[i-coins[j]];
					temp[i-coins[j]] = 1; 	//To avoid repeated counts
				}
			}
			cc[i] = count;
			Arrays.fill(temp,0);	//To avoid repeated counts
		}
		return cc[sum];
	} 
	
	/* 
	 sum = 4 
	 { 1 2 3 } 
	 1 - 1 
	 2 - 1 1 , 2 
	 3 - 1 1 1 , 2 1, 3 
     4 - 1 1 1 1, 1 1 2, 1 3, 2 2 
	 */ 
} 