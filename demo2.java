package operator.statement;
/*
 * 조건문 - 조건이 맞으면 실행되는 문장
 */
import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {
		// 나이를 입력 받아서 미성년자 인지 판단, 18세 이상이면 성인 그렇지 않으면 미성년자
		// 미성년자는 20% 할인 , 그렇지 않으면 정가
		
		System.out.println("당신의 나이는?");
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
//		boolean age1 = false;
//		age1 =(age >= 18);
//		
//		System.out.println((age1)? "성인" : "미성년자");
		
//		System.out.println((age >= 18)? "성인" : "미성년자");
		
		if((age>=8) && (age<=26)) {
			System.out.println("학교에 다닙니다");
		}
		else {
			System.out.println("학교에 다니지 않습니다.");
		}
	}

}
