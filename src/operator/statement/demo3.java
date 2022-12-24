package operator.statement;

import java.util.Scanner;

public class demo3 {

	public static void main(String[] args) {
		// 나이를 입력 받아서 18세 이상이면 정가 , 그렇지 않으면 20% 할인
		//총 결제 금액을 출력
		
		int enterPrice = 15000;
		System.out.println("당신의 나이는?");
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age >=18) {
			System.out.println("가격은 " +enterPrice+ "원");
		} else {
			System.out.println("가격은 " +(int)(enterPrice * 0.8)+ "원");
		}

		
//		System.out.println((age >= 18)? "성인" : "미성년자");
		
	}

}
