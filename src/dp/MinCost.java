package dp;

import java.util.Scanner;

public class MinCost {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int m = sc.nextInt();
			int n = sc.nextInt();
			int costs[][] = new int[m][n];
			for(int i=0; i<m; i++){
				for(int j=0; j<n; j++){
					costs[i][j] = sc.nextInt();
				}
			}
			System.out.println(findMinCost(costs,m,n));
		}
	}

	private static int findMinCost(int[][] costs, int m, int n) {
		int minCosts[][] = new int[m][n];
		minCosts[m-1][n-1] = costs[m-1][n-1];
		for(int i=m-2; i>=0; i--){
			minCosts[i][n-1] = minCosts[i+1][n-1]+costs[i][n-1];
		}
		for(int i=n-2; i>=0; i--){
			minCosts[m-1][i] = minCosts[m-1][i+1]+costs[m-1][i];
		}
		
		for(int i=m-2; i>=0; i--){
			for(int j=n-2; j>=0; j--){
				minCosts[i][j] = costs[i][j] + max( 
								 minCosts[i][j+1],
								 minCosts[i+1][j],
								 minCosts[i+1][j+1]);
			}
		}
		return minCosts[0][0];
	}

	private static int max(int i, int j, int k) {
		return (i<j)? ((i<k)?i:k) : ((j<k)?j:k);
	}
/* test case
1
3 3
1 2 3
4 8 2
1 5 3
 */
}
