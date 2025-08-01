package manage;

import java.util.Scanner;

public class User {

	// 필드
	Scanner sc = new Scanner(System.in);
	private int user_id; // 회원번호
	private String user_name; // 사용자 이름
	private String user_Email; // 사용자 메일

	public User() { // 기본생성자로 제작. 필드값은 getter, setter로 넣어줌
		super();
	}

	// setter, getter 메소드

	// 사용자 번호 반환
	public int getUser_id() {
		return user_id;
	}

	// 사용자 번호 설정
	public void setUser_id(int id) {
		this.user_id = id;
	}

	// 사용자 이름 반환
	public String getUser_name() {
		return user_name;
	}

	// 사용자 이름 설정
	public void setUser_name(String name) {
		this.user_name = name;
	}

	// 이메일 반환
	public String getUser_Email() {
		return user_Email;
	}

	// 이메일 설정
	public void setUser_Email(String email) {
		this.user_Email = email;
	}

	@Override // toString 오버라이딩
	public String toString() {
		return "==================================================\n"
				+ "[User_ID : " + getUser_id() + ", User_Name : " + getUser_name() + ", User_Email : " + getUser_Email() + "]\n"
				+ "==================================================\n";
	}

	@Override
	public int hashCode() {
		return this.user_id;

	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof User) {
			if (this.hashCode() == obj.hashCode()) {
				System.out.println("동일한 사용자입니다.");
				return true;
			} else {
				System.out.println("다른 사용자입니다.");
				return false;
			}
		} else
			return false;
	}

}

//사용자(User) 클래스

//[요구사항]
//1. 사용자 저장 : 회원번호, 사용자 이름과 이메일 주소 저장 => User클래스에 저장되어야한다
//2. 사용자 조회 : 특정 사용자의 정보를 이름으로 검색할 수 있어야한다
//3. 사용자 목록 : 시스템에 저장된 모든 사용자의 정보를 조회할 수 있어야한다
//4. 예외처리 : 사용자 정보 입력시 유효성 검사를 하고 잘못된 입력에 대해 예외처리를 해야한다
// (ex : 잘못된 이메일형식, 빈 이름 등)

//User 클래스 : 사용자번호(int id), 사용자 이름(String name) 과 이메일(String email)을 필드로 갖는다
