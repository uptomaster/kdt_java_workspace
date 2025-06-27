package burgerhomework;

public class Practice {
	String phoneNumber;
	String hamburger;
	int price;
	int orderId;
	boolean isSet;
	String userAddress;
	boolean isDelivery;
	String msgIsSet;
	String msgIsDelivery;

	int orderCount;
	int [] orders = new int [100];
	
	// 주문 메소드
	int setOrderId() {
		Random rd = new Random();
		return this.orderId = rd.nextInt(1000);
	}

	void order(String phoneNumber, String hamburger, int price, int orderId, boolean isSet, boolean isDelivery,
			String userAddress) {
		System.out.println("주문번호 : " + this.orderId);
		if (this.isSet == true) {
			this.price += 1500;
			this.msgIsSet = "세트";
			System.out.println("세트메뉴를 선택하셔서 " + price + "원입니다.");
		} else {
			this.price = price;
			this.msgIsSet = "단일메뉴";
			System.out.println(price + "원입니다.");
		}
		if (isDelivery == true) {
			this.userAddress = userAddress;
			this.msgIsDelivery = "배달";
			System.out.println(userAddress + "로 배달 주문을 선택하셨습니다.");
		} else {
			this.msgIsDelivery = "포장";
			System.out.println("포장 주문을 선택하셨습니다.");
		}
		System.out.println(this.hamburger + "를 " + this.msgIsSet + "으로 " + this.msgIsDelivery + "주문하셨습니다.");
		orderCount++; // 주문 완료 시 주문횟수 1증가
	}
	
	// 환불 메소드
	// 주문 -> 1) 환불 => 총매출에서 환불금액만큼 뺌
	// 주문 -> 2) 판매완료 => 총매출에 주문금액 더하기
	// 햄버거의 종류는 5가지, 각 20개 씩으로 정하고, 모두 팔리면 장사는 종료되고 총 금액을 출력한다.
	// 환불은 햄버거가 모두 팔린 후, 금액을 일괄적으로 고객에게 환불하며 반품된 햄버거는 버려진다.
	void refund(int orderId, String phoneNumber) { // 환불을 원하는 고객의 주문번호, 전화번호8자리를 매개변수로 받음.
		// 주문서 찾기
		for (int i = 0; i < orderCount; i++) {
			if ((orders[i].getOrderId() == orderId) && (orders[i].getPhoneNumber().equals(phoneNumber))) {
				int refundAmount = orders[i].getTotalPrice();

				// 총매출 차감
				revenue -= refundAmount; // 총매출에서 환불금액만큼을 누적해서 뺌.

				// 주문서 삭제 (배열 당기기)
				for (int j = i; j < orderCount - 1; j++) {
					orders[j] = orders[j + 1];
				}
				orders[orderCount - 1] = null;
				orderCount--;

				// 고객에게서 주문번호 제거
				for (Customer c : customers) {
					if (c != null && c.getPhoneNumber().equals(phoneNumber)) {
						c.removeOrderId(orderId); // 이 메소드는 Customer 클래스에 있어야 함
					}
				}

				System.out.println("[" + orderId + "]번 주문 환불이 완료되었습니다.");
				return;
			}
		}

		System.out.println("환불할 주문이 존재하지 않습니다.");
	}

	// 주문고객의 주문 번호를 반환하는 메소드
	String getOrderId() {
		return Integer.toString(this.orderId); // getOrderId() 메소드를 호출하면 String타입의 주문번호 반환.
	}
	
	// 주문고객의 전화 번호를 반환하는 메소드
	String getPhoneNumber() {
		return this.phoneNumber;
	}
}
