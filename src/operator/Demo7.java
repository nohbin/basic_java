package operator;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {

	// 국영수 점수를 입력 받아서 해당 학생이 합격 불합격을 true false 로 표현
		
		
		//4자리 수 년도를 입력 받아 해당 년도 윤년인지 판단
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 4자리 정수로 입력하세요 : ");
		int year = sc.nextInt();
		// 조건식
		//if(year % 4 == 0 && year % 100 != 0 || year % 400 ==0);
		
		boolean isYoon = false;
	//	System.out.println("입력하신 년도 "+year+" 의 윤년여부 는 (true/false)" + isYoon );
		isYoon = (year%4 ==0) && (year % 100 !=0) || (year %400 ==0);
		
		
		System.out.println((isYoon)? "입력하신 년도 "+year+" 년은 윤년" : "입력하신 년도 "+year+" 평년");
		
		// 나누어 떨어진다
		// 100 $2 == 0;
		
		
		
		
		
		

	}

}
