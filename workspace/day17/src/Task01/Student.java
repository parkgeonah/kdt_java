package Task01;

public class Student extends Person{

	// 필드
	private int score;

	// 생성자
	public Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}

	// 메소드 오버라이딩
	@Override
	public void score() {
		System.out.println(getName() + "의 점수는" + this.score + "점입니다");		
	}

	
	
	
	
}
