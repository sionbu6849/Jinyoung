package backjoon;

import java.util.Scanner;

public class back10250 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
		int T = scn.nextInt();
		
		for(int i=1; i<=T; i++) {
			ACM();
		}
	}
	
	public static void ACM() {
		
		int H = scn.nextInt();
		int W = scn.nextInt();
		int N = scn.nextInt();
		
		String[][] a = new String[H][W];
		String x;
		int y = 0;
		  for(int j=0; j<W; j++) { 
			  String ww = String.format("%02d", j+1);
			  for(int i=0; i<H; i++)  { 
				  String hh = Integer.toString(i+1);
				  a[i][j] = hh+ww;
				  y++;
				  if(y==N) {
					  x = a[i][j];
					  System.out.println(x);
					  return;
				  }
			 }
		  }		
	}
}
