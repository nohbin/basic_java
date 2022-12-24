package VariableType;
/*
 * 
 * 
 */
public class Demo4 {

	public static void main(String[] args) {
		
		// == != > < 비교연산자는 사용 불가
		// a >= b 결과 가 0
		String str1 = "abea";
		String str2 = "abdz";		
		System.out.println(str1.compareToIgnoreCase(str2)); // -1
	
		String str3 = "b";
		String str4 = "a";		
		System.out.println(str3.compareToIgnoreCase(str4)); // 1
		
		String str5 = "a";
		String str6 = "a";		
		System.out.println(str5.compareToIgnoreCase(str6)); // 0
		
		
	}

}
