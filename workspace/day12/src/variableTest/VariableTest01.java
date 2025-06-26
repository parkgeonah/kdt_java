package variableTest;
//4번 : 변수의 종류
public class VariableTest01 {
   
	// 필드
   int iVar = 10; // 인스턴스변수
   static int sVar; // 스태틱변수
   
   // 메소드
   // 인스턴스 메소드
   int localVar() {
      int lVar = 10; // 지역변수
      System.out.println("지역변수 lVar의 값 : " + lVar);
      return lVar;
   }
   
   // 인스턴스 메소드
   void parameterVar(int pVar) { // 매개변수
      System.out.println("매개변수 pVar의 값 : " + pVar);
   }
   
   // 인스턴스 메소드
   void intstanceVar() {
	   iVar += 5;
      System.out.println("인스턴스변수 iVar의 값 : " + iVar);
   }
   
   // 스태틱 메소드
   static void staticVar() {
      sVar = 100; // 스태틱 변수
      System.out.println("정적변수 sVar의 값 : " +  sVar);
      
      VariableTest01 vt1 = new VariableTest01();
      System.out.println("정적변수 sVar의 값(vt1) : " + vt1.sVar);
      VariableTest01 vt2 = new VariableTest01();
      System.out.println("정적변수 sVar의 값(vt2) : " + VariableTest01.sVar);
      
   }
   
   public static void main(String[] args) {
	   VariableTest01 vt = new VariableTest01();
	   int lVar = vt.localVar();
	   System.out.println(lVar);
	   vt.parameterVar(lVar);
	   
	   vt.intstanceVar();
	   vt.intstanceVar();
	   
	   VariableTest01.staticVar();
	   
   }
}
