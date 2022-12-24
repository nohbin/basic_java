package loop;
/*
 * 아래 코드는 1,2,3,4,5 가 실행된다.
 * 이걸 2,4,6,8,10 이 출력 되도록 실행하세요
 */

public class Sample1 {

	public static void main(String[] args) {

		int count = 1;
		while (count <= 10) {
			if (count % 2 == 0)
				System.out.println(count);
			count++;

		}

		 count = 10;
		while (count > 0) {
			System.out.println(count);
			count -= 2;
		}

	}

}
