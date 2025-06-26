
package homewok08;

public class ArrayTask02 {

	public static void main(String[] args) {
		// 패키지 : homework08
		// 클래스 : ArrayTask01
		// 1. 100~1까지의 값을 배열에 넣고 출력

		// 로직구성
		// 배열 선언
		// 입력 for문에서 배열 값 넣기
		// 출력 for 문에서 배열 인덱스 값 출력
		
		int[] ar1 = new int[100];
		
		for(int i = 0; i < ar1.length; i ++) {
			ar1[i] = i + 1; 
		}
		for(int i = 0; i< ar1.length; i ++) {
			System.out.print(ar1[i]+ " ");
		}
	}

}
