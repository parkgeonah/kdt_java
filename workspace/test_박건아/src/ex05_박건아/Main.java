package ex05_박건아;



public class Main {

	public static void main(String[] args) {
			// 짱구 출력 로직
			// 1. 객체생성 생성자 매개변수 값 입력
			// 2. 객체.name 객체.major로 호출
			// 3. 출력(총점 + 메소드호출 값넣기)
			// 4. 평균 + 객체.메소드 호출로 출력
		
			Student s1 = new Student("짱구" , "정보보안학"); // 
			System.out.println(s1.name + "님의 전공은 " + s1.major + "입니다");// 
			System.out.println("총점: " + s1.getTotalScore(90, 0, 100)); // 
			System.out.println("평균: "+s1.getAverageScore()); // 
			
			
			System.out.println("==========================================");
			
			// 철수 출력 로직
			// 1. 객체생성 생성자 매개변수 값 입력
			// 2. 객체.name 객체.major로 호출
			// 3. 출력(총점 + 메소드호출 값넣기)
			// 4. 평균 + 객체.메소드 호출로 출력
			
			Student s2 = new Student("철수 " , "컴퓨터공학");// 객체생성 생성자 매개변수 값 입력
			System.out.println(s2.name + "님의 전공은 " + s2.major + "입니다");// 객체.name 객체.major로 호출
			System.out.println("총점: " + s2.getTotalScore(100, 87, 73));// 출력(총점 + 메소드호출 값넣기)
			System.out.println("평균: "+s2.getAverageScore());// 평균 + 객체.메소드 호출로 출력
			
			System.out.println("===========================================");
			
			// 유리 출력 로직
			// 1. 객체생성 생성자 매개변수 값 입력
			// 2. 객체.name 객체.major로 호출
			// 3. 출력(총점 + 메소드호출 값넣기)
			// 4. 평균 + 객체.메소드 호출로 출력
			
			Student s3 = new Student("유리 " , "인공지능학");// 객체생성 생성자 매개변수 값 입력
			System.out.println(s3.name + "님의 전공은 " + s3.major + "입니다");// 객체.name 객체.major로 호출
			System.out.println("총점: " + s3.getTotalScore(89, 50, 20)); // 출력(총점 + 메소드호출 값넣기)
			System.out.println("평균: "+ s3.getAverageScore());// 평균 + 객체.메소드 호출로 출력
	
		
	}
}
