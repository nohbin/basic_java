package operator;

public class Demo3 {

	public static void main(String[] args) {

		int num = 10;
		//관계 연산자 true false
		System.out.println(num > 3);
		System.out.println(num < 3);
		System.out.println(num >= 3);
		System.out.println(num <= 3);
		System.out.println(num == 3); // 같다
		System.out.println(num != 3); // 같지 않다
		System.out.println(num = 3); // = 갯수 주의

		boolean temp = false;
		temp = num > 3;
		System.out.println(temp);
		temp = num < 3;
		System.out.println(temp);

	}

}
