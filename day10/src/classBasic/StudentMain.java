package classBasic;
// 10-2번 : Student 클래스의 객체를 만들 클래스
public class StudentMain {
	public static void main(String[] args) {
		Student st1 = new Student();
		System.out.println(st1); // classBasic.Student@279f2327 : 패키지.클래스@주소값
		Student st2 = new Student();
		System.out.println(st2);
		
		// 객체명, 필드명 = 값;
		st1.name = "이남혁";
//		System.out.println(st1.name);
//		System.out.println(st2.math_Score); 
//		System.out.println(st2.name);
//		System.out.println(st2.avg_Score);
		
		st1.math_Score = 100;
		st1.eng_Score = 100;
		st1.kor_Score = 100;
		
		
		System.out.println(st1.getTotal());
		st1.avg_Score = st1.getTotal() / 3.0;
		System.out.println(st1.avg_Score);
		
		// st2 객체의 국어점수 100점, 영어점수 50점, 수학점수 77점
		// 메소드 호출하여 000님의 평균점수는 소수점한자리까지 출력하기.
		st2.name = "짱구";
		st2.math_Score = 77;
		st2.kor_Score = 100;
		st2.eng_Score = 50;
		st2.avg_Score = st2.getTotal() / 3.0;
		System.out.printf("%s님의 평균점수는 %.1f입니다.",st2.name, st2.avg_Score);
	}
}
