package operator.statement;

import java.util.Scanner;

public class Sample8 {

	public static void main(String[] args) {

		//소포 요금 3kg 미만은 3원,
		//1kg 초과 시 0.5 원씩 증가
		//금액 출력
		double weight;
		int amt = 3;
		Scanner sc = new Scanner(System.in);
		System.out.println("소포의 무게는? : ");
		weight = sc.nextInt();
		
		if (weight < 3) {
			System.out.println("가격은" +amt);
		}
		else {
			double total = 3.0 + ((weight - 3.0 + 1.0)+0.5);
			System.out.println(total);
			
		}
		
		}
	}

