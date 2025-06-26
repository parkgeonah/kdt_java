package oper;

import java.util.Scanner;

// 삼항연산자 실습1
public class OperTask02 { // 클래스 시작

	public static void main(String[] args) { // 메인 시작
		// 두 수를 입력받아 비교
		// 크다, 작다, 같다가 각각 상황에 맞게 출력되도록 로직 구성
		// 1) 입력클래스 import
		Scanner sc = new Scanner(System.in); // 입력클래스 선언 import
		// 2) 입력메시지 출력
		System.out.println("숫자를 입력해 주세요: "); // 입력메시지 출력
		// 3) 변수 선언, 입력메소드 사용
		int num1 = sc.nextInt(); // 정수형 변수 선언 + 입력메소드 사용
		// 4) 입력메시지 출력
		System.out.println("숫자를 입력해 주세요: "); // 입력메시지 출력
		// 5) 변수 선언, 입력메소드 사용
		int num2 = sc.nextInt(); // 정수형 변수2 선언 + 입력메소드 사용
		// 6) 삼항연산자를 사용하여 출력 => 크다 / 작다 / 같다 가 출력되어야함
		// 조건식 ? 참일때의 값 : 거짓일때의 값;+
		// 조건식 ? 참일때의 값 : 조건식2 ? 참일때의 값: 거짓일때의 값;
		System.out.println(num1 > num2 ? "크다" : num1 == num2 ? "같다" : "작다");
		// num1이 num2보다 크면 크다 출력, 같으면 같자 출력, 작으면 작다 출력
		
		
		//2. 한개의 정수를 입력받아서 짝수인지 아닌지 출력하기
//		// 입력메시지 출력
//		System.out.println("\n숫자를 입력하세요: ");
//		// 변수 선언, 입력메시지 사용
//		int num3 = sc.nextInt();
//		// 출력
//		System.out.println(((num3 % 2) == 0 ) ? "짝수입니다" : "홀수입니다");
//		// 해제
		

		// 입력클래스
		// 정수형변수 1 개(입력메소드), 문자열변수 1개(삼항연산자, 산술연산자, 관계 )
		// 출력
		System.out.println("숫자 1개 입력: "); // 입력메시지 출력
		int number = sc.nextInt(); // 정수형 변수 선언 + 입력메소드 사용
		String result1 = (number % 2 == 0) ? "짝수입니다." :"짝수가 아닙니다"; 
		// 문자열 변수선언 
		// number을 2로 나누었을 때 나머지가 짝수면 짝수입니다, 홀수면 짝수가아닙니다를 result에 저장 
		System.out.println("입력한 숫자 " + number + " 는 " + result1 );
		// 입력한 숫자 number는 result 짝수이면 짝수입니다, 홀수면 짝수가 아닙니다 출력 
		
		
		sc.close(); // 스캐너 해제
	} // 메인 끝

} // 클래스 끝
