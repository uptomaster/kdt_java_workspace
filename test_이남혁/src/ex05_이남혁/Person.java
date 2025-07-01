package ex05_이남혁;

public class Person {

//	필드
    String name;
//생성자 : 이름을 매개변수로 받아 초기화
    public Person(String name) {
    	super();
    	this.name = name;
    }
    
//메소드 : 이름반환 메소드
    String getName() {
    	return this.name;
    }
}

