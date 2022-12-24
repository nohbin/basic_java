package 연습용;

import java.util.Scanner;

public class IF {

	public static void main(String[] args) {
		
		System.out.println("얼마가 있으십니까");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		
		boolean hasCard = true;

		if (money>=3000 || hasCard) {
		    System.out.println("택시를 타고 가라");
		} else {
		    System.out.println("걸어가라");
		}
		
		

	}

}
