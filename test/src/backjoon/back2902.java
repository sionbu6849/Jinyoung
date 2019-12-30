package backjoon;

import java.util.Scanner;

public class back2902 {

	public static void main(String[] args) {
		asc();
		
	}
	public static void asc(){
		
		Scanner scn = new Scanner(System.in);
		String A = scn.next();
		
		String[] B = A.split("-");
		String C= "";

		for(int i=0; i<B.length; i++) {
			C += B[i].charAt(0);
		}
		System.out.println(C);
	}
	

}
