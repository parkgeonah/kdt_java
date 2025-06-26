package array;

// 4번: 배열 index
public class ArrayTest02 {
	public static void main(String[] args) {
		
		// 어떤값을 넣을 지 알 때
		int[] ar1 = {1, 2, 3, 4, 5};
		System.out.println(ar1);
		// ar1 => stack 메모리에 잇는 참조변수(heap 메모리에 저장된 배열의 시작주소 => 참조 값)
		
		
		System.out.println(ar1[0]);
		System.out.println(ar1[1]);
		System.out.println(ar1[2]);
		System.out.println(ar1[3]);
		System.out.println(ar1[4]);
//		System.out.println(ar1[5]); //인데스 범위를 벗어나기때문에 오류발생
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//		at array.ArrayTest02.main(ArrayTest02.java:18)
		
		// 몇 칸 만들지 알 때
		int[] ar2 = new int[3];
		System.out.println(ar2); //[I@279f2327 heap 메모리에 저장된 시작주소값(참조값)을 담고있다
		System.out.println(ar2[0]);
		System.out.println(ar2[1]);
		System.out.println(ar2[2]);
//		System.out.println(ar2[3]);// 인데스 범위를 벗어나기 때문에 오류 발생
		
		
		
		int[] ar3 = null;
		System.out.println(ar3); // null
		
//		System.out.println(ar3[0]); // heap 메모리에 주소값이 저장되어있지 않아 오류 발생
		
	}
}
