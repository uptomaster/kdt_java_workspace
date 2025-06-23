package oper;
// 8번 : 비트연산자를 이용한 암호화와 복호화
public class BitEncryption {

	public static void main(String[] args) {
		// 전달한 데이터(원본데이터)를 정수형 변수로 하나 만들자.
		int originalMsg = 42;
		// key
		int key = 99; // bit mask(암호화, 복호화에 사용) == 대칭키
		System.out.println("원본 메세지 : " + originalMsg); // 원본메세지 출력
		
		// 원본메세지가 보이지 않게 바꿔보자
		int encryptMsg = originalMsg ^ key; // 원본메세지와 키를 xor 연산을 이용하여 암호화.
		System.out.println("암호화된 메세지 : " + encryptMsg); // 암호화된 메세지 출력
		
		// 다시 원본메세지로 복호화
		int decryptMsg = encryptMsg ^ key; // 암호화된 메세지와 "동일한"키를 xor 연산하여 복호화 진행
		System.out.println("복호화된 메세지 : " + decryptMsg); // 복호화된 메세지 출력
		
		// XOR : 두 비트가 같으면 0, 다르면 1 반환
		
		
		
	}

}
