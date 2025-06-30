package gameTask;

public class Warrior extends Character{

	//  생성자
	public Warrior(String name, int maxHp, int maxMp, int nomalDmg, int skillDmg, int specialDmg) {
		super(name, maxHp, maxMp, nomalDmg, skillDmg, specialDmg);
	}

	// 메소드 오버라이딩
	@Override
	public void skillAttack() {
		// TODO Auto-generated method stub
		super.skillAttack();
	}

	@Override
	public void specialAttack() {
		// TODO Auto-generated method stub
		super.specialAttack();
	}
	
	// 전사 고유 메소드
	public void onlyWarrior() {
		System.out.println("전사만 사용할 수 있는 고유 행동입니다");
	}

}
