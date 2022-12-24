package operator.statement;

import java.util.Scanner;
/*
 * 야구 게임 콜드게임 규정
 * 5회 6회 10점 이상 차이가 나거나 7회 8회 7점이상 차이가 나면 콜드게임
 * Inning,scoreA, scoreB 를 각각 입력 받아서
 * It`s colded game
 * It`s not a colded game
 */
public class Sample9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("순서대로 공백을 넣어서 입력 : 3 2 1");
		int inning = sc.nextInt();
		int scoreA = sc.nextInt();
		int scoreB = sc.nextInt();
		int diff = Math.abs(scoreA-scoreB);
		
		System.out.println(inning+ " inning" + " A팀 점수 : " + scoreA + " B팀의 점수 : " +scoreB  );
		
		if (diff >=10 && inning ==5 || inning ==6)  {
			System.out.println("It`s colded game");	
		}
		else if (diff >=7 && inning ==7 || inning ==8)  {
			System.out.println("It`s colded game");	
		}
		else {
			System.out.println("it`s not a colded game");
		}
	}
}
