package operator.statement;

import java.util.Scanner;

public class demo9 {

	public static void main(String[] args) {

		// 입력한 값이 양수 인지 음수 인지 판단
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int number = sc.nextInt();
		System.out.println("입력한 값: " + number);
		if (number > 0) {
			System.out.println("양수");
		} else if (number < 0) {
			System.out.println("음수");
		}

		// 입력한 값이 짝수 인지 홀수 인지
		System.out.println("정수를 입력하세요.");
		number = sc.nextInt();

		if (number % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}

		// 3개를 입력 받아서 최대와 최소값을 출력
		
		System.out.println("정수 3개를 공백을 이용해서 입력하세요 ex :10 20 30");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		
		int maxnumber;
		int minnumber;
//		// number 1 과 number 2 중 가장 큰 값
//		if (number1 >= number2 && number1>=number3) {
//			maxnumber = number1;
//		}
//		else (number
//		}
//		else
		maxnumber = (number1 >= number2)? number1 : number2;
		maxnumber = (maxnumber >= number3)? maxnumber : number3;
		
		minnumber = (number1 <= number2)? number1 : number2;
		minnumber = (minnumber <= number3)? minnumber : number3;
		
		System.out.println("가장 큰 값은 : " + maxnumber);
		System.out.println("가장 작은 값은 : " + minnumber);
		
		
		
		// 키보드로 부터 숫자를 입력 받아서 변수에 저장 (1~7)
		// 저장된 변수가 1~7 까지 switch 를 통해 월~일 입력

		System.out.println("1~7사이의 정수를 입력하세요");
	
		int date = sc.nextInt();

		switch (date) {
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
			break;
		case 7:
			System.out.println("일요일");
			break;

		default:
			break;
		}

	}

}
