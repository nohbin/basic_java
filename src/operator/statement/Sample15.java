package operator.statement;

import java.util.Scanner;

/*
 *   동전을 3번 연속 던져 점수를 부여
 *   2번 연속 같은 면이 나오면 2점, 2번 연속 다른면이 나오면 1점
 *   첫번째 던졌을때는 점수가 없다,
 *   
 *   HHT = 2+2
 *   HHT 2+1
 *   HTH 1+1
 *   HTT 1+2
 *   THH 1+2
 *   THT 1+1
 *   TTH 2+1
 *   TTT 2+2
 */
public class Sample15 {

	public static void main(String[] args) {

		int score = 0;
		int coin1 = (int) (Math.random() * 2) + 1;
		int coin2 = (int) (Math.random() * 2) + 1;
		int coin3 = (int) (Math.random() * 2) + 1;

		System.out.println(coin1);
		System.out.println(coin2);
		System.out.println(coin3);

		if (coin1 == coin2)

			score += 2;
		else
			score += 1;

		if (coin2 == coin3)

			score += 2;
		else
			score += 1;

		System.out.println("점수는 : " + score);

//		System.out.println("문자열 3개를 연속으로 입력 H , T : ");
//		Scanner sc = new Scanner(System.in);
//		String strNum1 = sc.next();
//		String strNum2 = sc.next();
//		String strNum3 = sc.next();
//
//	
//		if (strNum1.equals(strNum2)) 
//			score += 2;
//		 else 
//			score += 1;
//		
//		if (strNum2.equals(strNum3)) 
//			score += 2;
//		 else 
//			score += 1;
//		
//		System.out.println(score);
//		

	}
}
