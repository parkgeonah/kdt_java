package ifTest;
// 12번: if ~else if ~ else문
public class IfTest03 { // 클래스 시작

	public static void main(String[] args) { // 메인 시작
		// 양수, 음수, 0인지 출력하기
		System.out.println("출력 시작"); // 출력
		
		int num = 10; // 정수형 변수 num에 10값 저장
		
		if (num > 0) {// if (조건식) { if문 시작
			System.out.println("양수입니다"); // 조건식이 true일 경우 출력
		}// if 끝
		else if(num < 0) { // else if (조건식2) { else if 영역
			System.out.println("음수입니다"); // 조건식1이 false이고 조건식2가 true일 때 출력
		} //else if 끝
		else {// else 영역
			System.out.println("0입니다"); // 위 조건식들이 모두 false일 때 출력
		}// else 끝
		
		if (num > 5 && num < 15){ // if (조건식) { if문 시작
			System.out.println("5보다 큽니다"); // 조건식이 true일 경우 출력
		}// if끝
		else if(num > 3) { // else if (조건식2) { else if 영역
			System.out.println("3보다 큽니다");// 조건식1이 false이고 조건식2가 true일 때 출력
		}// else if 끝
		else {// else 영역
			System.out.println(num);// 위 조건식들이 모두 false일 때 출력
		}// else 끝
		
		System.out.println("출력 끝"); // 출력
	} // 메인 끝

}// 클래스 끝
