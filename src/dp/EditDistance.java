package dp;

import java.util.Scanner;

public class EditDistance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int m = sc.nextInt();
			int n = sc.nextInt();
			String str1 = sc.next();
			String str2 = sc.next();
			System.out.println(findEditDistance(str1,str2,m,n));
		}
	}

	private static int findEditDistance(String str1, String str2, int m,
			int n) {
		int ed[][] = new int[m+1][n+1];
		for(int i=0;i<=m;i++){
			ed[i][0] = i;
		}
		for(int i=0;i<=n;i++){
			ed[0][i] = i;
		}
		for(int i=1; i<=m; i++){
			for(int j=1; j<=n; j++){
				if(str1.charAt(i-1) == str2.charAt(j-1)){
					ed[i][j] = ed[i-1][j-1];
				}else{
								// 1 + min(insert, delete, replace)
					ed[i][j] = 1 + min(ed[i][j-1],ed[i-1][j],ed[i-1][j-1]);
				}
			}
		}
		return ed[m][n];
	}

	private static int min(int x, int y, int z) {
		if (x<y && x<z) return x;
        if (y<x && y<z) return y;
        else return z;
	}
}
