package ifTest;

// 13번: if~if문, if~else if문차이 / if문 중첩 
public class IfTest04 { // 클래스 시작

	public static void main(String[] args) { // 메인 시작
		// if~if문 : 위의 조건식이 true라도 아래 if문의 조건식을 확인한다
		int num = 10, grade = 100;// 정수형 변수선언
		if (num > 5) {// if (조건식) { if문 시작
			System.out.println("num은 5보다 큽니다"); // 조건식이 true일 때 실행 false면 실행하지 않는다.
		}// if문 끝
		
		if (num > 3) {// if (조건식) { if문 시작
			System.out.println("num은 3보다 큽니다"); // 조건식이 true일 때 실행 false면 실행하지 않는다.
		}//if문 끝

		// if~else if문 : 위의 조건식이 true면 아래 잇는 조건식은 무시 된다
		if (num > 5) {// if (조건식) { if문 시작
			System.out.println("num은 5보다 큽니다"); // 조건식이 true일 때 실행 false면 실행하지 않는다.
		} // if끝
		else if (num > 3) {// else if (조건식2) { else if 영역
			System.out.println("num은 3보다 큽니다"); // 조건식 1이 flase이고 조건식2가 true면 실행
		}// else if 끝

		// if문 중첩
		// 90점 이상은 A, 100점은 만점으로 A 출력
//		if (grade == 100) {
//			System.out.println("만점으로 A");
//		}
//		else if(grade >= 90) {
//			System.out.println("A");
//		}
//		
		if (grade >= 90) {// if (조건식) { if문 시작
			if (grade == 100) {// if 중첩문 if문안에 다시 if문을 작성하여 if 중첩문을 사용 { if중첩문 영역
				System.out.println("만점으로 A"); // 조건식1과 조건식2가 모두 true일 때 실행 둘중 하나라도 false면 실행 x
			}// if 중첩문 끝
		}//if문 끝
		else {// else 영역
			System.out.println("a"); // 조건식 1일 경우에만 실행
		} // else 끝

	}// 메인 끝
}// 클래스 끝
