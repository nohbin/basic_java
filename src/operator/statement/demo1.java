package operator.statement;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		// 나이를 입력 받아서 미성년자 인지 판단, 18세 이상이면 성인 그렇지 않으면 미성년자
		// 미성년자는 20% 할인 , 그렇지 않으면 정가
		
		System.out.println("당신의 나이는?");
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age >=18) {
			System.out.println("성인");
		} else {
			System.out.println("미성년자");
		}

		
//		System.out.println((age >= 18)? "성인" : "미성년자");
		
	}

}
