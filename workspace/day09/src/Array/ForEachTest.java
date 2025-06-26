package Array;
// 1번 : for~each문(빠른 for문, 확장for문)
public class ForEachTest {

	public static void main(String[] args) {
		// 1부터 5까지의 값을 담은 배열 선언
		int[] ar1 = new int[5];
		
		// 값을 대입하는 반복문
		for(int i = 0; i < ar1.length; i++) {
			ar1[i] = i + 1;
		}
		
		// 값을 출력하는 반복문
		for(int i =0; i <ar1.length; i++) {
			System.out.print(ar1[i]);
		}
		
		System.out.println();
		// for~each문
		int sum = 0;
		for(int num : ar1) {
//			System.out.println(num);
			sum += num;
			System.out.print(sum);
						
		}

	}

}
