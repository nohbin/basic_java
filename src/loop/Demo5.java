package loop;
/* 
 * for 문은 대단해요~
 */

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {

		// 1~10 까지 숫자의 합을 구하여라

//		for (int count = 0; count < 10; count++) 
//		{
//			System.out.println("hello");
//		}
//		
		// 컴퓨터가 1과 100 사이 숫자 중에서 임의로 한개를 선택
		// 내가 제시한 숫자가 컴퓨터보다 크면 크다 출력
		// 작으면 작다 출력

		boolean isMatch = true;

		int computer = (int) ((Math.random() * 100) + 1);
		System.out.println(computer);
		Scanner sc = new Scanner(System.in);

		while (isMatch) {
			System.out.println("숫자를 입력하세요 : ");
			int player = sc.nextInt();
			
			isMatch = (player !=computer);
			if (player > computer) {
				System.out.println("입력한 값이 큽니다.");
			} else if (player < computer) {
				System.out.println("입력한 값이 작습니다.");
			} else {
				
				System.out.println("you win!");
			}

		}

	}
}
