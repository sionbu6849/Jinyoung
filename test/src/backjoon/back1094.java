package backjoon;

import java.util.Scanner;

public class back1094 {

	public static void main(String[] args) {
		stick();
	}
	public static void stick() {
		Scanner scn = new Scanner(System.in);
		int X = scn.nextInt();
		int Y = 64;
		int Z = 0;
		int C = 0;
		
		if(X==Y) {
			C++;
			System.out.println(C);}
		else {
			while(X!=Z) {
				if(Z<X) {
					Y = Y/2;
					Z += Y;
					C++;
				}else if(Z>X) {
					Z -=Y;
					Y = Y/2;
					Z += Y;	
				}
			}
			System.out.println(C);
			}	
	}

}
