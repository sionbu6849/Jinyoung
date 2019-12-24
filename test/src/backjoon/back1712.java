package backjoon;

import java.util.Scanner;

public class back1712 {
	static int A,B,C;
	static int x,y;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		A = scn.nextInt();
		B = scn.nextInt();
		C = scn.nextInt();
		
		if(B>=C) {
			System.out.println(-1);
		}else
		BP2(A,B,C);
	}
	
	
	public static void BP(int a, int b, int c) {
	  
	  int flag= 0; int i=1;
	  
	  while(flag!=1) {
		  int z=0;
		  x = a+(b*i);
		  y = c*i; i++; z++;
			  if(x<=y) { 
				  flag=1;
			  } 
		  } System.out.println(i);
	  }
	 
	public static void BP2(int a, int b, int c) {

		int z;
		
		z = a/(c-b)+1;
		
		System.out.println(z);
	}
	
}
