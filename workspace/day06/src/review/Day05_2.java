package review;
// 2번: 과제 2
import java.util.Scanner;

public class Day05_2 { // 클래스 줄괄호 시작 영역

	public static void main(String[] args) { // 메인 중괄호 시작 영역
		/*
		 * 2. 이름과 나이를 입력받아 내년 나이를 출력하기 (nextInt()사용금지) 
		 * 클래스명 Day05_2
		 * 
		 * [입출력 예시] 
		 * 이름: 홍길동 
		 * 나이: 20 
		 * 홍길동님의 내년 나이는 21살 입니다 
		 * 만 나이는 19살 입니다.
		 */

		// 1)입력 클래스 import
		Scanner sc = new Scanner(System.in);
		// 2) 문자열 변수, 정수형 변수 1개 선언
		String name;
		int age;
		// 3) 입력 메시지
		System.out.println("이름입력 :");
		// 4) 변수 = nextLine(); 
		name = sc.nextLine();
		// 5) 입력메시지
		System.out.println("나이입력: ");
		// 6) 나이변수 = nextLine(); 형변환
		age = Integer.parseInt(sc.nextLine()); 
		// 7) 출력
		System.out.println(name + "님의 내년 나이는 " + (age +1) + "살입니다.");
		System.out.println("만 나이는 " + (age -2) + "살입니다.");
	} // 메인 중괄호 끝 영역

} // 클래스 중괄호 끝 영역
