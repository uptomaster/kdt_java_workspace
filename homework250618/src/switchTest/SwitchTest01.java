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
			case 1: // case 다음에 정수형 값을 넣었음. 1은 하나의 분기점
				System.out.println("선택한 숫자는 1.");// 만약 case1이라면 이 영역의 문장이 실행된다.
				break; // switch 문 종료
			case 2:// case 다음에 정수형 값을 넣었음. 2는 하나의 분기점
				System.out.println("선택한 숫자는 2."); // 만약 case2라면 이 영역의 문장이 실행된다.
				break; // switch 문 종료
			case 3:// case 다음에 정수형 값을 넣었음. 3은 하나의 분기점
				System.out.println("선택한 숫자는 3.");// 만약 case3이라면 이 영역의 문장이 실행된다.
				break; // switch 문 종료
			default:// case 다음에 정수형 값을 넣었음. 4는 하나의 분기점
				System.out.println("선택한 숫자가 없습니다.");// 만약 case4라면 이 영역의 문장이 실행된다.
				break; // switch 문 종료
				
		}
			
			switch(5) { // case 이름에 없는것을 넣으면 디폴트 케이스가 출력된다.
			case 1:// case 다음에 정수형 값을 넣었음. 1은 하나의 분기점
				System.out.println("선택한 숫자는 1.");
				break; // switch 문 종료
			case 2:// case 다음에 정수형 값을 넣었음. 2는 하나의 분기점
				System.out.println("선택한 숫자는 2.");
				break; // switch 문 종료
			case 3:// case 다음에 정수형 값을 넣었음. 3은 하나의 분기점
				System.out.println("선택한 숫자는 3.");
				break; // switch 문 종료
			default: // switch() 소괄호 안에 입력한 값이나 변수가 case의 종류에 없는경우 디폴트로 이동한다.
				System.out.println("선택한 숫자가 없습니다.");
				break; // switch 문 종료
			}		
	}

}
