package operator.statement;

import java.util.Scanner;

public class Sample6 {

	public static void main(String[] args) {
		
		// 어떤 공연장에서 1명의 입장료 $10
		// 인원수를 입력하여 입장료 계산 출력 코드
		// 20명 이상이면 20% 할인 , 할인 금액 과 할인된 최종금액 출력 (실수 소수점 1자리)
		
		Scanner sc = new Scanner(System.in);
		final int TICKET = 10;
		System.out.println("공연 입장 인원수를 입력해주세요.");
		int person = sc.nextInt();
		int amt = person * TICKET;
		double discount = Math.round((amt*0.2)*10.0)/10.0;
		
		if (person >= 20) {
			System.out.println("20명 이상 20% 할인 진행.");
			System.out.println("할인된 금액 : " + discount + "$ 총 금액 : " + (amt-discount) + "$");
		}
		else {
			System.out.println("총 금액 :" + amt + "$");
		}
		
		
		
		

		
	}

}
