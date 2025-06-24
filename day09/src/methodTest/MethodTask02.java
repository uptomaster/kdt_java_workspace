package methodTest;

import java.util.Scanner;

public class MethodTask02 {

	public static void main(String[] args) {

		MethodTask02 mt = new MethodTask02(); // static 을 사용하지 않기때문에 클래스 객체를 만들어야함.
		Scanner sc = new Scanner(System.in);
		// 1번문제
		int num = 4;
		mt.checkNum(num);

		// 2번문제
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // 10칸짜리 정수형 배열 생성
		System.out.println(mt.getSum(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
		; // 이런식으로 new int[] 를 붙이면 매개변수내에서 만들수도있음.

		// 3번문제
		String str = "abcdefg";
		mt.reverseStr(str);
		mt.reverseStr(null);

		// 줄바꿈
		System.out.println();

		// 4번문제
		System.out.println(mt.contains(arr, 10));

		// 5번문제
		mt.printGugudan(3);

		// 6번문제
		mt.compareLength("이남혁", "혁남이a");

		// 7번문제

		String idd = "admin";
		int pw = 1234;
		mt.loginTry(idd, pw);
		
		// 7 - 1
		System.out.println(mt.loginTry2("sdafas", "sdaf"));
		System.out.println(mt.loginTry2("sdafas", "sdaf"));
		System.out.println(mt.loginTry2("sdafas", "sdaf"));
		System.out.println(mt.loginTry2("sdafas", "sdaf"));
		
		// 7 - 2
		int tryCount = 0;
		String id,  passwd, result; 
		
		while(true) {
			System.out.println("아이디 입력 : ");
			id = sc.nextLine();
			System.out.println("비밀번호 입력 : ");
			passwd = sc.nextLine();
			
			result = mt.loginTry3(id, passwd);
			
			if(result.equals("로그인 성공")) {
				System.out.println("로그인 성공");
				break;
			}
			else {
				tryCount++;
				if(tryCount >= 3) {
					System.out.println("3회 이상 실패로 계정 잠금");
					break;
				}
				System.out.println("로그인 실패");
			}
		}
		sc.close();
	} // main 종료

	// 1. 정수 1개를 받아서 짝수입니다/홀수입니다 변환하는 메소드 작성
	// 메소드명 : checkNum

	// 출력 메세지이므로 반환타입은 void
	void checkNum(int num) { // 매개변수로 정수 1개를 받음.
		System.out.println(num % 2 == 0 ? "짝수입니다." : "홀수입니다."); // 삼항연산자를 이용해서 짝수 홀수 판별해서 출력하기.
	}

	// 2. 10칸짜리 정수 배열을 받아서 총합을 계산후 반환하는 메소드
	// 메소드명 : getSum
	// 총합을 계산후 반환해야하므로. 반환 타입이 존재하며 int타입임.
	// 매개변수 o, 리턴타입 o => 값을 출력해야하므로 syso 출력문 안에 사용한다.
	int getSum(int[] arr) {
		int sum = 0; // 총합을 저장할 변수 선언
		for (int n : arr) {
			sum += n;
		} // for each 문으로 빠르게 요소들에 접근함.
		return sum; // 계산 된 총합을 반환함.
	}

//	 3. 문자열을 매개변수로 받아 거꾸로 뒤집어 반환하는 메소드
//	 메소드명 : reverseStr
//	 문자열을 받고 문자열을 출력하므로 반환 타입은 String
	void reverseStr(String str) {
		if (str == null) {
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char temp = ' '; // 빈 문자형 변수에 계속해서 매개변수 문자열의 뒷자리를 붙임.
			temp = str.charAt(str.length() - i - 1);
			System.out.print(temp + "");
		}
	}

	// 1) char[] 을 이용한 방식
	// 리턴타입 => void로 시작
	// 메소드명 => reverseStr1
	// 매개변수 => String str
	// 실행할문장 =>
	// 조건식(if문) str == null 이라면 그냥 return;
	// 문자형 배열 char[]

	// 2) 뒤에서부터 문자를 하나씩 더해서 새로운 문자열 만드는 방식
	// 리턴타입 => void
	// 메소드명 => reverseStr2
	// 매개변수 => String str
	// 실행할문장
	// 반복문 for문 => int i = str.length() - 1; i >= 0; i-- 작성.
	// 변수 += str.charAt(i);
	// return 변수
	// 리턴타입 String으로 변경
	String reverseStr2(String str) {
		String result = "";
		if (str == null) {
			return null;
		}
		for (int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		return result;
	}

	// 3) char [] 새로 만들어서 앞뒤 바꿔서 복사하는 형식
	// 리턴타입 => void
	// 메소드명 => reverseStr3
	// 매개변수 => String str
	// 실행할 문장 =>
	// 조건문 if str==null return null;
	// 정수형 변수 하나 선언. int len = str.length();를 담아준다.
	// 문자형 배열 char[] ch = new char[len];
	// 반복문 for => int i = 0; i < len; i++
	String reverseStr3(String str) {
		if (str == null) {
			return null;
		}
		int len = str.length();
		String result = "";
		for (int i = 0; i < len; i++) {
			char[] ch = new char[len];
			ch[i] = str.charAt(len - i - 1);
			result += ch[i];
		}
		return result;
	}

	// 4) 메소드를 이용하는 방식
	String reverseStr4(String str) {
		return new StringBuilder(str).reverse().toString();
	}

	// 4. 정수형 배열과 찾을 값을 매개변수로 받아서 배열에 존재하면 true를 반환하는 메소드.
	// 메소드명 : contains
	// 배열 요소 중에 10이라는 값을 반드시 넣고 10을 매개변수로 전달
	// syso(메소드명(배열명, 10)) => true
	// return 타입은 boolean타입.

	boolean contains(int[] arr, int value) {
		if (arr == null) {
			return false;
		}
//		for(int check : arr) { // for - each문 사용 예시
//			if(check == value) {
//				return true;
//			}
//		}
		for (int i = 0; i < arr.length; i++) { // 배열의 길이만큼 순회한다.
			if (arr[i] == value) { // 배열을 순차적으로 순회하면서 10을 발견하면
				return true; // true 반환
			}
		}
		return false; // 배열은 있는데 찾을값이 없다면 false
	}

	// 5. 단수를 매개변수로 받아서 해당 단의 구구단을(1 ~ 19)을 출력하는 메소드.
	// 메소드명 : printGugudan

	void printGugudan(int dan) {
		for (int i = 1; i <= 19; i++) {
			System.out.printf("%2d x %2d = %3d\n", dan, i, dan * i);
		}
	}

	// 6. 두개의 문자열을 입력받아서 두 문자열의 길이가 같으면 '길이가 같음'이라고 출력하고 다르면 '다름' 이라고 반환하는 메소드
	// 메소드명 : compareLength

	void compareLength(String str1, String str2) {
		if (str1.length() == str2.length()) {
			System.out.println("길이가 같음");
		} else {
			System.out.println("길이가 다름");
		}

//		return str1.length() == str2.length ? "길이가 같음" : "길이가 다름"; // 메소드의 리턴타입이 String일 경우 이렇게 사용.

	}

	// 7. 아이디와 비밀번호를 매개변수로 받아 검증, 시도횟수 3회 넘기면 잠금 반환
	// id : admin , pw : 1234 가 정답
	// 메소드명 : loginTry

	void loginTry(String id, int pw) {
		int fail_count = 0;
		while (true) {
			if (id == "admin" && pw == 1234) { // 유효한 아이디는 admin, 비밀번호는 1234라고 가정함.
				System.out.println("로그인을 성공했습니다.");
				return; // 올바르게 입력했다면 로그인 메세지 출력 후 while문 탈출
			} else {
				System.out.println("아이디 혹은 비밀번호가 다릅니다.");
				fail_count++;
				if (fail_count == 3) {
					System.out.println("3회 이상 틀려 잠금되었습니다.");
					break;
				}
			}
		}
		
	}
	
	// 메소드 밖에서 클래스 안에 변수 선언
			int tryCount = 0;
			
			String loginTry2(String inputId, String inputPw) {
				final String ID = "admin";
				final String PW = "1234";
				
				
				if(tryCount >= 3) {
					return "계정잠금";
				}
				if(ID.equals(inputId) && PW.equals(inputPw)) {
					tryCount = 0;
					return "로그인성공";
				}
				else {
					tryCount++;
					if(tryCount > 3) {
						return "계정잠금";
					}
					return "로그인실패";
				}
				
			}

			// 7번 문제 변형 (입력과 검증)
			String loginTry3(String inputId, String inputPw) {
				final String ID = "admin";
				final String PW = "1234";
				
				if(inputId == ID && inputPw == PW) {
					return "로그인성공";
				}
				else {
					return "로그인실패";
				}
			}
			
			
			
} // class 종료
