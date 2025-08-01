package dto;

public class UserDTO {
//	CREATE TABLE TBL_USER(
//			USER_NUMBER NUMBER,
//			USER_ID VARCHAR2(100),
//			USER_PW VARCHAR2(100),
//			USER_NAME VARCHAR2(100),
//			USER_AGE NUMBER,
//			USER_GENDER CHAR(1) DEFAULT 'M' NOT NULL,
//			USER_BIRTH DATE,
//			CONSTRAINT PK_USER PRIMARY KEY(USER_NUMBER) 
//		);
	
	// DTO는 데이터를 전송하기 위한 목적으로만 사용된다. 
	// 다른 메소드나 로직같은 다른 기능은 넣지 않는다. (컬럼에 맞는 필드값으로만 들어간다.)
	// DTO의 모든 필드의 접근 제한자는 무조건 private이다.
	// getter, setter를 사용해서 값을 넣어주고 기본 생성자만 이용한다. 
	
	private int userNumber;
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private String userGender;
	private String userBirth;
	
	// 1. 모든 필드의 getter/setter를 만든다.
	// 객체에 저장된 값을 유연하게 수정하고 싶은 경우
	
	// 2. setter를 만들지 않고, 생성자로 필드를 초기화한다.
	// 객체에 저장된 값을 수정하지 못하게 막고 싶은 경우.
	public int getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserBirth() {
		return userBirth;
	}
	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}
	
	// toString() 오버라이딩
	// 객체에 저장된 값을 편하게 확인하기 위해 toString을 재정의한다.
	@Override
	public String toString() {
		return "UserDTO [userNumber=" + userNumber + ", userId=" + userId + ", userPw=" + userPw + ", userName="
	            + userName + ", userAge=" + userAge + ", userGender=" + userGender + ", userBirth=" + userBirth + "]";
	}
	
	
	
}
