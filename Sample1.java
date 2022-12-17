package operator.statement;

import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		// 1~9 까지 숫자 중 하나를 입력하고 그 숫자에 1을 중가한 수를 출력하는 코드 , 단 증가하는 수가 10이면 1로 바꿔서 출력한다
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		
//		switch (num) {
//		case 1:
//			System.out.println(++num);
//			break;
//		case 2:
//			System.out.println(++num);
//			break;
//		case 3:
//			System.out.println(++num);
//			break;
//		case 4:
//			System.out.println(++num);
//			break;
//		case 5:
//			System.out.println(++num);
//			break;
//		case 6:
//			System.out.println(++num);
//			break;
//		case 7:
//			System.out.println(++num);
//			break;
//		case 8:
//			System.out.println(++num);
//			break;
//		case 9:
//			System.out.println("1");
//			break;
//			
//		default:
//			break;
//		}
		
		Scanner sclnput = new Scanner(System.in);
		System.out.println("Input 1~9");
		// type casting 은 기본 data type 사이에서는 casting 가능
		// 그렇지 않은 경우에는 불가능, 가능하게 하려면 기능을 구현 (내가 or system)
		int num2 = Integer.parseInt(sclnput.next());

//		num2 += 1;
		num2 = num2 % 9 +1 ;
//		if(num2 == 10) {
//			num2 = 1;
//		}
		
		System.out.println(num2);
		
		/*
		 *  1자리의 숫자를 입력하여 변수에 저장한다.
		 *  변수의 값을 정수로 캐스팅하여 저장한다.
		 *  변수의 값에 1을 더한다
		 *  만약 변수의 값이 10이면 1로 바꿔준다.
		 *  정수를 출력한다
		 */
		
		
		
		}

	}

