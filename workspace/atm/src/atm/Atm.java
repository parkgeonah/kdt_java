package atm;

public class Atm implements AtmInter{
	// 필드 
	int money;
	String menu = "\n1. 예금입금"
				+ "\n2. 예금출금"
				+ "\n3. 잔액조회"
				+ "\n4. 종료";
	int deposit;
	int balance;
	
	// 생성자
	
	
	
	// 인터페이스 추상메소드 오버라이딩 
	@Override
	public void deposit(int money)throws NumberFormatException{ // 예금 입금
		if(money < 0 ) {
			throw new NumberFormatException();
		}
		System.out.println(money + "원 입금했습니다");
		balance += money;
		System.out.println("잔액: " + balance +"원 입니다");
	}
	@Override
	public void withdrawal(int money) throws NumberFormatException{
		if(money < 0) {
			throw new NumberFormatException();
		}else if(money < balance){
		System.out.println(money + "원 출금했습니다");
		balance -= money;
		}else{
			System.out.println("잔액이 부족하여 출금 할 수 없습니다.");
			System.out.println("잔액: " + balance + "원입니다");
			}
		
		
	}
	
	// 잔액확인 메소드
	public void balance() {
		System.out.println(balance + "원입니다");
	}
	
	
	
	
	
}
