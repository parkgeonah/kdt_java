package inheritanceConstructor02;
//4번: 상속관계 - 생성자 확인 2
public class Main {
	public static void main(String[] args) {
		// 부모클래스의 객체생성
//		Car c1 = new Car();
		Car c2 = new Car("기아", "bleck" , 10000);
		System.out.println(c2);
		
//		c2.boosterOn();
		c2.enginStart();
		
//		SuperCar sc1 = new SuperCar();
		SuperCar sc2 = new SuperCar("BMW" , "남색", 150000, true);
		SuperCar bmw = new SuperCar(10000, true);
		SuperCar kia = new SuperCar("kia", "black", 10000, false);
		bmw.enginStart();
		kia.enginStop();
		
		
	}

}
