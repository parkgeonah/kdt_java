package review;

public class Person {
	// alt + shift + a : 그리드모드
	
	// 필드
	private String name;
	private int age;
	private String brith;
	
	// 생성자
	public Person(String name) {
		super();
		this.name = name;
	}

	// getter, setter
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBrith() {
		return brith;
	}

	public void setBrith(String brith) {
		this.brith = brith;
	}

	public String getName() {
		return name;
	}
	
	// 메소드
	void introduce() {
		System.out.println("이름 : " + this.name + "이고, 나이는 " + this.age + "살입니다.");
	}
	
	
	
}
