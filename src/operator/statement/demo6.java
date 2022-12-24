package operator.statement;

import java.util.Scanner;

public class demo6 {

	public static void main(String[] args) {

		// 2.값이 2800원이고 5000원을 지불하면 거스름돈을 어떻게 주는지 출력
		// 아래 값을 개선 해봅시다

//		int price = 2800;
//		int myPrice = 5500;
//		int change = myPrice - price; // 2200원
//		
//		int won_1000 = change / 1000;
//		int won_500  = (change % 1000) / 500;
//		int won_100  = ((change % 1000) % 500) / 100;
//		
//		System.out.println("천원 : " +won_1000);
//		System.out.println("오백원 : " +won_500);
//		System.out.println("백원 : " +won_100);

		int value; // 물건
		int money; // 돈
		int change; // 잔돈
		int count; // 잔돈 2?

		Scanner scan = new Scanner(System.in);

		System.out.print("물건값 = ");
		value = scan.nextInt();

		System.out.print("손님이 지불한 돈 = ");
		money = scan.nextInt();

		change = money - value;

		count = change / 5000;

		change = change % 5000;
		System.out.println("5000원 -> " + count + "장");

		count = change / 1000;
		change = change % 1000;
		System.out.println("1000원 ->" + count + "장");

		count = change / 500;
		change = change % 500;
		System.out.println("500원 ->" + count + "개");

		count = change / 100;
		change = change % 100;
		System.out.println("100원 ->" + count + "개");

		count = change / 50;
		change = change % 50;
		System.out.println("50원 ->" + count + "개");

	}

}
