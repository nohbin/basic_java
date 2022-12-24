package operator.statement;

import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args) {

		// 다음과 같이 임의의 정수를 입력하고 그 정수를 출력하는데 음수면 양수로 출력하는 코드를 입력하세요

		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();

//		if (num>=0) {
//			System.out.println(num);
//		}
//		else if (num <0) {
//			System.out.println(-num);
//		}

		// 1~100 까지 수 중 하나를 저장하고 첫째 줄은 변수를 출력,
//		변수가 짝수이면 두번째 출력은 없다. 변수가 호수이면 두번째 출력을 하는데 그 변수에 1을 더한 짝수로 출력한다
//		
//		System.out.println("input 1~100");
//		int num = sc.nextInt();
//		if (num % 2 ==0) {
//			System.out.println(num);
//		}
//		else if (num %2 == 1) {
//			System.out.println(num += 1);
//		}

		// 1과 100 사이 난수를 생성
		// 홀수면 1을 더하고 짝수면 그대로 둔다.
		// Math.random 은 0 과 1 사이의 임이의 실수를 리턴 0과 1사이를 제외

//		System.out.println(Math.random());
//		System.out.println(Math.random()* 100) ;
//		System.out.println((int)(Math.random()*100)) ;
//		System.out.println((int)(Math.random()*100) +1) ;

		int number = ((int) (Math.random() * 100) + 1);
		// 홀수면 1을 더해준다
		if (number % 2 == 1) {
			number += 1;
		}

		
	}

}
