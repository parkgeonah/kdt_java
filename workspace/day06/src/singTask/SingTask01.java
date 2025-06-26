package singTask;

import java.util.Scanner;


public class SingTask01 {

	public static void main(String[] args) {
		// 1) 한 곡당 금액도 입력받기
//		금액입력: 1000원
//		곡 당 가격 입력: 300
//		[출력]
//		3곡을 부를 수 있으며 잔돈은 100원입니다
		// 로직구성
		// 1) 입력클래스 import
		Scanner sc = new Scanner(System.in);
		
		// 2) 변수선언 
		int price = 300, money = 0, song = 0, change = 0;
		// 3) 입력메시지 출력
		System.out.println("금액을 넣어주세요: ");
		// 4) 변수 입력메소드사용
		money = sc.nextInt();
		// 5) 몇곡 부를 수 있고 잔돈 구하기
		song = money / price;
		change = money % price;
		
		// 6) 출력
		System.out.println(song + "곡 부를 수 있으며 잔돈은" + change + "원입니다");
		
		

//		2) 잔돈이 부족할 경우 안내하기
//		금액입력: 100
//		곡 당 가격 입력:
//		[출력]		
//		입력한 금액은 100원입니다. 곡 당 가격은 000원으로 000원이 부족하여 노래를 부를 수 없습니다 출력
		// 로직 구성
		
		// 1) 부족한 돈 구하기
		int result = price - money; 
		
		// 2) if ~ else문으로 작성
		if (price < money){ // if 조건식이 money가 price보다 크면
			System.out.println(song+ "곡 부를 수 있습니다 \n잔돈은" + change + "원입니다"); // 실행
		}else{ // money가 price보다 작으면 
			System.out.println("곡당 가격은" + price + "원으로 " + result+ "원이 부족하여 노래를 부를 수 없습니다."); // 실행
		}
		// 스캐너 해제
		sc.close();
	}

}
