package operator.statement;

import java.util.Random;
import java.util.Scanner;
import java.lang.ArithmeticException;

/*
 * 공백을 기준으로 값을 3개를 받는다. 2개는 정수. 하나는 + - * /
 * 
 * 
 */
public class Sample11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("공백을 기준으로 값 3개, 2개는 정수 하나는 연산부호");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		String num3 = sc.next();

		switch (num3) {
		case "+":
			System.out.println(num1 + num2);
			break;
		case "-":
			System.out.println(num1 - num2);
			break;
		case "*":
			System.out.println(num1 * num2);
			break;
		case "/":
			if (num2 != 0) {
				System.out.println(num1 / num2);
			} else {
				System.out.println("0으로 나눌 수 없다.");
			}
			break;
		default:

			break;
		}

	}
}
