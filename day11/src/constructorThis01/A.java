package constructorThis01;

public class A {
	
	// 필드
	int num = 0;
	int num2 = 0;
	
	void method(int num) {
	    
	      System.out.println(this);
	      System.out.println("매개변수 num : "+ num);
	      System.out.println("필드의 num : "+ this.num);
	   }
}
