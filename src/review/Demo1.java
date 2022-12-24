package review;

public class Demo1 {

	public static void main(String[] args) {
		// 변수란? : data 를 저장하는 공간 (메모리)
		// 특징 : 저장될 데이터의 타입을 정해준다 (정수,실수,문자열,문자,클래스)
		// 쓰는법 : 타입 변수명 = 초기값;
		// 정수타입 의 기본 형 = int
		// 실수타입 의 기본 형 = double

		int number = 0;
		double avg = 0.0;

		// 변수에 정의된 데이터 타입이 아닌 다른 데이터를 넣음
		// 1. 잘 된다 (큰 타입에 작은 타입)
		// 2. 에러를 낸다 (작은 타입에 큰 타입)

		// number = 0.1; number 는 정수형 데이터 를 갖도록 설계된 변수에 정수형 보다 큰 타입의 데이터를 넣는다.
		// 해결책 : 왼쪽에 목표로 삼는 변수에 오른쪽 데이터를 왼쪽 타입과 같이 임시로 변경해서 넣는다
		number = (int) 12.5;
		System.out.println(number);
		
		
		avg = 10; // 오른쪽 값을 왼쪽 변수에 저장 하는 행위 중, 오른쪽 숫자는 정수(int) 타입이고 // 저장하려는 avg 는 실수(double) 타입

		//프로그램에서 가장 많이 사용하는 변수
		// int , double
	}

}
