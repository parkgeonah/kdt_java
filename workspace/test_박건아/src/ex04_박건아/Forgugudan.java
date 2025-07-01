package ex04_박건아;

public class Forgugudan {

	public static void main(String[] args) {
		// 구구단 출력 for문
	
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%d x %d = %2d ", j, i, j*i);
			}
			System.out.println();
			}
		
		
		
	}
}
