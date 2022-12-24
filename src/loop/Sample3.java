package loop;

import java.util.Scanner;

/*
 * 다음 그림을 보고 코딩으로 표현
 * 
 *  숫자를 입력는다.
 *  
 *  x를 입력 받아 
 * 
 */

public class Sample3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("input num");
		String strx = sc.next(); // 문자열 숫자 "123"
		int X = Integer.parseInt(strx);

		while (X != -1) {

			int y = (3 * X) + 1;
			System.out.println("y :" + y);

			System.out.println("input number : ");
			strx = sc.next();
			X = Integer.parseInt(strx);

		}
		System.out.println("End");
	}

}
