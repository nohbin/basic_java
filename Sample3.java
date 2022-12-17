package operator.statement;

import java.util.Scanner;

public class Sample3 {

	public static void main(String[] args) {
		// 문자열 표현
		// String = char 의 모음
		// String str = 객채
		// int number = 변수

//		String str = "Hello";
//		
//		System.out.println(str.substring(0, 1));
//		System.out.println(str.substring(0, 2));
//		System.out.println(str.substring(1, 2));
//		System.out.println(str.substring(1, 3));
//		System.out.println(str.substring(1, 5));
//		str.length() // 문자열의 길이
		
		//변수에 문자열을 입력하여 저장하고 첫번째 줄은 그 변수를 출력 , 
		//변수의 길이가 5보다 작거나 같으면 두번째 출력은 없다, 
		//변수의 길이가 5보다 크면 두번째 출력을 하는데 5번째 문자까지만 출력한다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		String str = sc.next();
			
		System.out.println(str); //변수에 문자열을 입력하여 저장하고 첫번째 줄은 그 변수를 출력
		
		if (str.length() >5) {
			System.out.println(str.substring(0,5));
		}
		

	}

}
