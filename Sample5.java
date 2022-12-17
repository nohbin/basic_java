package operator.statement;

import java.util.Scanner;

public class Sample5 {

	public static void main(String[] args) {
		
		//상점에서 a식품 12$ , b식품 10$ 판매
		// 구매한 a식품과 b식품의 수 입력 및 금액 출력
		// 만약 a식품의 수가 b식품의 수보다 많으면 전체 금액에서 10% 할인
		// 할인 금액 , 할인된 최종금액 출력,
		// 실수는 소수점 2자리까지 이며 반올림

		Scanner sc = new Scanner(System.in);
		System.out.println("A제품 구매 수량 , B 제품 구매 수량을 입력하세요");
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println("구매한 A 제품 " + A + "개");
		System.out.println("구매한 B 제품 " + B + "개");
		
		int valueA = A * 12;
		int valueB = B * 10;
		int value = valueA+valueB;
		double discount = Math.round((value*0.1)*100.0)/100.0;
		
		System.out.println("총 금액 : " + value + "$");
		
		if (A > B) {
			System.out.println("A의 제품이 B 보다 많아 10% 할인" );
		
			System.out.println("할인 금액 :" + discount + "총 금액 :" + (value-discount));
		}

		
	}

}
