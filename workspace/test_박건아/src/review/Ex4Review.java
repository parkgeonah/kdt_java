package review;

public class Ex4Review {

	  public static void main(String[] args) {
	      
//	      - for문 이용 (ForGugudan) 로직구성 필요없음
	      
	      for(int i = 1; i <= 9; i++) {
	         for(int dan = 2; dan <= 9; dan++) {
	            System.out.printf("%d x %d = %2d\t", dan, i, (dan*i));
	         }
	         System.out.println();
	      }
	      
	     // - while문 이용(WhileGugudan) 로직구성 필요없음
	      
	      //곱해지는 수 
	      int i = 1;
	      
	      while(i <= 9) {
	         int dan = 2; //단
	         while(dan <= 9) {
	            System.out.printf("%d x %d = %2d\t", dan, i, (dan * i));
	            dan++;
	         }
	         System.out.println();
	         i++;
	      }
	   }
	
}
