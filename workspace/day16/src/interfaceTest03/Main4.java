package interfaceTest03;

class Parents{
	void parentsMethod(){
		System.out.println("Parents 클래스의 메소드");
	}
}

interface InterC{
	void interMethod();
	
}

interface InterD{
	void interMethod2();
}


class C extends Parents implements InterC, InterD{

	@Override
	public void interMethod2() {
		System.out.println("InterC 메소드 구현");
		
	}

	@Override
	public void interMethod() {
		System.out.println("InterD메소드 구현");
		
	}

	@Override
	void parentsMethod() {
		System.out.println("자식클래스 메소드에서 오버라이딩");;
	}
	
	


	
}

public class Main4 {
	public static void main(String[] args) {
		C obj = new C();
		obj.parentsMethod();
		obj.interMethod();
		obj.interMethod2();
	}

}
