package operator;

import java.util.Scanner;

/*
 * 복합대입 연산자
 */
public class Demo11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isPass = false;
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		isPass = (kor >=40) && (eng >=40) && (math>=40) &&((kor+eng+math)/3 >= 60); 
		
		System.out.println((isPass)? "합격" : "불합격");
		
		

	}
}
