package backjoon;

import java.util.Scanner;

public class back1463 {
		static int x;
		
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		x = scn.nextInt();
	
		dp(x);
	}
	
	public static void dp(int x) {
			
		int[] dp = new int [x+1];
		dp[0] = 0;
		dp[1] = 0;
		
		for(int i=2; i<=x; i++) {
			dp[i] = dp[i-1]+1;
			if(i%2==0) 
				dp[i]= Math.min(dp[i/2]+1, dp[i]);
			if(i%3==0)
				dp[i]= Math.min(dp[i/3]+1, dp[i]);
			
		}
		
		System.out.println(dp[x]);
	}

}