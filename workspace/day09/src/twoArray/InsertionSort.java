package twoArray;

import java.util.Arrays;

//7번 : 삽입정렬
public class InsertionSort {
   public static void main(String[] args) {
      
      int[] number = { 5, 2, 9, 1, 6 };
      System.out.println("초기배열 : ");
      
      for(int num : number) {
         System.out.print(num + " ");
      }
      System.out.println();
      
      for(int i = 1; i < number.length; i++) {
         int key = number[i]; // key에  number 1번째 인덱스를 저장
         int j = i - 1; //  j에 i - 1은 j가 0 번째 인덱스
         
         //key보다 큰 값을 오른쪽으로 이동
         while(j >= 0 && number[j] > key) { //j는 현재 0번째 인덱스 key는 i의 1번째 인덱스라 true
            number[j + 1] = number[j];	// j 1번째 인덱스에 j 0번째 인덱스 값을 저장
            j--; // j-- 0번째 인덱스
          
         }
         
         number[j + 1] = key; // key값을 j 1번째 인덱스에 저장
         System.out.println(i + "단계 : " + Arrays.toString(number));
      }
      System.out.println("정렬완료 : " + Arrays.toString(number));
   }
}














