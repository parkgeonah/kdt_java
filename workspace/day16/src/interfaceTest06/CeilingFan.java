package interfaceTest06;
//23번: 어댑터클래스(메인클래스)
public class CeilingFan extends FanAdapter{

	@Override
	public void on() {
		System.out.println("천장 선풍기 on");
		
	}

	@Override
	public void off() {
		System.out.println("천장 선풍기 off");
	}



}
