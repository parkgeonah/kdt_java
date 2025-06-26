package towforTest;

public class Gugudan02 {
	public static void main(String[] args) {
			// 구구단 가로로 출력하기
		
		// 로직구성
		// for문 (초기식 i = 1; 조건식 i <= 9; 증감식 i++{
			// 안쪽 for문(초기식 j = 1; 조건식 j <= 9 증감식 j++
					// i*j 담을 변수
					// 안쪽 실행문 print
					// } 
					// 바깥쪽 실행문
					// println
			for(int i = 2; i <=9; i++) {
				System.out.print(i + "단\t\t");
			}
			System.out.println();
		 	for(int i = 1; i <= 9; i++) {
		 		
		 		System.out.println();
		 		for(int j = 2; j <= 9; j++) {
		 		
		 			System.out.printf("%d x %d = %2d\t", j, i, j * i );
		 			
		 		}		
		 		
		 		
		 		
		 	}
		
		
		
		
		
		
	
	}
}
