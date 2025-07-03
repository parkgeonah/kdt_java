package Task01;

public abstract class Person {
	//필드
	private String name;
	private int age;
	
	//생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	// 점수입력받는 메소드
	public abstract void score();

	// getter메소드
	
	public String getName() {
		
		return name;
	}
	

	public int getAge() {
		return age;
	}

	
	
	
	

}
