package homework09;

public class MethodTask02 {
			
   public static void main(String[] args) {
      
	   MethodTask02 mt = new MethodTask02();
      //1. 정수1개를 받아서 짝수입니다, 홀수입니다를 반환하는 메소드
      //메소드명 : checkNum
	   
	   System.out.println("========1번========");
	   System.out.println(mt.checkNum(5)); // syso(객체명.메소드명(인수));
      
      //2. 10칸짜리 정수 배열을 받아 총합을 계산하여 반환하는 메소드
      // 메소드명 : getSum
	   System.out.println("========2번========");
	   int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	   System.out.println(mt.getSum(ar));
	   
      //3. 문자열을 매개변수로 받아 거꾸로 뒤집어 반환하는 메소드
      //메소드명 : reverseStr
      // hello => olleh
	   System.out.println("========3번========");
	   
	   System.out.println(mt.reverseStr("hello")); // syso(객체명.메소드명(인수));
      
      //4. 정수형 배열과 찾을 값을 매개변수로 받아서 배열에 존재하면 true 반환하는 메소드
      //메소드명 : contains
      //배열 요소 중에 10이라는 값을 반드시 넣고 10을 매개변수로 전달
//      syso(메소드명(배열명, 10)) => true
      
	   System.out.println("========4번========");
	   int[] ar1 ={ 20, 5, 4, 7};
	   System.out.println(mt.contais(ar1)); 
	   
	   
      //5. 단수를 매개변수로 받아 해당 단의 구구단을(1 ~ 19)을 출력하는 메소드
      //메소드명 : printGugudan
      //   3 x 1 = 3
      //   ...
      //   3 x 19 = _
	   
	   
	   System.out.println("========5번========");
	   System.out.println(mt.printGugudan(6));
	   
      
      //6. 두개의 문자열을 입력받아서 두 문자열의 길이가 같으면 같음, 다르면 다름 반환하는 메소드
      //메소드명 : compareLength
      
	   System.out.println("========6번========");
	   
	   System.out.println(mt.compareLength("hello", "ollh"));
	   
      //7. 아이디와 비밀번호를 매개변수로 받아 검증, 시도횟수 3회 넘기면 잠금 반환
      //loginTry
      
   }
 //1. 정수1개를 받아서 짝수입니다, 홀수입니다를 반환하는 메소드
   //메소드명 : checkNum
   // 로직구성	
   //1. 기능생각 => 정수한개를 받아서 짝수면 짝수입니다, 홀수면 홀수입니다 반환 
   //2. 메소드명 chckNum
   //3. 리턴타입 String
   //4. 정수형 매개변수 1개
   //5. 구현부 삼항연산자를 이용하여 구현
  
   String checkNum(int num) {
	   
	  return (num % 2 == 0 )? "짝수": "홀수";
   }
   
 //2. 10칸짜리 정수 배열을 받아 총합을 계산하여 반환하는 메소드
   // 메소드명 : getSum
   // 로직구성
   //1. 기능생각 10칸짜리 정수 배열을 받아 총합을 계산해 반환하는 메소드
   //2. 메소드명 : getSum
   //3. 정수형 배열매개변수 1개 생성 
   //4. 구현부
   //5. for문작성(초기식 i = 0; 조건식 i < 배열.length; i++){
   //			실행기능 총합담을 변수 += ar[i];
   //			}
   //6. 리턴타입 반환 => int
   
   int getSum(int[] ar) {
	   int sum = 0;
	   for(int i = 0; i < ar.length; i++) {
		   sum += ar[i];
	   }
	   return sum;
   }
   
   //3. 문자열을 매개변수로 받아 거꾸로 뒤집어 반환하는 메소드
   //메소드명 : reverseStr
   // hello => olleh
   
   // 로직구성 
   // 1. 기능생각 => 문자열을 받아 거꾸로 뒤집어 반환하는 메소드
   // 2. 메소드명: reverseStr 
   // 3. String타입 매개변수 1개생성
   // 4. 문자열을 담아줄 변수 1개 생성 + 매개변수의 길이를 담을 정수형 변수 1개 생성
   // 5. for 문을 작성(초기식 int i = 0; i <= 정수형 변수; i++){
   //		실행 기능 문자열을 문자형으로 형변환 뒤 맨마지막부터 꺼내어 맨앞으로 담아준다.
   // 	 }
   // 6. return 문자열담은변수;
   // 7. 리턴타입 반환 => String
   
   String reverseStr(String name) {
	   String result = "";
	   int len = name.length();
	   for(int i = 0; i < len; i++) {
		   result = result + name.charAt(len - 1 - i); 
	   }
	   return result;
	   
   }
   
 //4. 정수형 배열과 찾을 값을 매개변수로 받아서 배열에 존재하면 true 반환하는 메소드
   //메소드명 : contains
   //배열 요소 중에 10이라는 값을 반드시 넣고 10을 매개변수로 전달
//   syso(메소드명(배열명, 10)) => true
   
   // 로직구성
   // 1. 기능생각 => 정수형 배열과 찾을 값을 매개변수로 받고 존재하면 true로 반환
   // 2. 메소드명 :contains
   // 3. 정수형 배열 매개변수를 만든다.
   // 4. for문작성 (초기식 i = 0; 조건식 i < ar.length; 증감식 i++)
   // 5. for문 안에 if 문을 작성하여 배열에 10들어가면 true반환 안들어가면 for문 밖에서 false반환
   // 6. 리턴타입은 true로 나와야 하기 때문에 boolean타입
   
   boolean contais(int[] ar) {
	   int num = 10;
	   for(int i = 0; i < ar.length; i++) {
		   
		   if(ar[i] == num) {
			   return true;
		   }
	   }
	   return false;
   }
		   
	 //5. 단수를 매개변수로 받아 해당 단의 구구단을(1 ~ 19)을 출력하는 메소드
	      //메소드명 : printGugudan
	      //   3 x 1 = 3
	      //   ...
	      //   3 x 19 = _
	   
	   // 로직구성
	   // 1. 기능생각 => 단수를 매개변수로 받아 해당 단의 구구단 출력하는 메소드
	   // 2. 메소드명 printgugudan
	   // 3. 정수형 매개변수를 만든다
	   // 4. for문을 통해 구구단을 만든다 (초기식 i = 1; 조건식 i <= 19; 증감식 i++)
	   //							
	   // 5. 리턴타입 반환 => 정수이기 때문에 int
	   
	   int printGugudan(int dan) {
		   
		    for(int i = 1; i <= 19; i++) {
		        System.out.println(dan + " x " + i + " = " + (dan * i));
		    }
		    return dan;
	   }


	 //6. 두개의 문자열을 입력받아서 두 문자열의 길이가 같으면 같음, 다르면 다름 반환하는 메소드
	      //메소드명 : compareLength
	   
	   // 로직구성
	   // 1. 기능생각 => 문자열을 입력받아 문자열의 길이가 같으면 같음, 다르면 다름 반환 메소드
	   // 2. 메소드명: compareLength
	   // 3. 2개의 문자열 매개 변수를 만든다
	   // 4. 삼항연산자를 이용하여 길이가 같으면 같음 다르면 다름 반환
	   // 5. 리턴타입 문자열 String
	   
	   String compareLength(String len, String len2) {
		   
		   return(len.length() == len2.length() ? "같음" : "다름");
		   
		   }
		   
		   
	 
	   }
	   
	    
		   
   
   

