package homework7;

import java.util.Scanner;

public class Review01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. 한개의 정수를 입력받아 짝수인지 홀수인지 출력하기
		// 로직구성
		// 입력받을 정수형 변수 1개 선언 
		// 숫자를 입력하세요 출력
		// 입력메소드 사용
		// 삼항연산자로 짝수면 짝수입니다 홀수면 홀수입니다. 출력 
		int num1 = 0;
		System.out.println("숫자를 입력하세요");
		num1 = sc.nextInt();
		System.out.println(num1 % 2 == 0 ? "짝수입니다": "홀수입니다" );
		
		//버퍼 비우기
		sc.nextLine();
		
		System.out.println("\n=====================================\n");
		//2. 한개의 정수를 입력 받아 양수, 음수, 0인지 출력하기
		// 로직구성
		// 조건문 if(조건식1){
		// }else if(조건식2){
		// }else{
		// }
		if(num1 > 0) {
			System.out.println("양수");
		}else if(num1 < 0) {
			System.out.println("음수");
		}else {
			System.out.println("0입니다");
		}
		
		// 버퍼비우기
		sc.nextLine();
		System.out.println("\n===========================================\n");
		// 3.나이를 입력받아서 다음 기준으로 출력하기
		// 로직구성
		// 입력받을 나이 변수 선언
		// 입력받을 메시지 출력
		// 나이변수 입력메소드 사용
		// if문작성 if(나이변수 <= 12){
		// 어린이입니다 출력}else if(나이변수 > 12 && 나이변수 <= 19{
		// 청소년입니다 출력}else{
		// 성인입니다 출력}
		
		int age = 0;
		System.out.println("나이를 입력: ");
		age = sc.nextInt();
		if(age <= 12) {
			System.out.println("어린이입니다");
		}else if(age > 12 && age < 20){
			System.out.println("청소년 입니다");
		}else{
			System.out.println("성인입니다.");
		}
		
		// 버퍼비우기
		sc.nextLine();
		
		System.out.println("\n===========================\n");
		
		// 4. 세 개의 정수를 입력받아 가장 작은 숫자부터 큰 숫자 순으로 정렬하여 출력하기
		// 로직구성
		// 입력받을 정수변수 3개 선언 큰값을 담아둘 변수 1개선언
		// 입력받을 숫자 메시지 출력 + 입력메소드 사용
		// while문 작성 while의무한루프를 걸어둔다
		// 
		int num2 = 0, num3 = 0, num4 = 0, smallNum = 0; 
		System.out.println("숫자1을 중복되지 않게 입력하세요: ");
		num2 = sc.nextInt();
		System.out.println("숫자2을 중복되지 않게 입력하세요: ");
		num3 = sc.nextInt();
		System.out.println("숫자3을 중복되지 않게 입력하세요: ");
		num4 = sc.nextInt();
		System.out.printf("입력한 숫자: %d %d %d\n", num2, num3, num4);
		while(true){
			if(num2 < num3) {
				smallNum = num2;
				num2 = num3;
				num3 = smallNum; 
			}
			if(num3 < num4) {
				smallNum = num3;
				num3 = num4;
				num4 = smallNum;
				}
			if(num2 > num3 && num3 >num4) {
				break;
			}
		}
		System.out.printf("정렬된 숫자 : %d %d %d\n" , num4, num3, num2);
		// 버퍼비우기
		sc.nextLine();
		System.out.println("============================\n");
		
		// 5. 사용자가 문자열을 입력받고 "x"만 입력했을 경우에만 종료 메시지 출력하고 그 외에는 입력한 문자열을 출력하기
		// 로직 구성
		// 입력받을 문자열 변수 선언
		// 입력받을 메시지 출력
		// 입력받을 변수 입력메소드
		// switch문으로 작성
		
		String name = "";
		System.out.println("문자를 입력해주세요");
		name = sc.next();
		switch(name){
		case ("x"):
			System.out.println("종료됩니다");
			break;
		default:
			System.out.println(name);
			break;
		}
		// 스캐너해제
		
		sc.close();
		
		
		
		
	
		
		
				
		
		
		
	}
}
