package wrapperTest;

// 7번 : String 메소드
public class StringTest {
	public static void main(String[] args) {

		String msg1 = "안녕하세요";
		System.out.println(msg1.charAt(0));
		
		// indexOf()
		System.out.println(msg1.indexOf("안"));
		System.out.println(msg1.indexOf("h"));
		
		// split() 
		String msg2 = "안!녕!하!세!요!";
		System.out.println(msg2);
		System.out.println(msg2.split("!"));
		
		String[] ar = msg2.split("!");
		for(int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		
		// length()
		System.out.println();
		System.out.println(msg2.length());
		
		// strip()
		String msg3 = "       h e l l o    ";
		System.out.println(msg3); // 문자열의 첫글자와 마지막 글자 양쪽의 공백을 지운다.
		System.out.println(msg3.strip()); // 중간에 있는 공백은 사라지지 않는다.
		
		// substring(start index, end index)
		String msg4 = " 안녕하세요!! !!     ";
		System.out.println(msg4.length()); // 우선 길이부터 알아야함.
		System.out.println(msg4.strip()); // 공백을 먼저 제거해주면 더 간편하다.
		System.out.println(msg4.substring(1,6));
		System.out.println(msg4.strip().substring(1,6));
		
		
		// contains() : 해당 문자열이 포함되어있는지 여부를 true, false로 반환
		System.out.println(msg4.contains("하"));
		System.out.println(msg4.contains("하하하"));
		
		
		
	}
}
