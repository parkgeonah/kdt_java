package interfacetest01;
// 8번: 인터페이스 구현 클래스
public class ClassA implements Inter{

	@Override
	public void method01() {
		System.out.println("mehtod1 오버라이딩!");
		
	}

	@Override
	public void method2() {
		System.out.println("method2 오버라이딩!");
		
	}
	
}
