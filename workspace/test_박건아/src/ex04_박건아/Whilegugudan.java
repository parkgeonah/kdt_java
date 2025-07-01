package ex04_박건아;

public class Whilegugudan {
	public static void main(String[] args) {
		
		int dan = 1;
		int i = 2;
		
		while(dan <= 9) {
			 i = 2;
			while(i <=9) {
				System.out.printf("%d x %d = %2d ", i, dan, dan * i);
				i++;
				
			}System.out.println();
			dan++;
						
		}
	}
}
