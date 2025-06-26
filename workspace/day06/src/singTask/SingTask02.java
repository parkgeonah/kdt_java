package singTask;

import java.util.Scanner;

public class SingTask02 {

	public static void main(String[] args) {
		
//		3) 남은 금액으로 음료 구매 가능 여부 추가(한 곡당 금액 200원, 음료 금액은 100원)
//		금액입력: 1000
//		[출력]
//		5곡을 부를 수 있으며 잔돈은 0원입니다
//		음료를 마시싶으면 4곡을 부를 수 있으며 잔돈은 100원입니다
		
		// 로직 구성
		// 1) 입력클래스 import
		Scanner sc = new Scanner(System.in);
		// 2) 변수 선언
		int price = 200, song = 0, change = 0, money = 0, drink = 100;
		// 3) 입력 메시지 출력
		System.out.println("금액을 입력해 주세요: ");
		
		// 4) 지불 금액당 곡수, 잔돈 구하기
		money = sc.nextInt();
		song = money / price;
		change = money % price;
		// 5) 출력
		System.out.println("곡당 가격: " + price + "원\n지불금액: " + money + "원\n" + song + "곡 부를 수 있으며\n잔돈은 " + change + "원 입니다."); // 내용 1 출력
		
		// 6) 음료가 마시고 싶을 때 부를 수 있는 곡과 잔돈 구하기
		int song1 = (money - drink) / price;
		int change1 = (money - drink) % price;
		
		// 7) 음료가 마시고 싶을 때의 if문 작성
		if (drink <= money) { // money가 drink보다 크거나 같으면
			System.out.println("\n음료가 마시고 싶을 때 " + song1 + "곡 부를 수 있으며, \n곡당 가격: " + price 
					+ "원, \n음료가격: " + drink +"원 입니다, \n잔돈은" + change1 + "원 입니다."); // 해당코드 실행
			}
		
		// 7) 스캐너 해제
		sc. close();
		
	}

}
