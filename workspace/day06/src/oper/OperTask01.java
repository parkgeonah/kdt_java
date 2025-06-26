
package oper;

import java.util.Scanner;

// 4번 : ~논리연산자까지 복습 문제
public class OperTask01 {

	public static void main(String[] args) {
		
		// 사용자가 입력한 값을 3개를 서료 비교하기
		// nextInt() 사용, 변수를 먼저 만들고 진행할 것!
		// 변수 만들 때 의미있는 문자로 사용
		// 로직구성부터!
		
		// 로직
		// 1) 입력메소드 선언 import
		Scanner sc = new Scanner(System.in);
		// 2) 정수형 변수 2개 만들기
//		int score1, score2;
//		// 3) 입력메시지 입력
//		System.out.println("점수1을 입력하세요: ");
//		// 4) 변수1 nextInt()
//		score1 = sc.nextInt();
//		// 5) 입력메시지 입력
//		System.out.println("점수2를 입력하세요: ");
//		// 5) 변수2 nextInt()
//		score2 = sc.nextInt();
//		// 5) 서로 비교하여 결과 출력
//		System.out.println(score1 + " > " + score2 + " : "+ (score1 > score2));
//		System.out.println(score1 + " < " + score2 + " : " + (score1 < score2));
//		System.out.println(score1 + " >= " + score2 + " : " + (score1 >= score2));
//	    System.out.println(score1 + " > " + score2 + " || " + score1 + " == " + score2 + " : " + (score1 > score2 || score1 == score2));
	      
		// ) 해제
//		sc.close();
		
		// 입력메시지출력(숫자 2개를 입력(띄어쓰기로)
		// syso("숫자 2개를 띄어쓰기로 구분하여 입력하세요: ")
		// score1 = sc.nextInt();
		// score2 = sc.nextInt();
		// syso

		
		// 실수 관계연산자 사용\
		double num3,num4;
		System.out.println("실수 2개를 띄어쓰기로 구분하여 입력하세요 : ");
		num3 = sc.nextDouble();
		num4 = sc.nextDouble();
		System.out.println(num3 + " < " + num4 + " : " + (num3 < num4));
		
		// 0.00000001 0.0000000001 
		// 1.0E-8 < 1.0E-10 : false
		// 1.0E-8 10의 -8제곱(소수점아래 8자리)
		// 1.0E-10 10의 -10제곱(소수점아래 10자리)
		
		}

}
