package operator;

public class Demo2 {

	public static void main(String[] args) {
		
		int num = 10;
		System.out.println(num);
		
//		int num2 = ++num;
		int num2 = num++;
				System.out.println(num2); // 11
				System.out.println(num);  // 11
				System.out.println(num);
	}

}
