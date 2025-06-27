package burgerhomework;

public class Customer {
//	6. Customer      //고객 정보
//	필드
	   String name;
	   String address;
	   String phoneNumber;
	   
	   int[] orderNumberArr;
//	생성자
	   public Customer(String name, String address, String phoneNumber);
	   public Customer(String name, String address, String phoneNumber, int orderMaxCount);
//	메소드
	 String getPhoneNumber() {
		 // 고객 정보에 담긴 정보 중 전화번호 8자리를 string타입으로 반환하는 메소드
	 }
	 
	 String getOrderId() {
		 // 고객 정보에 담긴 정보 중 주문번호를 string타입으로 반환하는 메소드
	 }
	 
}
