package practice;
//9번 : while문 활용한 합계 구하기
public class WhileTest02 {
   public static void main(String[] args) {
      //1부터 100까지 합 구하기(for문 이용)
      //1) 총합 구할 변수 선언
      //2) for문    (초기식    int i = 1
      //         조건식   i <= 100
      //         증감식   i++ 
      //3) 중괄호 영역
      //      총합구할변수 += i   총합구할변수 = 총합구할변수 값 + i
      //4) 출력
		int total = 0;
		for(int i = 1; i <= 100; i++) { // 초기값 i = 1, i = 100에 도달하면 중괄호 영역 수행 후 종료. i는 1씩 증가
			total += i;
		}
		System.out.println("방법1(for문) 1부터 100까지의 합 : " + total);
      
      //1부터 100까지의 합을 구하기(while문 이용)
      //1) 변수 선언 2개(총합구할변수, 비교대상 변수 0)
		int sum = 0, cnt = 0;
      //2) while문   (조건식    비교대상변수 < 100)
		while(cnt < 100) { //3) while중괄호영역
			cnt++;
			sum += cnt;
		}

      //      총합구할변수 += 비교대상변수
      //      비교대상변수 1증가
      //4) 출력
      
      
   }
}
