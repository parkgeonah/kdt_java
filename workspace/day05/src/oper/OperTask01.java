package oper;

import java.util.Scanner;

// 13번 : 산술연산자 응용
public class OperTask01 {

	public static void main(String[] args) {
		// 코인노래방 프로그램
		// 사용자에게 금액을 입력받고 부를 수 있는 곡 수, 잔 돈을 출력
		// 금액 입력: 
		// [출력]
		// 3곡을 부를 수 있으며 잔돈은 100원입니다
		
		// 로직구성
		// 입력클래스 + import
		Scanner sc = new Scanner(System.in);
		// 금액 입력하세요 메시지 출력
		System.out.println("금액을 넣어주세요: ");
		
		// 정수형 변수 = 입력메소드()
		int money = sc.nextInt();
		
		// 상수 = 300
		final int PRICE = 300;
		// 정수형 변수2 = 변수 1 / 상수명
		int song = money / PRICE;
		
		// 정수형 변수3 = 변수 % 상수명
		int change = money % PRICE;
		
		// 출력
		System.out.println(song + "곡을 부를 수 있으며 잔돈은" + change + "원 입니다." );
		// 스캐너 닫기
		sc.close();
		
	}
}
