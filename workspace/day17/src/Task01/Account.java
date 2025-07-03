package Task01;
// 2. 은행 계좌 프로그램
public class Account {
	public static void main(String[] args) {
		// 객체만들기
		Account at = new Account(5000);
		System.out.println("시작");
		// 예외처리
		try {
			at.withdraw(5000);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		
		at.deposit(5000);
	}
	
	

	// 필드
	 int balance;
	
	// 생성자
	 public Account(int balance) {
			this.balance = balance;
		}
	
	
	// 메소드
	// 출금 메소드 : withdraw 매개변수1개 => 잔액보다 출금 금액이 크다면 출금불가 예외 처리 / 현재 잔고는 0원입니다. 
    // 출금금액의 0원이 부족하여 출금이 불가합니다. 출력
	
	void withdraw(int money) throws NumberFormatException{
			if(money > balance) {
				throw new NumberFormatException();
			}else {
				balance -= money;
				System.out.println(money+"원 출금했습니다 현재잔고는: " + balance + "원입니다");
			}
		}
	
	
	//입금 메소드 : deposit 매개변수1개 => 잔액에 입급된 금액 추가 후 입금된 금액은 0원입니다. 현재 잔고는 0원입니다 출력
	
	void deposit(int money) {
		System.out.println("입금된 금액은: " + money +"원입니다 현재 잔고는: " + (money + balance) + "원 입니다" );
	}

	


	
}
