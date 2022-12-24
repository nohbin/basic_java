package VariableType;

public class Demo2 {

	public static void main(String[] args) {
		// 문자열 기본 데이터 타입이 아님. 하지만 기본 데이터 타입처럼 사용
		int num1 = 1;
		int num2 = 1;
		System.out.println(num1 == num2);

		
		System.out.println(num1 == num2);

		System.out.println("-------------------------------");
		
		String str1 = "abc";
		String str2 = str1;

		System.out.println(str1 + " " + str2);
		System.out.println(str1 == str2);

		str1 = "cba";
		System.out.println(str1 + " " + str2);

		
		
	}

}
