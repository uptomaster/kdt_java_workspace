package variableTest;
//4번 : 변수의 종류
public class VariableTest01 {
   
	//필드
   int iVar = 10; // 인스턴스 변수
   static int sVar = 50; // 스태틱 변수
   
   //메소드
   //인스턴스 메소드
   void localVar() {
      int lVar = 10; // 지역변수
      System.out.println("지역변수 lVar의 값 : " + lVar);
   }
   
   //인스턴스 메소드
   void parameterVar(int pVar) { // pVar : 매개변수
      System.out.println("매개변수 pVar의 값 : " + pVar);
   }
   
   // 인스턴스 메소드
   void instanceVar() {
	   iVar += 5;
      System.out.println("인스턴스변수 iVar의 값 : " + iVar);
   }
   
   // 정적 메소드
   static void staticVar() {
      sVar = 100; // 정적변수
      System.out.println("정적변수 sVar의 값 : " +  sVar);
      
      VariableTest01 vt1 = new VariableTest01();
      System.out.println("정적변수 sVar의 값(vt1) : " + vt1.sVar);
      VariableTest01 vt2 = new VariableTest01();
      System.out.println("정적변수 sVar의 값(vt2) : " + VariableTest01.sVar);
      
   }
   
   public static void main(String[] args) {
      VariableTest01 vt = new VariableTest01();
      vt.localVar(); // 지역변수 호출 메소드
//      System.out.println(lVar); // 지역변수는 해당 메소드 안에서만 유효하다.
      // void localVar()의 구현과 선언을 int localVar(){return lVar;)를 사용하는 방식으로 리턴하면 값을 외부에서도 호출할 수 있다.
      vt.parameterVar(sVar);
      
      vt.instanceVar();
      vt.instanceVar();
      
      VariableTest01.staticVar();
      
      
   }
}
