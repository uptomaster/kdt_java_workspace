package scanner;

import java.util.Scanner;

// 6번 : 입력메소드 next(), nextLine()
public class ScannerTest02 {

	public static void main(String[] args) {
		
		// ctrl shift o
		Scanner sc = new Scanner(System.in);
		
//		sc.next();
//		sc.next(); // 입력값이 존재해야함. 입력할때까지 기다린다. 엔터를 계속 버퍼에 저장시킴.
//		sc.next(); // 엔터를 아무리 눌러도 종료 X

		/*
		 * nextLine() 은 하는일이 두가지이다.
		 * 1) 엔터 이전까지의 값을 가져온다.
		 * 2) 엔터를 임시 저장공간에서 지워준다(소모한다).
		 * 값을 입력하지 않고 엔터만 눌러도 nextLine()은 엔터를 소모하는일을 해야하므로
		 * 엔터를 없애고 할 일을 마친다.
		 * */
		sc.nextLine(); // 엔터만 눌러도 종료
		sc.nextLine(); // 엔터가 들어오면 버퍼에서 소모한다.
		sc.nextLine();
		
		
		sc.close(); // 입력이 끝나면 Scanner 객체를 종료하고 내부에서 사용했던 자원(메모리, 스트림 등)을 해제함.
//		sc.next(); // close()를 사용하면 이후로는 아예 사용불가.
//		Scanner sc1 = new Scanner(System.in); // System.in 이라는 하나의 InputStream인데 sc.close()가 System.in도 닫게된다.
		// 다시 new Scanner(System.in)을 사용하더라도, 이미 닫힌 스트림의 재사용이기 때문에 에러가 발생한다.
		// 따라서 close()는 입력을 모두 받고 난 후에, 마지막에 한번만 사용해야한다.
//		sc1.next();
		
		
		
	}

}
