package backjoon;

import java.util.*;


public class back15649 {
	static int m;
	static int n;
	static int a[];
	static boolean visit[]; 
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt(); 
		m = sc.nextInt(); 
		visit = new boolean[10]; 
		a = new int [10];
		DFS(0);
	}
	
	static void DFS(int x) { 

		if(x == m) {          
			for(int i=0; i<m; i++) { 
				System.out.print(a[i]+" ");
			}
			System.out.println("");
			return; 
		}
		for(int i =1;i<=n;i++) {
			if(visit[i]==true) 
				continue; 
			visit[i]=true;
			a[x]=i;
			DFS(x+1);
			visit[i]=false;
			
		}
	}
	
}