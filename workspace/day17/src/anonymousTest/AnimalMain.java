package anonymousTest;

import java.nio.file.spi.FileSystemProvider;

// 2번 : 익명클래스 이용한 객체화
public class AnimalMain {
	public static void main(String[] args) {
		
		Animal cat = new Animal() {

			public void speak() {
				System.out.println("사달라냥");
				
			}
			
		};  // 내부클래스 중괄호 끝
		System.out.println(cat);
		// anonymousTest.AnimalMain$1@2ff4acd0 
//		 패키지명. 클래스명 $ 내부클래스 1 익명클래스
		
		Animal dog = new Animal() {

			@Override
			public void speak() {
				System.out.println("멍멍");
				
			} // 내부클래스의 메소드 중괄호 끝
			
		}; // 내부클래스 중괄호 끝
		System.out.println(dog);
		// anonymousTest.AnimalMain$2@5caf905d
		// 패키지명. 클래스명 $ 내부클래스 2 익명클래스
		
		cat.speak();
		dog.speak();
		
	} // 메인끝

}// 클래스 끝
