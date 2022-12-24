package VariableType;
/*
 * 문자열 비교는 equals 를 사용, 직접 비교는 하지 않는다.
 * 
 */
public class Demo3 {

	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.println(str1 + " " + str2);
//		System.out.println(str1 == str2);
//		System.out.println(str1.equals(str2));
		
		str1.hashCode();
		str2.hashCode();
		System.out.println("hashcode : " + System.identityHashCode(str1));
		System.out.println("hashcode : " + System.identityHashCode(str2));
		
		System.out.println("----------------------------------");
		
		String str3 = "abc";
		String str4 = "abc";
		str3.hashCode();
		str4.hashCode();
		System.out.println("hashcode : " + System.identityHashCode(str3));
		System.out.println("hashcode : " + System.identityHashCode(str4));
		
		System.out.println("----------------------------------");
		
		
		
		
		
	}

}
