package chapter2;

public class Number {

	public static void main(String[] args) {
		
		int num = 10; // int = 정수
		int bNum = 0B1010; // 2진수?
		int oNum = 012; // 8진수
		int hNum = 0XA; // 16진수
		
		// 정수< 실수
		// byte<short<int<long<float<doulbe
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(hNum);
		
		int i=100;  
		Double d= new Double(i);//first way  
		Double d2=Double.valueOf(i);//second way  
		System.out.println(d);  
		System.out.println(d2); 
		
		

	}

}
