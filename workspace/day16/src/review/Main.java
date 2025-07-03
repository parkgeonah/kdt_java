package review;

public class Main {

	public static void main(String[] args) {
		Person p = new Person("홍길동");
		Student s = new Student("신짱구", true);
		Teacher c = new Teacher("최유리");
		Employee e = new Employee("김철수");
		printInfo(p);
		printInfo(s);
		printInfo(c);
		printInfo(e);
		
		
	}
	
	static void printInfo(Person p) {
		p.introduce();
		// 조건문(if~else if
		if(p instanceof Student) {
			((Student) p).study();
		}else if(p instanceof Teacher) {
			((Teacher) p).teach();
		}else if(p instanceof Employee) {
			((Employee) p).work();
		}
	}
	
}
