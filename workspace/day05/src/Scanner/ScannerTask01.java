package Scanner;

import java.util.Scanner;

// 9번  : 입력 메소드 실습1
public class ScannerTask01 {

	public static void main(String[] args) {
		// 1. 본인의 이름과 성별 입력받고 출력하기
		// 입력 예> 이름입력 :
		// 입력 예> 성별입력 :
		// 출력 예> 이름은 000이고 00입니다.
		
		// 로직구성
		// 1) 입력클래스 선언. + 입력클래스 import
		Scanner sc = new Scanner(System.in);
		
		
		// 2) 입력메시지 입력
		System.out.println("이름을 입력하세요: ");
		System.out.println("성별을 입력하세요: ");
		
		// 3)문자열 변수 선언 입력 입력메소드 사용
		String name = sc.next();
		String gender =sc.next();
		
		// 4) 결과 출력
		System.out.printf("이름은 %s이고, 성별은 %s 입니다.", name, gender);

	}

}
