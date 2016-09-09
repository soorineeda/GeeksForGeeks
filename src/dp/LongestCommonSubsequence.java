package dp;

import java.util.Scanner;

public class LongestCommonSubsequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int m = sc.nextInt();
			int n = sc.nextInt();
			String str1 = sc.next();
			String str2 = sc.next();
			System.out.println(lcs(str1,str2,m,n));
		}
	}

	private static int lcs(String str1, String str2, int m, int n) {
		int lcs[][] = new int[m][n];
		int i = 0;
		while(i < n){
			if(str1.charAt(0) == str2.charAt(i))
				break;
			lcs[0][i] = 0;
			i++;
		}
		while(i < n){
			lcs[0][i] = 1;
			i++;
		}
		
		i = 0;
		while(i < m){
			if(str1.charAt(i) == str2.charAt(0))
				break;
			lcs[i][0] = 0;
			i++;
		}
		while(i < m){
			lcs[i][0] = 1;
			i++;
		}

		for(i=1; i<m; i++){
			for(int j=1; j<n; j++){
				if(str1.charAt(i) == str2.charAt(j)){
					lcs[i][j] = lcs[i-1][j-1] + 1; 
				}else{
					lcs[i][j] = max(lcs[i][j-1],lcs[i-1][j]);
				}
			}
		}		
		return lcs[m-1][n-1];
	}

	private static int max(int i, int j) {
		return (i > j)? i : j;
	}
}
