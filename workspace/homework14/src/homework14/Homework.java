package homework14;

public class Homework {
	public static void main(String[] args) {
		
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 7 - i; i ++) {
				System.out.print(" ");
			}
			for(int k = 0; k <(2*1)+1; k++) {
				System.out.println("*");
			}
			System.out.println();
		}
		
		int[] ar = new int[100];
		int sum = 0;
		for(int i = 1; i < ar.length; i++) {
			ar[i] = i + 1; 
			if(ar[i] % 2 == 0) {
				 sum += ar[i];
			}
		}
		System.out.println(sum);
		
		
		
		
		
		
	}
}
