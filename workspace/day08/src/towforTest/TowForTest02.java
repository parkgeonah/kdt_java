package towforTest;

import java.util.Scanner;

// 2번: 2행 3열 출력하기
public class TowForTest02 {
	public static void main(String[] args) {

		for(int i = 1; i <= 3; i++) {
//			System.out.println(); 
			for(int j = 1; j <= i; j++) {
				System.out.print("i = " + i + " j = " + j + " ");
//				System.out.print("*");
			}
			System.out.println();
		}
		// 사용자로부터 행과 열을 입력받아 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("행과 열을 입력하세요");
		int row = sc.nextInt();
		int col = sc.nextInt();
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= col; j++) {
//				System.out.print("i = " + i + " j = " + j + ", ");
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}
}
