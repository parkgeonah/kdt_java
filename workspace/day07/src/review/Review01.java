package review;

import java.util.Scanner;

// 3) 복습문제
public class Review01 {

	public static void main(String[] args) {
		// 사용자로부터 입력받은 숫자가 1부터 10까지의 숫자인 경우에만 해당 숫자의 제곱을 출력하고
		// 그 외 숫자를 입력시에는 잘못 입력했습니다 출력하기

		// 로직구성
		// 1. 입력클래스 선언 import
		// 2. 정수형 변수 만들기
		// 3. 입력메시지 출력
		// 4. 변수에 sc.nextInt();
		// 5. if문(변수1 > 0 && 변수1 < 11){
				// syso(변수1 * 변수1)
		//		}else{
				// syso("잘못입력했습니다)
				//}
		// 6. 스캐너 해제
		
		Scanner sc = new Scanner(System.in);
//		int num1 = 0;
//		System.out.println("1부터 ~ 10사이의 숫자만 입력해주세요: ");
//		num1 = sc.nextInt();
//		if (num1 > 0 && num1 < 11) {
//			System.out.println(num1 * num1 );
//		}else {
//			System.out.println("잘못 입력했습니다.");
//		}
//		
		// 문자열끼리의 비교는 관계연산자(==)를 사용하지않고
		// .equals() 메소드를 사용해서 비교한다!!!
		String data1 = sc.nextLine();
		String data2 = sc.nextLine();
		System.out.println(data1 == data2);
		System.out.println(data1.equals(data2));
		if(data1.equals(data2)) {
			System.out.println("두 문자열 같습니다");
		}else {
			System.out.println("두 문자열 같지 않습니다");
		}
		
		
		sc.close();
	
	}
}
