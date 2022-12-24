package loop;

import java.util.Scanner;

/*
 *     1	~   100 까지 정수 중 5의 배수의 합계
 *     do while 문 사용
 * 
 */

public class Sample5 {

	public static void main(String[] args) {

		int a = 1;
		int sum = 0;

		do {
			if (a % 5 == 0) {
				sum += a;
				a++;
			}

		} while (a < 101);
		sum += a;
		System.out.println(sum);
	}

}
