package classModule;

import java.util.Scanner;

public class classM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Class.setName("조건문(if) 수업");
		Class.setName("조건문(for) 수업");
		Class.setName("조건문(while) 수업");

		boolean run = true;

		while (run) {

			System.out.println("메뉴선택");
			System.out.println("1번 :  If 문");
			System.out.println("2번 :  For문");
			System.out.println("3번 : While 문");
			System.out.println("4번 : 종료 ");
			int classNum = sc.nextInt();

			switch (classNum) {

			case 1:
				classIf.classIf();
				System.out.println("1번 : 이론");
				System.out.println("2번 : 예제");
				System.out.println("3번 : 이전으로");
				int classNum1 = sc.nextInt();
				if (classNum1 == 1) {
					classIf.SampleIf();
				} else if (classNum1 == 2) {
					classIf.DemoIf();
				}
				break;

			case 2:
				classFor.classFor();
				System.out.println("1번 : 이론");
				System.out.println("2번 : 예제");
				System.out.println("3번 : 이전으로");
				int classNum2 = sc.nextInt();
				if (classNum2 == 1) {
					classFor.SampleFor();
				} else if (classNum2 == 2) {
					classFor.DemoFor();
				}
				break;

			case 3:
				classWhile.classWhile();
				System.out.println("1번 : 이론");
				System.out.println("2번 : 예제");
				System.out.println("3번 : 이전으로");

				int classNum3 = sc.nextInt();
				if (classNum3 == 1) {
					classWhile.SampleWhile();
				} else if (classNum3 == 2) {
					classWhile.DemoWhile();
				}
				break;

			default:
				break;

			}

			if (classNum == 4) {
				run = false;
			}

		}
		sc.close();

	}
}
