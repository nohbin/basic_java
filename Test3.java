import java.util.Scanner;

/**
 * 
 * @author NB
 * 
 *
 */
public class Test3 {

	public static void main(String[] args) {

		int kor, eng, math;

		Scanner scan = new Scanner(System.in);

		System.out.println("국어점수를 입력하세요");
		kor = scan.nextInt();

		System.out.println("영어점수를 입력하세요");
		eng = scan.nextInt();

		System.out.println("수학점수를 입력하세요");
		math = scan.nextInt();

		int result = (kor + eng + math) / 3;

		System.out.println("점수 평균은" + result + "입니다"); // 평균값

		String rank = ".";

		if (result >= 70) {
			rank = "A";
		} else if (result >= 60) {
			rank = "B";
		} else if (result >= 50) {
			rank = "C";
		} else {
			rank = "F";
		}
		System.out.print("당신의 학점은" + rank + "입니다"); // 학점 계산

		if (rank == "A") {
			System.out.println("합격입니다");
		}
		else if (rank == "B") {
			System.out.println("합격입니다");
		}
		else if (rank == "C") {
			System.out.println("합격입니다");
		}
		else if (rank == "F") {
			System.out.println("재수강 하세요");
		}


		

	}

}
