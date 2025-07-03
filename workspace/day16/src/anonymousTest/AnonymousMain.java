package anonymousTest;
// 29번 : 익명클래스 - 익명클래스메인

public class AnonymousMain {

	public static void main(String[] args) {
		InterA aa= new InterA() {

			@Override
			public void printText() {
				System.out.println("익명클래스에서 오버라이딩");
				System.out.println("수업끝!");
				
			}
			
		};
		System.out.println(aa);
		aa.printText();
	}
}
