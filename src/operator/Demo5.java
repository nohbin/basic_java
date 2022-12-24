package operator;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {

		System.out.println("임의의 정수를 입력하세요");

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		System.out.println("입력하신 값은" + number);
		
		boolean nohbin = false;
		nohbin =  number < 10;
		System.out.println(nohbin);
		
		
	

	}

}
