package backjoon;


public class back1075 {

	public static void main(String[] args) {
	
		int n = (int)(Math.random()*2000000000+100);
		int f = (int)(Math.random()*100+1);
		int i = 0;
		int j = 0;
		int x = n%f;									
		int y = n%f;									
		int temp = 0;
		int result = n%100;
		String result1 = String.format("%02d", result);
		
		if(n%f ==0) {
			System.out.println(result1);
		}else
			temp = n;
			while(x != 0) {	
				temp++;
				i++;
				x = temp%f;
			}			
			temp = n;
			while(y != 0) {
				temp--;
				j++;
				y = temp%f;
			}
		if (i>=j) {
			n = n-j;
		}else {
			n = n+i;
		}
		result = n%100;
		String result2 = String.format("%02d", result);
		System.out.println(n);
		System.out.println(f);
		System.out.println(result2);
	}
}

