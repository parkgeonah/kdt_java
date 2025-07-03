package homework14;

public class Homework {
	public static void main(String[] args) {
		
//		//  별찍기
//		for(int i = 7; i >= 0; i--) {
//			for(int j = 0; j <  7 - i; j++) {
//				System.out.print(" ");
//			}
//			for(int k = 0; k <(2 * i) + 1; k++ ) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		
//		// 짝수만 더한값 출력
//		int[] ar = new int[100];
//		int sum = 0;
//		for(int i = 1; i < ar.length; i++) {
//			ar[i] = i + 1; 
//			if(ar[i] % 2 == 0) {
//				 sum += ar[i];
//			}
//		}
//		System.out.println(sum);
//		
//		
//		// 주사위 굴리기
//		int dice1 = (int)(Math.random() * 6) + 1; 
//		int dice2 = (int)(Math.random() * 6) + 1;
//		int count = 0;
//		
//		while(dice1 != dice2) {
//			count++;
//			dice1 = (int)(Math.random() * 6) + 1;
//			dice2 = (int)(Math.random() * 6) + 1;
//			System.out.println(dice1 + ", " + dice2 );
//			}
//		System.out.println(count);
//		
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j  < j + i; j++) {
//				System.out.print(" ");
//			}
//			for(int k = 0; k <(2*i ) +1; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		
		// 카드
		int arr[] = new int[100];
		int num = 0;
		
		for(int i = 0; i < arr.length; i++) { // 1부터 100까지의 숫자를 채움
			arr[i] = i + 1;
		}
		
		for(int i = 0; i < 10;  i++) {
			num = (int)(Math.random() * 100) + 1;
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] == arr[i]) {
					i--;
					num = (int)(Math.random() * 100) + 1;
				}
				System.out.println(num);
			}
			System.out.println();
		}
		
		
	}
}
