package task01;
// 슈퍼클래스 Person
public class Person {

	// 필드
	String name;
	int age;
	
	// 생성자
	// 기본생성자
	public Person() {
		this("이름없음", 0);
	}

	// 매개변수 2개 있는 생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("Person 생성자 호출");
	}
	
//	 메소드
//		introduce 메소드 : 이름, 나이 출력하는 메소드
	void introduce() {
		System.out.println("이름은: " + this.name + ", 나이는: " + this.age);
	}
	
//		sleep 메소드 : 이름은 몇시에 잠을 잡니다 출력하는 메소드
	void sleep(int time) {
		 System.out.println(this.name +"은/는 " + time +"시에 잠을 잡니다.");
	}
	
	
	
	
}
