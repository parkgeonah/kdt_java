package review;

public class Student extends Person{

	//필드
	private boolean stu;

	// 생성자
	public Student(String name, boolean stu) {
		super(name); // 부모의 생성자
		this.stu = stu;
	}

	// 메소드 오버라이딩
	@Override
	void introduce() {
		System.out.println(getName() + "은 학생입니다");
	}
	
	
	// 자식클래스의 메소드 추가
	void study() {
		System.out.println(getName() + "이 공부합니다");
	}

	// getter, setter
	// boolean의 필드일 경우 setter, getter 생성시  is + 필드명
	public boolean isStu() {
		return stu;
	}

	public void setStu(boolean stu) {
		this.stu = stu;
	}
	
	
}
