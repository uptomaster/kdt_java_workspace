package array;

import java.util.Arrays;

// 7번 : 버블 정렬
public class BubbleSort {

	public static void main(String[] args) {
		int[] number = {5,2,9,1,6};
		
		for(int i = 0; i < number.length; i++) {
			boolean swap = false; // 교환 발생여부
			for(int j = 0; j < number.length-1; j++) {
				if(number[j] > number[j+1]) {
					// 두 요소 교환(swap)
					int temp = number[j];
					number[j] = number[j+1];
					number[j+1] = temp;
					swap = true; // 교환이 이루어짐
				}
			}
			System.out.println((i+1) + "단계 : " + Arrays.toString(number));
			// i = 0일때 j = 0
			if(!swap) {
				break;
			}
		}
	    System.out.println("정렬완료 : " + Arrays.toString(number));
	}

}
