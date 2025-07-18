package library02;

import java.util.ArrayList;
import java.util.List;

public class Member extends User {
	// 필드
	// 한 사람이 빌릴 수 있는 최대 권 수
	final static int MAX_BORROW = 7;
	// 현대 개인이 대출 중인 책 목록
	private List<String> bookNameList = new ArrayList<>();
	
	// 생성자
	public Member(String id, String password, String name) {
		super(id, password, name);
	}
	
	// 로그인 메소드 오버라이드 (id, pw 대조)
	@Override
	public boolean login(String id, String pw) {
		if (this.getId().equals(id) && this.getPassword().equals(pw)) {
			return true;
		} else {
			return false;
		}
	}

	// 책 빌리는 메소드
	public boolean borrowingBook(String title) throws MaxBorrowException {
		if (this.bookNameList.size() >= MAX_BORROW) {
			// 이미 7권의 대출 도서를 가지고 있을 때.
			// ( >= ) 연산자 대신 ( == ) 를 써도 되지만 혹시 몰라 이상으로 넣음.


			throw new MaxBorrowException("인 당 최대 " +MAX_BORROW +"권까지 대여 가능합니다." );

			// 대출 권수가 꽉 찼으므로 예외 넘겨주기
		} else {
			this.bookNameList.add(title);
			// 개인 대출 리스트에 도서 제목 추가
			return true;
		}
	}
	
	// 책 반납하는 메소드
	public boolean returningBook(String title) {
		if (this.bookNameList.contains(title)) {
			// 개인 대출 리스트에 반납할 책이 잘 있는 경우.ㅣ
			return this.bookNameList.remove(title);
			// 리스트에서 도서를 삭제. 정상적으로 삭제 시 true 반환.
		} else {
			// 혹시라도 개인 대출 리스트에 일치하는 책이 없는 경우
			return false;
		}
	}
	
	// 개인 대출 리스트 반환 메소드
	public List<String> getRentedBooks() {
		return this.bookNameList;
	}

}
