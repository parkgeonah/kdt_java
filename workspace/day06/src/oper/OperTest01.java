package oper;
 // 3번: 관계연산자와 논리 연산자
public class OperTest01 { // 클래스 시작
	public static void main(String[] args) { // main 시작

			System.out.println("==========관계연산자=========");
			
			int num1 = 10, num2 = 20, num3 = 10; // 정수형 변수선언
			System.out.println(num1 + " > " + num2 + " : " + (num1 > num2));
			// num1이 num2보다 크다 false -> 10 > 20
			
			System.out.println(num1 + " < " + num2 + " : " + (num1 < num2));
			// num1이 num2보다 작다  true -> 10 < 20
			
			System.out.println(num1 + " >= " + num2 + " : " + (num1 >= num2));
			// num1이 num2보다 크거나 같다 false -> 10 >= 20
			
			System.out.println(num1 + " <= " + num2 + " : " + (num1 <= num2));
			// num1이 num2보다 작거나 같다 true -> 10 <= 20
			
			System.out.println(num1 + " == " + num2 + " : " + (num1 == num2));
			// num1과 num2가 같다 fasle -> 10 == 20 
			
			System.out.println(num1 + " != " + num2 + " : " + (num1 != num2));
			// num1과 num2가 같지 않다 true -> 10 == 20
			
			System.out.println(num1 + " == " + num3 + " : " + (num1 == num3));
			// num1과 num2가 같다 true -> 10 == 10
			
//			System.out.println(10 >= 10); // 10과 10은 크거나 같다
			
			System.out.println("\n=============논리연산자=============");
			System.out.println("and : 둘다 참이면 참(%%)"); // and연산자: 둘다 참이여야 ture 둘중 하나라도 거짓이면 false
			System.out.println(true && true);	// true 
			System.out.println(true && false);	// false
			System.out.println(false && true);	// false
			System.out.println(false && false);	// false
			
			System.out.println("\nor : 둘 중 하나라도 참이면 참(||)"); // or연산자: 둘중 하나라도 참이라면 true 둘다 거짓이면  false
			System.out.println(true || true);	// true
			System.out.println(true || false);	// true
			System.out.println(false || true);	// true
			System.out.println(false || false);	// false
			
			System.out.println("\nnot : 참이면 거짓, 거짓이면 참(!)");// not연산자: 참이라면 거짓 거짓이라면 참
			System.out.println(!true);	// false
			System.out.println(!false);	// true
			
			
	}// main 끝

}// 클래스 끝
