package Scanner;

import java.util.Scanner;

// 10번 : 입력클래스, 입력 메소드 실습 2
public class ScannerTask02 {

	public static void main(String[] args) {
		// 1. 줄 단위로 입력받아 출력하기(입력은 반드시 3번, 출력은 1번만 사용)
		// 입력  : 자바는
		// 입력2 : 객체지향
		// 입력3 : 언어입니다
		// [출력]
		// 자바는 
		// 객체지향
		// 언어입니다
		
		//로직 구성
		// 1) 입력 클래스 선언 + import
		Scanner sc = new Scanner(System.in);
		
		// 2) 입력메시지 입력
		System.out.print("입력1 :");
		System.out.print("입력2 :");
		System.out.print("입력3 :");
		
		// 3) 문자열 변수선언 + 입력메소드
		String name1 = sc.next();
		String name2 = sc.next();
		String name3 = sc.next();
		
		// 4) 결과 출력
		System.out.println(name1 + "\n" + name2 + "\n" + name3);
		
		
		
		// 2. 이름과 나이, 취미를 순서대로 입력받기(입력메소드 이름과 취미 nextLine()사용 나이는 next()사용)
		//	출력 시 printf 사용, 형변환 반드시 적용해서 출력할 것, + 덧셈연산자 사용
		
		// 이름 입력 : 홍길동					
		// 나이 입력 : 20
		// 취미 입력 : 여행
		// [출력]
		// 홍길동은 20살이고 취미는 여행입니다.
		// 홍길동은 2026년에 21살입니다.
		
		//) 로직 구성
		// 1) 입력메시지 입력
			System.out.println("이름 입력 :");
			System.out.println("나이 입력 :");
			System.out.println("취미 입력 :");
			
		// 2) 변수 선언 + 입력 메소드 사용 + 버퍼비우기
			sc.nextLine();
			String name = sc.nextLine();
			String hobby = sc.nextLine();
			String age = sc.next();
			
		// 3) 문자열 형변환
			int age1 = Integer.parseInt(age);
			
		// 4) 결과 출력
			System.out.printf("%s은 %d살 이고 취미는 %s 입니다.\n", name, age1, hobby);
			System.out.printf("%s는 2026년에는 %d살 입니다.", name, age1 + 1);
			
		// 5) 스캐너 닫기
		sc.close();
	}

}
