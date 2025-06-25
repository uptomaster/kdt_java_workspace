package review;
// 복습 : 클래스
public class Song {

	// 필드
	String title = "";
	String artist = "";
	String album = "";
	
	
	
	// 메소드

	// 1. 정보출력 메소드
	void displayInfo() {
		System.out.println("노래 제목 : " + title);
		System.out.println("가수명 : " + artist);
		System.out.println("앨범발매일 : " + album);
	}
	
	
	// 2. 메인 메소드 
		// 1)=> 메인 메소드는 대표 클래스 안에 있어야한다.
		// 2)=> 대표 클래스는 public을 붙여서 사용한다.
		// 3)=> 대표 클래스 이름과 class 파일의 이름이 동일해야한다.
	public static void main(String[] args) {
		
		Song song = new Song();
		song.title = "Gangnam-Style";
		song.artist = "Psy";
		song.album = "2025-06-25";
		
		song.displayInfo();
		
	}

}
