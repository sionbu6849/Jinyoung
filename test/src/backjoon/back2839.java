package backjoon;

import java.util.Scanner;

public class back2839 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int N = scn.nextInt();
		
		sugar(N);

	}
	
	public static void sugar(int n) {
		
		int x = 0;
		
		while(n>=0) {
			if(n%5==0) {
				System.out.println(n/5 + x);
				return;
			}else {
				n = n-3;
				x++;
			}
		}System.out.println(-1);
	}

}
