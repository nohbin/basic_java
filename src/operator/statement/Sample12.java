package operator.statement;

import java.util.Random;
import java.util.Scanner;
import java.lang.ArithmeticException;

/*
 * 
 * 자동차 보험료 계산
 * 나이에 따라 할증 
 * 18~20 100%
 * 21~25 50%
 * 26~30 25%
 * 31~70 0%
 * 71~80 10%
 * 81~ 20%
 */
public class Sample12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 나이는? : ");
		int age = sc.nextInt();
		final int INSUR_AMT = 200;
		
		if (18 <= age && age <= 20) {
			System.out.println("보험료는 100% 할증 : " + (INSUR_AMT * 2)+ "만원"); // 
		}
		else if (21 <= age && age <= 25) {
			System.out.println("보험료는 50% 할증 : " +(INSUR_AMT + (INSUR_AMT * 0.5))+ "만원");
		}
		else if (26 <= age && age <= 30) {
			System.out.println("보험료는 25% 할증 : " +(INSUR_AMT + (INSUR_AMT * 0.25))+ "만원");
		}
		else if (31 <= age && age <= 70) {
			System.out.println("보험료는 0% 할증 : " +INSUR_AMT + "만원");
		}
		else if (71 <= age && age <= 80) {
			System.out.println("보험료는 10% 할증 : " + (INSUR_AMT + (INSUR_AMT * 0.1))+ "만원");
		}
		else if (81 <= age) {
			System.out.println("보험료는 20% 할증 : " +(INSUR_AMT + (INSUR_AMT * 0.2))+ "만원");
		}
		
	

	}
}
