package lambdaTest02;

import lambdaTask.CombInter;

// 9번 람다 실습
public class LambdaMain {
	public static void main(String[] args) {
		
//		인터페이스명 : CombInter(함수형 인터페이스)
//		두 문자열을 입력 받아 연결하는 메소드를 만든다(명령문은 1줄)
//		메인 메소드에서 익명클래스로 객체화
//		메인메소드에서 람다식으로 객체화
		
		CombInter c = new CombInter() {
			
			@Override
			public void connection(String a, String b) {
				System.out.println(a + b);
			}
		};
		
		System.out.println(c);
		c.connection("럭키", "비키");
		
		// 1. 메소드 이름을 없앤다 ()뒤에 -> 붙인다
		// 2. 반환타입 추론 가능하므로 없앤다
		// 3. 매개변수 타입 추론 가능하므로 없앤다
		// 4. 매개변수가 2개이므로 ()생략 불가
		// 5. 명령문 1줄이므로 중괄호 ; 생략
		CombInter cI = (a,b) -> System.out.println(a + b);
		System.out.println(cI);
		cI.connection("언럭키", "비키");
		
		
	}
}
