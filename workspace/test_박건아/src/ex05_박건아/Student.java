package ex05_박건아;

public class Student extends Person{
	// 필드
	int javaScore;
	int dbmsScore;
	int htmlScore;
	String major;
	
	
	
	// 생성자
	public Student(String name, String major) {
		super(name);
		this.major = major;
		
		
	}
	
	// 메소드
	
	// 총점반환하는 메소드
	// 로직구성 
	// 1. 반환타입 int 메소드명(정수형 매개변수1, 정수형 매개변수2, 정수형 매개변수3) <- 선언부
	// 2. 구현부
	// 3. 매개변수1로 전달받은 값을 javaSocre에 저장
	// 4. 매개변수2로 전달받은 값을 dbmsScore에 저장
	// 5.매개변수3로 전달받은 값을 htmlScore에 저장
	// 6. 정수형 변수에 총합 저장
	// 7. return 총합변수
	
	
	 int getTotalScore(int score1, int score2, int score3) {
		 
		 this.javaScore = score1; 
		 this.dbmsScore = score2; // 
		 this.htmlScore = score3; // 
		 
		 int totalScore = javaScore + dbmsScore + htmlScore;
		 
		 
		 return totalScore; 
		}
	 
	 // 점수평균 반환하는 메소드
	 // 로직구성
	 // 1. 반환타입 int 메소드명 매개변수 x -< 선언부
	 // 2. 구현부
	 // 2-1. 인스턴스 변수에 저장된 값을 총합하고 / 3 하여 평균점수변수에 저장
	 // 3. return 평균점수변수
	 
	 int getAverageScore() { 
		 int avgScore = (javaScore + dbmsScore + htmlScore) / 3; 
		 return avgScore; 
	 }
	
	 
	 // 학과 반환 메소드
	 // 로직구성
	 // 1. 반환타입 String 메소드명 문자열 매개변수 1 <- 선언부
	 // 2. 구현부
	 // 2-1. 전달받은 값을 인스턴스변수에 저장
	 // 3. return 인스턴스변수
	 
	 String getMajor(String major) {
		 this.major = major; 
		 return this.major;
	 }
	

}
