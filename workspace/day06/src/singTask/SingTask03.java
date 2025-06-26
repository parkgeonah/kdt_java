package singTask;

import java.util.Scanner;

public class SingTask03 {

	public static void main(String[] args) {
//		4) 총 부른 곡 수에 따른 보너스 곡 지급
//		   5곡을 부르면 1곡 추가 제공
		
		// 로직 구성
		// 1)입력클래스 import
		Scanner sc = new Scanner(System.in);
		// 2)변수 선언
		int song = 0, bonus = 0;
		// 3)입력메시지 출력
		System.out.println("부를 곡 수를 입력하세요");
		// 4)입력메시지 사용
		song = sc.nextInt();
		// 5) 5곡 부를 경우에만 보너스곡 지급하기
		 bonus = song / 5;
		// )출력
		 System.out.println(song +"곡을 부르면 " + bonus + "곡 추가제공");
		// )스캐너 해제
		 sc.close();
	}

}
