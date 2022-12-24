package operator.statement;

import java.util.Scanner;

public class demo5 {

	public static void main(String[] args) {
		// 1.정수를 입력 받아서. 10의 자리와 1의 자리를 출력 하고 두 자리가 같으면 같다 다르면 다르다
		

//		System.out.println();

		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();
		
		if (point % 11 == 0) {
			System.out.println("10의 자리와 1의 자리는 같습니다");
		}
		else {
			System.out.println("10의 자리와 1의 자리는 같지 않습니다");
		}
		

//		System.out.println("금액을 지불하세요 : ");
		
//		2527 % 100 -> 27
//		27 / 10 -> 2
//		27 % 10 -> 7
		


	}

}
