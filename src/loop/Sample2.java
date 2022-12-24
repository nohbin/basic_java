package loop;

/*
 * -1 에서 -5 까지 합을 구해보세요 , 순환문을 이용
 */

public class Sample2 {

	public static void main(String[] args) {

		int a = 0;
		int sum = 0;

		while (a > -5) {

			a -= 1;
			sum += a;

		}
		System.out.println(sum);
	}

}
