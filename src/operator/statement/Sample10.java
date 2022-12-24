package operator.statement;

import java.util.Random;
import java.util.Scanner;

/*
 * 가위 : 1 바위 : 2 보 : 3
 * 승자는?
 * 
 */
public class Sample10 {

	public static void main(String[] args) {
//		Math.random(); // 0~1 사이의 실수 출력
//		Math.random()*10; // 0~10사이의 실수 출력
//		int com = (int)(Math.random()*10)%3; // 0 1 2 사이의 실수 출력

		int com = (int) (((Math.random() * 10) % 3) + 1); // 1 2 3 사이의 실수 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("가위(1) 바위 (2) 보 (3) : ");
		int human = sc.nextInt();

		System.out.println("Player : " + human);
		System.out.println("computer : " + com);

//		if (human == 1) {
//			if (com == 1) {
//				System.out.println("Draw");
//			} else if (com == 2) {
//				System.out.println("Lose");
//			} else if (com == 3) {
//				System.out.println("Win");
//			}
//		}
//		if (human == 2) {
//			if (com == 2) {
//				System.out.println("Draw");
//			} else if (com == 3) {
//				System.out.println("Lose");
//			} else if (com == 1) {
//				System.out.println("Win");
//			}
//		}
//		if (human == 3) {
//			if (com == 3) {
//				System.out.println("Draw");
//			} else if (com == 1) {
//				System.out.println("Lose");
//			} else if (com == 2) {
//				System.out.println("Win");
//			}
//
//		}

		if (com == human) {
			System.out.println("Draw");
		} else if ((human % 3 + 1) == com) {
			System.out.println("lose");
		} else if ((human % 3 + 1) != com)
		{
			System.out.println("Win");
		}
	}
}
