package operator;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {

	// 국영수 점수를 입력 받아서 해당 학생이 합격 불합격을 true false 로 표현
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		int Avg = (kor+eng+math)/3 ;

		System.out.println(kor+" "+eng+" "+math);

		
		boolean isPass = false;
		isPass = (kor >=40) && (eng >=40) && (math>=40) &&((kor+eng+math)/3 >= 60);
	
			
		System.out.println(isPass);
		
		
		// 다음의 조건을 만들어서 treu false 를 출력 각 과목당 40점 이상 평균 60 이상 이면 true
		
		
		
		

	}

}
