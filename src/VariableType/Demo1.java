package VariableType;

public class Demo1 {
	public static int global_variable = 0; // class 내에서 전부 사용 가능

	public static void main(String[] args) {

		// 1. 정수형 변수 선언하고 적절한 데이터 초기화
		// 2. 실수형 변수 선언하고 적절한 데이터 초기화

		global_variable = 20;
		int num = 0; // 해당 함수 안에서 사용 가능
		int num2 = 0; // 변수는 할당 시 초기화 하지 않으면 garbage data 가 있어 정상적인 사용 불가 로 인한 초기
		int result = num + num2;
		//System.out.println(result);

		double dNum = 0.0;
		double dNum2 = 0.0;

		// 변수를 초기화 하지 않으면 무슨일이 일어날까 , 왜 연산이 안될까
		// 변수를 연산할때는 반드시 초기화를 한 이후에 사용

		// local variable : 지역변수
		// global variable : 전역변수

		{

			int num4 = num;
			global_variable = 100;

		}

		// int num5 = num4; // num4 는 중괄호를 벗어나 data 가 삭제 되어 사용 하지 못함.

		// type casting(형변환) : type 이 다른 변수의 type 을 임시로 변경 , 자바는 동일한 동일한 type 으로 연산

		int number = 15;
		double percent = 12.5;
		percent = number; // auto casting
		number = (int) percent; // non-auto casting
		
		System.out.println(percent);
		
		// 숫자의 type 은 int 가 기본
		// 실수의 type 은 double 이 기본
 		float percent2 = (float) 12.5;
 		float percent3 = 12.5f; // 숫자 뒤 기호 f를 통하여 float 로 casting 가능
 		float percent4 = 12.5F;
 		
		long longnumber = 10;
		long longnumber2 = (long)10;
		long longnumber3 = 10l;
		long longnumber4 = 10L;

	}

}
