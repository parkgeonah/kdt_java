package homewok08;

public class Gugudan03 {
	public static void main(String[] args) {
		// ) 3단씩 출력하기 Gugudan03
		//?
//		for(){
//		   //단제목 출력
//		   for(){
//		   }
//
//		   //곱셈계산결과
//		   for(){
//		      for(){
//		      }
//		   }
//		}
		
		
		
		// 로직 구성
		// 1. for(초기식 int i = 1;  i <=9; i++){
		//				단제목 출력
		//			}
		
		// 		2. for(초기식 int i = 1; i <= 9; i++){
		// 			3. 안쪽 for(초기식 int j = 2; j <= 9; j++){
		//				안쪽 for문 printf(ystem.out.printf("%d x %d = %2d\t", j, i, j * i );
		//					}
		//					
		for(int i = 2; i <=9; i++) {
			System.out.print(i + "단\t\t");
		}
		System.out.println();
	 	for(int i = 1; i <= 9; i++) {
	 		
	 		System.out.println();
	 		for(int j = 2; j <= 4; j++) {
	 		
	 			System.out.printf("%d x %d = %2d\t", j, i, j * i );
	 			
	 			for (int k = 5; k <= 7; k ++) {
	 				System.out.printf("%d x %d = %2d\t", k, i ,k*i);
	 			}
	 		}		
	 		
		
		
		
	}
}
}
