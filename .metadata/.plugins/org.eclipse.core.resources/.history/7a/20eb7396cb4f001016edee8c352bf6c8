package homework08;
// 6번 : A ~ F까지 중 C만 제외하고 배열에 담아 출력
public class ArrayTask06 {
	public static void main(String[] args) {
		// A B D E F
		// A~F중 C를 제외한 알파벳 5개를 담을 문자형 타입의 배열 선언 (5칸)
				char []arr = new char[5];
				
				// 반복문으로 A ~ F(C제외)를 각 인덱스에 맞게 넣어준다.
				for(char i = 65; i <= 70; i++ ) {
					if(i < 67) {
						// 만약 C 미만에 해당되면 (A,B는 여기에)
						arr[i-65] = i;
					}
					else if(i == 67){ // C라면 패스
						continue;
					}
					else {
						// D(68), E , F라면 여기에
						arr[i-66] = i;
					}
				}
				
				// 출력메세지
				System.out.printf("배열의 값 출력(A ~ F까지 중 C만 제외하고 배열에 담아 출력) : ");
				for(int i = 0; i < arr.length; i++) {
					System.out.printf(arr[i] + " ");
				}
				int a = 'z';
				System.out.println(a);
				
	} // main 종료
}
