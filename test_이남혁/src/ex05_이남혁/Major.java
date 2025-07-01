package ex05_이남혁;

public enum Major{
		COMPUTER_SCIENCE("컴퓨터공학"), CYBER_SECURITY("정보보안학"), ARTIFICIAL_INTELLIGENCE("인공지능학");
		
		// 필드
		final String koreanName;
		// 생성자
		Major(String koreanName) {
			this.koreanName = koreanName;
		}
		// 메소드
		String getkoreanName() {
			return koreanName; 
		}
	
}
