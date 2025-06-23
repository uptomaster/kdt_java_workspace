package homework08;

// 3번 : 3단씩 출력
public class Gugudan03 {

	public static void main(String[] args) {
		
		// 1부터 3단까지 출력

		for(int k = 0; k < 3; k++) {
			
			for (int i = 1; i <= 9; i++) { // 가로 줄에 바뀌지 않는값은 i로 입력한다.
				
				for (int j = 1; j <= 3; j++) { // 단에 해당.
					System.out.printf("(%d x %d) = %2d\t", j, i + (k * 3), (i + (k * 3)) * j); // 한번 출력되면 탭키.
				}
				System.out.println(); // j루프가 한번 끝나면 다음줄로(다음단으로) 이동.
			}
			
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		for (int i = 1; i <= 9; i++) { // 가로 줄에 바뀌지 않는값은 i로 입력한다.
	
			for (int j = 1; j <= 3; j++) { // 단에 해당.
				System.out.printf("(%d x %d) = %2d\t", j, i, i * j); // 한번 출력되면 탭키.
			}
			System.out.println(); // j루프가 한번 끝나면 다음줄로(다음단으로) 이동.
		}

		System.out.println();

		// 4부터 6단까지 출력
		for (int i = 1; i <= 9; i++) { // 가로 줄에 바뀌지 않는값은 i로 입력한다.

			for (int j = 4; j <= 6; j++) { // 단에 해당.
				System.out.printf("(%d x %d) = %2d\t", j, i, i * j); // 한번 출력되면 탭키.
			}
			System.out.println(); 

			// 한 단이 끝나면 한 줄을 띄어주는 작업
		}
		
		System.out.println();
		
		// 7부터 9단까지 출력
		for (int i = 1; i <= 9; i++) { // 가로 줄에 바뀌지 않는값은 i로 입력한다.

				for (int j = 7; j <= 9; j++) { // 단에 해당.
					System.out.printf("(%d x %d) = %2d\t", j, i, i * j); // 한번 출력되면 탭키.
				}
				System.out.println(); 
			}
			
			System.out.println();
		} //main 종료
	}


// 로직구성
// 1 x 1 = 1	2 x 1 = 2	3 x 1 = 3 까지 출력하고 다음줄에
// 1 x 2 = 2	2 x 2 = 4	3 x 2 = 6 출력하고 다시 다음줄에 ....





