package homewok08;

public class ArrayTask03 {
	public static void main(String[] args) {
		// 클래스 : ArrayTask02
//		2. 1~10까지의 값을 배열에 넣고 총 합을 출력
		
		// 로직구성
		// 정수형 배열 선언
		// 입력할 for문 작성
		// 출력할 for문 작성
		
		 int[] ar = new int[10];
		 
		 for(int i = 0; i < ar.length; i ++) {
			 ar[0] = i + 1;
			 System.out.println();
		 }
		 for(int i = 0; i < ar.length; i ++) {
			 
			 int  result = ar.length + i + 1;
			 
			 System.out.println(result);
		 }
		 
//		 for(int i = 0; i < ar.length; i++) {
//		 }
//		
	}
}
