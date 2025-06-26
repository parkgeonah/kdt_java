package constructorThis03;

// 6번 : this() 자기자신의 생성자 호출
public class Person {

	// 필드
	String name;
	int age;
	String job;

	// 생성자

	// 기본 생성자
	public Person() {

	}
	// 이름을 매개변수로 받는 생성자
	public Person(String name) {
		this.name = name;
	}

	// 이름과 나이를 매개변수로 받는 생성자
	public Person(String name, int age) {		
		this(name);
		this.age = age;
	}

	// 이름과 직업을 매개변수로 받는 생성자
	public Person(String name, String job) {
		this(name);
		this.job = job;
	}

	// 이름과 나이와 직업을 매개변수로 받는 생성자
	public Person(String name, int age, String job) {	
		this(name, job);
		this.age = age;
	
	}

//	// 매개변수 2개 생성자
//	public Person(String name, int age) {
//		
//		this.name = name;
//		this.age = age;
//	}
//
//	// 매개변수 3개 생성자
//	public Person(String name, int age, String job) {
//		this(name, age);
//		this.job = job;
//	}
//	

	// 메소드
	// printInfo() 정보 출력

	void printInfo() {
		System.out.println("이름은: " + this.name + ", 나이: " + this.age + ", 직업: " + this.job + "입니다.");
		greet();
	}

	// greet() 000님 안녕하세요 출력
	void greet() {
		System.out.println(this.name + "님 안녕하세요.");
	}

}
