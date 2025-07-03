package review;

public class Employee extends Person {

	// 필드 x
	
	// 생성자
	public Employee(String name) {
		super(name);
	}
	
	// 메소드 오버라이딩
	@Override
	void introduce() {
		System.out.println("저의 이름은 " + getName()+ "이고 회사원입니다");
	}

	// 메소드
	void work() {
		System.out.println("업무를 처리중입니다");
	}
	
}
