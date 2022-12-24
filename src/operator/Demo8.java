package operator;


public class Demo8 {

	public static void main(String[] args) {
	//		int num = 10;
	//		System.out.println( (num > 0) && (num <-10)); //논리적 모순 , (0보다 크거나 -10보다 작은 수)
	
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 +10) <  10) && ((i = i + 2) <10); // 논리 곱에서 앞 항으 ㅣ결과 값이 거짓으로 실행되지 않음
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) <10); // 논리 합 에서 앞 항의 결과 값이 참으로 실행되지 않음
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		
		

	}

}
