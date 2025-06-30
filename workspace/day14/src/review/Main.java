package review;
class Animal{
		//필드
		String name;
		int age;
		
		// 생성자
		public Animal(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		// 메소드
		// eat
		void animalEat(String food) {
			
			System.out.println(this.name + "이 " + food + "를 먹습니다");
		}
		
		// play
		void animalPlay() {
			System.out.println(this.name + "이 놀고 있습니다"  );
		}
		
		// sleep()
		void animalSleep() {
			System.out.println(this.name + "이 잠을 잡니다");
			
		}
		
		// sleep(int time)
		void animalSleep(int time) {
			System.out.println(this.name + "이 " + time + "에 잠을 잡니다");
		}
		
}


public class Main {
	public static void main(String[] args) {
		// 동쿨 클래스 작성
		// Animal 클래스 정의
		// 필드: 이름(name), 나이(age)
		// 생성자 매개 변수 2개 있는 생성자
		// 메소드
		// 	eat(String food), 이름이 음식을 먹습니다 출력
		// 	play() 	이름이 놀고있습니다 출력
		// sleep()  이름이 잠을 잡니다 출력
		// sleep(int time) 이름이 몇시에 잠을 잡니다 출력
		
		//  main메소드에서 객체 2개 만들고 모든 메소드 호출하기
		Animal ani1 = new Animal("멍멍이", 2);
		Animal ani2 = new Animal("야옹이", 3);
		
		ani1.animalEat("간식");
		ani1.animalSleep();
		ani1.animalSleep(10);
		ani1.animalPlay();
		
		ani2.animalEat("츄르");
		ani2.animalSleep();
		ani2.animalSleep(15);
		ani2.animalPlay();
		
		
	}
}
