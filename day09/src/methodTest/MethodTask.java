package methodTest;

public class MethodTask {
   public static void main(String[] args) {
     
	   // 1번 문제 (음수 <-> 양수)
	   MethodTask mt = new MethodTask();
	   System.out.println(mt.changeSign(5.0));
	   System.out.println();
	   // 2번 문제
	   mt.printName("이남혁", 5);
	   System.out.println();
	   // 3번 문제
	   System.out.println(mt.changeNumber(75));
	   System.out.println();
	   // 4번 문제
//	   5개의 정수 중 평균을 반환하는 메소드
	   int[] arr = {1,2,3,4,5};
	   System.out.println(mt.getAvg(arr));
	   System.out.println();
	   // 5번 문제
//	   정수 배열 중 최대값과 최소값을 출력하는 메소드
	   mt.printMinMax(arr);
	   
	   System.out.println();
	   
	   // 6번 문제
	   char [] c_arr = {'B', 'a', 'C', 'D', 'e', 'z'};
	   mt.changeCase(c_arr);
	   System.out.println();
	   
	   // 7번 문제아이디와 비밀번호를 입력받아 로그인하기
	   mt.login("admin",1234);
	   System.out.println();
	  
	   
	   
	   
   } // main 종료
   
   //1. 음수를 양수로, 양수를 음수로 바꿔주는 메소드
   //매개변수o, 리턴값o
   //메소드명 : changeSign
   
   //로직구성
   // 매개변수와 리턴값이 존재하고 수를 반환하는 메소드
   double changeSign(double number) {
	   System.out.printf("음수를 양수로, 양수를 음수로 변환합니다.\n입력하신 수는 %f로, 변환한 값은 %f입니다\n", number, -number);
	   double result;
	   result = -number;
	   return result;
   }
	   
	   
   //2. 이름과 정수를 받아와서 정수만큼 이름을 출력하는 메소드
   //매개변수o, 리턴값o
   //메소드명 : printName
   
   //매개변수로 문자열 타입인 이름과 정수타입의 정수를 함께 매개변수로 받아내면된다.
   //리턴값은 이름을 출력하므로 void 타입아닌가?
   void printName(String name, int num) {
	   System.out.println("입력한 값만큼 이름을 반복해 출력합니다.");
	   for(int i = 0; i < num; i++) {
		   System.out.println(name);
	   } 
   }
   
   //3. 10이하의 숫자는 1로 10을 초과하는 숫자는 100으로 반환하는 메소드
   //매개변수o, 리턴값o
   //메소드명 : changeNumber
   
   //로직구성
   // if 조건문을 사용하던가 삼항연산자를 사용하던가 해서 숫자를 바꿔주면될듯
   // 일단 숫자를 반환하니까 int로
   int changeNumber(int num) {
	   int result = 0;
	   result = num > 10 ? 100 : 1;
	   return result;
   }
   
   //4. 5개의 정수 중 평균을 반환하는 메소드
   //매개변수o(배열), 리턴값o
   //메소드명 : getAvg
   
   // 배열을 매개변수로 받아내야함. 그 배열은 5칸의 정수형 배열.
   // 이 메소드에서 다섯개의 합을 받아낼 변수와 평균을 저장할 변수를 선언해야함
   // 평균은 실수값이 나올 수 있으므로 double 타입의 메소드
   double getAvg(int[] arr) {
	   int sum = 0;
	   double avg = 0;
	   for(int i = 0; i < 5; i++) {
		   sum += arr[i];
	   }
	   avg = sum / 5.0;
	   return avg;
   }
   
   //5. 정수 배열 중 최대값과 최소값을 출력하는 메소드
   //매개변수o(배열), 리턴값x
   //메소드명 : printMinMax
   // 정수 배열을 매개변수로 받아냄. 그 배열은 5칸이라고 가정
   // 메세지를 출력하는것이 함수의 리턴이므로 void
   
   void printMinMax(int[] arr) {
	   int max = 0;
	   int min = 0;
	   
	   max = arr[0];
	   min = arr[0];
	   
	   for(int i = 0; i < 5; i++) {
		  if(max < arr[i]) {
			  max = arr[i];
		  }
		  if(min > arr[i]) {
			  min = arr[i];
		  }
	   }
	   System.out.printf("배열의 최대값은 : %d, 최소값은 : %d입니다.", max, min);
   }
   
   
   
   //6. 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
   //예시 ) BanAnA => bANaNa
   //메소드명 : changeCase
   //매개변수와 반환값은 자유 => 단, 형변환 이용할것!
   
   // B는 아스키코드값이 66. b는 98 ...
   // 소문자(a~z) : 97 ~ 122
   // 대문자(A~Z) : 65 ~ 90
   
   void changeCase(char []arr) {
	   for(int i = 0; i < arr.length; i++) {
		   if('A' <= arr[i] && arr[i] <= 'Z' ) {
			   // 대문자라면 소문자로바꿔주기
			   arr[i] += 32;
		   }
		   else if('a' <= arr[i] && arr[i] <= 'z') {
			   arr[i] -= 32; // 소문자라면 대문자로 바꿔주기
		   }
		   else { // 이상한거 입력하면 다시 입력하라고 안내하기
			   System.out.println("다시 입력하세요.");
		   }
	   }
	   // 새롭게 변경된 배열 출력하기
	   for(int i = 0; i < arr.length; i++) {
		   System.out.print(arr[i]);
	   }
   }
   
   //7. 아이디와 비밀번호를 입력받아 로그인하기
   //매개변수o 리턴값o(리턴타입 boolean)
   //메소드명 : login
   //main 메소드에서 id가 admin이고 비밀번호가 1234이면 관리자님 환영합니다 출력
   //둘중하나라도 틀리면 다시 확인하세요 출력
   
   boolean login(String id, int pw) {
	   // true 조건으로 무한루프 만들기
	   while(true) {
		   System.out.println("id와 비밀번호를 입력하세요 : ");
		   if(id == "admin" && pw == 1234) { // 둘다 맞아야지만 while문 탈출가능함
			   System.out.println("관리자님 환영합니다.");
			   return true;
		   }
		   else { // 하나라도 틀리면 다시 입력하기
			   System.out.println("다시 확인하세요.");
		   }
	   }
   }
   
}
