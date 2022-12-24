package operator.statement;

import java.util.Scanner;

/*
 *   1차 시험과 2차시험 각 a과목 b과목
 *   
 *   1차시험 a괌고이 60점보다 작으면 b과목 점수와 상관업시 불합격
 *   b과목이 40점보다 작으면 a점수와 상관없이 불합격
 *   그외는 두과목 합계 출력
 *   
 *   
 *    2차시험 a괌고이 70점보다 작으면 b과목 점수와 상관업시 불합격
 *   b과목이 50점보다 작으면 a점수와 상관없이 불합격
 *   그외는 두과목 합계 출력  
 *   
 *   입력 항목 : 시험구분 1차,2차
 *   a과목 점수 ,  b과목 점수
 *   
 */
public class Sample16 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("시험 차수 : (1차 or 2차)");
//		int test = sc.nextInt();
//		System.out.println("시험 점수 : (A점수 , B점수)");
//		int scoreA = sc.nextInt();
//		int scoreB = sc.nextInt();
//
//		if (test == 1)
//			if (scoreA < 60 || scoreB < 40)
//				System.out.println("불합격");
//			else
//				System.out.println(scoreA + scoreB);
//
//		if (test == 2)
//			if (scoreA < 70 || scoreB < 50)
//				System.out.println("불합격");
//			else
//				System.out.println(scoreA + scoreB);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("시험 차수 점수");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a<60 || b<40) 
			return;
		
		
		

	}
}
