package print;
// 10번 : 서식 문자의 옵션(printf())
public class PrintTest03 {

	public static void main(String[] args) {
		System.out.println("=====================");
		
		// 기본 형식 지정자
		System.out.printf("이름 : %s 나이 : %d\n", "이남혁", 25);
		System.out.printf("%d %f %s\n", 2025, 6.16, "흐림");
		
		//2025.6.16 날씨:흐림 으로 만들어보기.
		System.out.printf("%d.%.2f %s", 2025,6.16,"날씨:흐림");
		
		System.out.printf("\n%s %c", true, 'a');
		System.out.println();
		System.out.println("=====================");
		
		// 자릿수를 지정한 출력
		// %[왼쪽정렬 : - or 0][자릿수:n][.m]서식문자
		String subject = "java";
		System.out.printf("\n%10s", subject); // 10자리 기준 오른쪽정렬
		System.out.printf("\n%-10s", subject); // 10자리 기준 왼쪽정렬
		System.out.printf("\n%10s %05d", subject, 555); // 10자리 기준 왼쪽정렬, %05는 5자리기준 정렬, 빈자리는 0으로 채움. 단 문자열은 불가능.
		System.out.printf("\n%5s\n", "이남혁");
		
		System.out.println("=메뉴=======가격=============");
		// 상품명과 가격정렬
		System.out.printf("%-5s\t%5d원", "꼬북칩", 2500);
		System.out.printf("\n%-5s\t%5d원", "누네띠네", 3000);
		System.out.printf("\n%-5s\t%5d원", "껌", 800);
		
		
		
	}

}
