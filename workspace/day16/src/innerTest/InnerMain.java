package innerTest;
// 26번: 내부클래스와 외부클래스의 객체화
public class InnerMain {
	public static void main(String[] args) {
		// 외부클래스의 객체 생성
		Outer outer = new Outer();
		System.out.println("외부 클래스의 참조 값 " + outer);
		System.out.println("외부 클래스의 데이터 값 : " + outer.var1);
//		System.out.println("외부 클래스의 데이터 값 : " + outer.var2); 
		// 외부클래스의 객체로는 내부클래스 멤버에 접근 불가
		
		// 내부클래스의 객체 생성
		// 내부클래스는 외부 클래스의 인스턴스를 통해 생성해야 한다!!!!!!!!!
//		Inner inner = new Innner();
		Outer.Inner inner = outer.new Inner();
		System.out.println(inner);
	}
}
