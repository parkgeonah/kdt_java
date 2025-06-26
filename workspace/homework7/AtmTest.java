package homework7;

import java.util.Scanner;

public class AtmTest {

	public static void main(String[] args) {
		// 6. ATM 메뉴에서 입금, 출금, 잔액조회 하기
//		[조건]
//				초기 잔액은 10000원으로 설정
//				메뉴 선택에 따라 작업 수행
//				종료시 프로그램 종료
//				숫자(번호)로 입력받기
//
//				String msg = "\n ATM 기기의 메뉴 중 번호를 선택하세요: "
//					+ "1. 잔액조회"
//					+ "2. 입금"
//					+ "3. 출금"
//					+ "4. 종료
//					+ "선택: ";
//				그 외의 번호 입력시 다시 선택하세요 출력 후 메뉴 보이기
//				번호 입력시 해당 메시지만 출력

		// 로직 구성
		// 입력클래스 import
		// 문자열 변수 선언
		// 실행할 번호를 선택하세요 출력
		// 변수 입력메소드
		// while문 작성

		Scanner sc = new Scanner(System.in);
		String msg = "\n ATM 기기의 메뉴 중 번호를 선택하세요: " + "1. 잔액조회" + "2. 입금" + "3. 출금" + "4. 종료" + "선택: ";
		int change = 10000, num = 0, i = 0;

		while (true) {

			System.out.println(msg);
			System.out.println("선택할 번호를 고르세요: ");
			num = sc.nextInt();
			if (num == 1) {
				System.out.println("잔액은" + change + "원입니다");
				continue;
			} else if (num == 2) {
				System.out.println("얼마를 입급하겠습니까? ");
				i = sc.nextInt();
				System.out.println(i + "원 입금하셨습니다. \n잔액은" + (change + i) + "원입니다");
				change = i + num;

			} else if (num == 3) {
				System.out.println("얼마를 출금 하겠습니까");
				i = sc.nextInt();
				System.out.println(i + "원 출금 했습니다 \n잔액은" + (change - i) + "원입니다");
				change -= i;
				continue;
			} else if (num == 4) {
				System.out.println("종료 했습니다");
				break;
			}
		}
	}

}
