package test;

import java.util.List;

import dao.UserDAO;
import dto.UserDTO;

public class Test {
	public static void main(String[] args) {

		// 연결 테스트

//		try {
//			Connection conn = DBConnector.getConnection();
//			conn.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}

		UserDAO userDAO = new UserDAO();
		UserDTO userDTO = new UserDTO();

		userDTO.setUserId("aaa");
		userDTO.setUserPw("1234");
		userDTO.setUserName("홍길동");
		userDTO.setUserAge(20);
		userDTO.setUserGender("M");
		userDTO.setUserBirth("20000101");
		System.out.println(userDTO);

		// 회원가입
		userDAO.join(userDTO);

		// 로그인
		System.out.println(userDAO.login("aaa", "1234"));

		// 사용자 아이디 찾기
		List<String> userIds = userDAO.findId("유리", "2017-01-01");
		userIds.forEach(System.out::println); // 스트림API

		// 회원정보 전체 수정
		userDTO.setUserId("updateTest");
		userDTO.setUserPw("123123");
		userDTO.setUserName("test");
		userDTO.setUserAge(20);
		userDTO.setUserBirth("19990901");
		userDTO.setUserNumber(16);
		// userDAO.update(userDTO);

		// 회원탈퇴
		if (userDAO.delete(1)) {
			System.out.println("탈퇴성공");
		} else {
			System.out.println("탈퇴실패");
		}

		// 아이디 중복검사
//		System.out.println(userDAO.checkId(userDTO.getUserId()));
//		System.out.println(userDAO.checkId("aaa"));

	}
}
