package operator.statement;

import java.util.Scanner;

public class demo4 {

	public static void main(String[] args) {
		// 나이를 입력 받아서 18세 이상이면 정가 , 그렇지 않으면 20% 할인
		//총 결제 금액을 출력
		
		
		System.out.println("당신의 점수는?");
		
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();
		String rank = "F";
		
		
		if(point >=90) {
			rank = "A";
		} 
		else if (point >=80)
		{
			rank = "B";
		}
		else if (point >=70)
		{
			rank = "C";
		}
		else if (point >=60)
		{
			rank = "D";
		}

		System.out.println("당신의 학점은 " +rank);
		

		
//		System.out.println((age >= 18)? "성인" : "미성년자");
		
	}

}
