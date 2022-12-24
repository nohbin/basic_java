package operator.statement;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.lang.ArithmeticException;

/*
 * 문자열 3개 입력 수동.
 * 오름차순으로 정렬해서 출력
 * ex abc abm abd
 * 
 * 	// == != > < 비교연산자는 사용 불가
		// a >= b 결과 가 0
		String str1 = "a";
		String str2 = "b";		
		System.out.println(str1.compareToIgnoreCase(str2)); // -1
	
		String str3 = "b";
		String str4 = "a";		
		System.out.println(str3.compareToIgnoreCase(str4)); // 1
		
		String str5 = "a";
		String str6 = "a";		
		System.out.println(str5.compareToIgnoreCase(str6)); // 0
 * 
 */
public class Sample13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 3번 입력하세요 (ex: abc abd abe) : ");
		String str1 = sc.next();
		String str2 = sc.next();
		String str3 = sc.next();
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		String[] arr = new String[] { str1, str2, str3 };
		Arrays.sort(arr);

		System.out.println("주어진 문자의 오름차순 정렬 : " + Arrays.toString(arr));

	}
}
