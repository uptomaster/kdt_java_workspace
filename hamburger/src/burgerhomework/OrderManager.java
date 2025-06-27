package burgerhomework;

public class OrderManager {
//	2. OrderManager   //관리시스템
//	필드
	int totalMoney; // 총 매출
	   
	   final int MAX_ORDER_COUNT; // 최대 주문 수
	   final int MAX_BURGER; // 한 주문서 당 최대 버거 수
	   int currentOrderCount; // 현재 누적 주문 수
	   PurchaseOrder[] purchaseOrderArr; // 주문서 배열
	   BurgerMenu[] burgerMenuArr; // 버거 종류 정보
	   final int MIN_ORDER_AMOUNT; // 최소 배달 주문 금액
	   int currentCustomerCount; // 현재 고객 수
	   Customer[] customerArr; // 고객 정보 배열
	   int orderCount; // 주문횟수
	   int orders[]; // 지금까지 주문한 고객들의 주문번호를 저장하는 배열.
	   int refundCash; // 환불금액
	   int orderId; // 발급할 주문번호
	   String phoneNumber; // 고객의 전화번호
	   boolean canRefund = false; // 환불이 가능한지 여부
//	생성자
	   public OrderManager() { //
		   
	   }
//	메소드
	   // 환불 // 주문서 삭제 // 고객에 있는 주문아이디 삭제 //이남혁
	   // 리턴타입 : boolean
	   // 매개변수 : String 고객구분값, int 주문번호
	   
	// 고객 조회 
	   // 리턴타입 : int 고객의 배열 인덱스 값
	   // 매개변수 : String 전화번호
	   int isExistCustomer(String phoneNumber, int orderId, Customer customer, Scanner sc) {
		   // 기존에 구매를 했던 고객인지 확인하는 메소드. 매개변수로 전화번호와 주문번호를 입력해서 확인
		   for(int i = 0; i < orderCount; i++) {
			   if(customer.getOrderId() == orderId && customer.getPhoneNumber == phoneNumber) {
				   
			   }
		   }
	   }
	   // 고객 등록
	   // 리턴타입 : boolean 추가성공여부 
	   // 매개변수 : Customer 고객정보
	   boolean addCustomer(Customer customer)

	   
	   void refund(Customer customer) {
		   // 기존에 존재하는 전화번호8자리와 주문번호와 일치하는지 확인
		   // 로그인 시 기존 고객리스트에 존재하면 진행, 존재하지 않다면 return{ // 환불을 원하는 고객의 주문번호, 전화번호8자리를 매개변수로 받음.
			// 주문서 찾기
			for (int i = 0; i < orderCount; i++) {
				if ((customer.getOrderId() == this.getOrderId()) && (customer.getPhoneNumber().equals(this.getPhoneNumber()))) {
					int refundCash = customer.getPrice();
					// 총매출 -= 해당환불금액
					totalMoney -= refundCash; // 총매출에서 환불금액만큼을 누적해서 뺌.
					
					// 주문서 삭제 (배열 당기기)
					for (int j = i; j < orderCount - 1; j++) {
						orders[j] = orders[j + 1];
					}
					orders[orderCount - 1] = null;
					orderCount--; // 환불 성공했으면 => 주문횟수 - 1
					canRefund = true;
					
					// 고객에게서 주문번호 제거
					for (Customer c : customer) {
						if (c.getPhoneNumber().equals(this.phoneNumber) && c.getOrderId().equals(this.orderId)) {
							// 
						}
					}
					System.out.printf("\"%s\"번 주문 환불이 완료되었습니다.", customer.getOrderId());
					return;
				}
				else return;
			}
			System.out.println("환불할 주문이 존재하지 않습니다.");
		}
	   
	   PurchaseOrder[] getPurchaseOrder(String phoneNumber) // 

		
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


