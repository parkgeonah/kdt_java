package atm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AtmMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Atm atm = new Atm();
		boolean isTrue = true;
		int money = 0;
		try {

			while (isTrue) {
				System.out.println("실행할 번호를 선택하세요: " + atm.menu);
				int choice = sc.nextInt();

				switch (choice) {
				case 1:
					System.out.println("입금할 금액을 넣어주세요");
					try {
						atm.deposit(money = sc.nextInt());
						break;
					} catch (NumberFormatException e) {
						System.out.println("0원 이하는 입금할 수 없습니다");
						break;
					}
				case 2:
					System.out.println("출금할 금액을 입력하세요");
					try {
						atm.withdrawal(money = sc.nextInt());
						break;
					} catch (NumberFormatException e) {
						System.out.println("0원 이하는 출금할 수 없습니다.");
					}
				case 3:
					atm.balance();
					break;
				case 4:
					System.out.println("프로그램을 종료합니다");
					return;
				default:
					System.out.println("번호를 다시 입력하세요");
					break;

				}
			}

		} catch (InputMismatchException i) {
			System.out.println("숫자를 입력해 주세요");
		}

	}
}
