package ex03_이남혁;

@FunctionalInterface // 함수 인터페이스 어노테이션
public interface StringInter {

	// 문자열의 쉼표를 느낌표로 바꿔서 출력하는 프로그램(람다식 활용, 익명클래스 먼저 작성)

	String modify(String str); // 매개변수 o, 리턴값 o 
}

//문자열의 쉼표를 느낌표로 바꿔서 출력하는 프로그램(람다식 활용, 익명클래스 먼저 작성)
//인터페이스 : StringInter
//메소드   : String modify(String str);    매개변수 o , 리턴값 o      
