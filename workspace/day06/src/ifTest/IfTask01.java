package ifTest;

import java.util.Scanner;

// 11번: if~else문 실습
public class IfTask01 { // 클래스 시작

	public static void main(String[] args) { // 메인 시작
		
		// 사용자로부터 숫자를 입력받아서 짝수인지 홀수 인지 출력하기
		// 로직구성
		// 1) 입력클래스 선언 import
		Scanner sc = new Scanner(System.in);
		
		// 2) 변수 1개 만들기
		int num1 = 0;
		
		// 3) 출력메시지 입력
		System.out.println("숫자를 입력하세요: ");
		
		// 4) 입력메소드 사용
		num1 = sc.nextInt();
		
		// 5) if~else문을 사용하여 짝수인지 홀수인지 출력
		if (num1 % 2 == 0) {// if 시작
			System.out.println("짝수 입니다.");// 조건식이 true일 때 실행
		}// if 끝
		else { // else 시작
			System.out.println("홀수 입니다"); // 조건식이 false일 때 실행
		}// else 끝
		
		// 삼항 연산자
		System.out.println((num1 % 2 == 0) ? "짝수입니다" : "홀수입니다" );
		// num 1 % 2 == 0 조건이 true 이면 짝수입니다, false 이면 홀수입니다 출력  
		
		// 해제
		sc.close();
		
		// 자료형들의 기본값
		// 정수 0, 실수0.0, 문자형 ' ', 문자열 "" or null, 논리형 false
		
	} // 메인 끝

} // 메인 시작
