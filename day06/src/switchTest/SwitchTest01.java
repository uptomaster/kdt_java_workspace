package switchTest;
// 14번 : switch문
public class SwitchTest01 {

	public static void main(String[] args) {
		
//		String animal = "고양이";
//		
//		switch(animal) {
//		case "고양이":
//			System.out.println("선택한 동물은 고양이입니다.");
//			break;
//		case "강아지":
//			System.out.println("선택한 동물은 강아지입니다.");
//			break;
//		case "코알라":
//			System.out.println("선택한 동물은 코알라입니다.");
//			break;
//		default:
//			System.out.println("선택한 동물이 없습니다.");
//			break;
			
						
			switch(3) { // 소괄호 안에는 변수 또는 값을 넣을 수 있다.
			case 1:
				System.out.println("선택한 숫자는 1.");
				break;
			case 2:
				System.out.println("선택한 숫자는 2.");
				break;
			case 3:
				System.out.println("선택한 숫자는 3.");
				break;
			default:
				System.out.println("선택한 숫자가 없습니다.");
				break;
				
		}
			
			switch(5) { // case 이름에 없는것을 넣으면 디폴트 케이스가 출력된다.
			case 1:
				System.out.println("선택한 숫자는 1.");
				break;
			case 2:
				System.out.println("선택한 숫자는 2.");
				break;
			case 3:
				System.out.println("선택한 숫자는 3.");
				break;
			default:
				System.out.println("선택한 숫자가 없습니다.");
				break;
			}		
	}

}
