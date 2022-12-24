package loop;

import java.util.Scanner;

/*
 *     1	~   100 까지 정수 중 3의 배수가 몇개 인지 카운트 해서 출력
 * 
 */

public class Sample4 {

	public static void main(String[] args) {

		int a = 1;
		int count = 0;

		while (a < 101) {
			a++;
			if (a % 3 == 0)
				count++;

		}
		System.out.println(count);

	}
}
