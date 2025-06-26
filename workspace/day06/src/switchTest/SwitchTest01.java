package switchTest;
// 14번: switch문
public class SwitchTest01 { // 클래스 시작

	public static void main(String[] args) { // 메인시작
		
		String animal = "강아지"; // 문자열 변수 animal에 "강아지"값 저장  
		
//		switch ("강아지") {// switch(조건식){switch 영역
//		case "강아지": // 조건식이 강아지일 때 
//			System.out.println("선택한 동물은 강아지입니다"); // 출력 후
//			break; switch문 탈출
//		case "고양이" : // 조건식이 고양이일 때
//			System.out.println("선택한 동물은 고양이입니다"); // 출력 후
//			break; // 탈출
//		case "코알라" : // 조건식이 코알라일 때
//			System.out.println("선택한 동물은 코알라입니다"); // 출력 후
//			break; // 탈출
//		default: // 조건식이 fasle일 때
//			System.out.println("선택한 동물이 없습니다");// 출력 후
//			break; // 탈출
			
		switch(100) { // switch(조건식) { // switch 영역
		case 10: // 조건식이 10일 때
			System.out.println("10입니다"); // 10입니다 출력 후
			break; // 탈출
		case 50: // 조건식이 50일 때
			System.out.println("50입니다"); // 50입니다 출력 후
			break; // 탈출
		case 100: // 조건식이 100일 때
			System.out.println("100입니다"); // 100입니다 출력 후 
			break; // 탈출
		default: // 조건식이 false면 
			System.out.println("선택한 값이 없습니다."); // 출력 후
			break;// 탈출
		} // switch문 끝

	} // 메인 끝

} // 클래스 끝
