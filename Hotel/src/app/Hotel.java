package app;

import java.util.HashMap;

public class Hotel {

	// 호텔 정보
	String info = "1. 시그니엘 서울 (Signiel Seoul):\r\n"
			+ "롯데월드 타워에 위치한 6성급 호텔로, 아름다운 서울의 야경을 감상할 수 있습니다.\r\n"
			+ "2. 파크 하얏트 서울 (Park Hyatt Seoul):\r\n"
			+ "모던하고 세련된 디자인의 객실과 최고급 서비스를 제공하는 호텔입니다.\r\n"
			+ "3. 인터컨티넨탈 서울 코엑스 (InterContinental Seoul COEX):\r\n"
			+ "비즈니스 및 레저 고객 모두에게 적합한 호텔로, 코엑스 단지와 연결되어 있습니다.\r\n"
			+ "4. JW 메리어트 서울 (JW Marriott Seoul):\r\n"
			+ "럭셔리한 객실과 다양한 레스토랑, 스파 시설을 갖추고 있습니다.\r\n"
			+ "5. 글래드 강남 (GLAD Gangnam):\r\n"
			+ "트렌디하고 개성 있는 디자인의 객실과 합리적인 가격을 제공하는 호텔입니다.\r\n"
			+ "6. 레스케이프 호텔 (L'Escape Hotel):\r\n"
			+ "프랑스 파리의 분위기를 재현한 독특한 디자인의 부티크 호텔입니다.\r\n"
			+ "7. 노보텔 앰배서더 서울 강남 (Novotel Ambassador Seoul Gangnam):\r\n"
			+ "접근성이 좋고 다양한 객실 타입을 제공하는 비즈니스 호텔입니다.\r\n"
			+ "8. 임피리얼 팰리스 서울 (Imperial Palace Seoul):\r\n"
			+ "앤티크한 분위기의 객실과 고풍스러운 서비스를 제공하는 호텔입니다.\r\n"
			+ "9. 몬드리안 서울 이태원 (Mondrian Seoul Itaewon):\r\n"
			+ "이태원에 위치하며, 독특하고 예술적인 디자인을 자랑하는 호텔입니다.\r\n"
			+ "10. 코엑스 인터컨티넨탈 서울 (COEX InterContinental Seoul):\r\n"
			+ "코엑스 단지 내에 위치하여 비즈니스 및 전시 관련 고객에게 편리한 호텔입니다.  ";
	static HashMap<Integer, String> hotelInfo = new HashMap<>();
	hotelInfo.put(1, "시그니엘 서울 (Signiel Seoul)");
	// 예약 메소드
	
	// 호텔목록 생성 메소드
		private void initHotelList() {// 호텔이름 추가
			addHotel(1, "시그니엘 서울 (Signiel Seoul)");
			addHotel(2, "파크 하얏트 서울 (Park Hyatt Seoul)");
			addHotel(3, "인터컨티넨탈 서울 코엑스 (InterContinental Seoul COEX)");
			addHotel(4, "JW 메리어트 서울 (JW Marriott Seoul)");
			addHotel(5, "글래드 강남 (GLAD Gangnam)");
			addHotel(6, "레스케이프 호텔 (L'Escape Hotel)");
			addHotel(7, "노보텔 앰배서더 서울 강남 (Novotel Ambassador Seoul Gangnam)");
			addHotel(8, "임피리얼 팰리스 서울 (Imperial Palace Seoul)");
			addHotel(9, "몬드리안 서울 이태원 (Mondrian Seoul Itaewon)");
			addHotel(10, "코엑스 인터컨티넨탈 서울 (COEX InterContinental Seoul)");
		}
		
		private void addHotel(int hotelNumber, String hotelName) {
			
		}
	
	
	
}
