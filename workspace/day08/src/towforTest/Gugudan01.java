package towforTest;

public class Gugudan01 {
	public static void main(String[] args) {
		// 단별로 세로로 출력하기 Gugudan01
		
		// 로직구성
		// 바깥for문 초기식 int i = 2; 조건식 i <= 9; 증감식 i++
			//안쪽 for문 초기식 int j = 1; 조건식 j <= 9; 증감식 j++{
					// i * j를 곱한 변수 선언
					//syso
					// 안쪽for문 }
		// 바깥for문 syso
		
		
		for(int i = 2; i <= 9; i++) {
			System.out.println(i+ "단");
			for(int j = 1; j <= 9; j++) {
				int num1 = i * j;
				System.out.println(i + "x"+ j  + " = " + num1 );
				
			}
			System.out.println();
		}
		
	}
}
