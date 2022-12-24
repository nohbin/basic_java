package operator.statement;

/*
 * 주사위가 2개 
 * 던져서 포인트 부여
 * 2개의 주사위 값이 다를 경우 합을 구한다
 * 같을 경우 합의 값이 7보다 작을경우 10배 포인트
 * 그렇지 않을때는 8배 포인트
 * 
 * 1~6 사이의 랜덤한 값을 추출하는 명령어
 * 
 */
public class Sample14 {

	public static void main(String[] args) {

		int dice = (int) (Math.random() * 6) + 1;
		int dice2 = (int) (Math.random() * 6) + 1;
		System.out.println("주사위 1번 : " + dice + "," + "주사위 2번 : " + dice2);

//		if (dice != dice2) {
//			System.out.println("주사위값이 같습니다. 포인트 = " + (dice + dice2));
//		} else if (dice == dice2 && dice + dice2 < 7) {
//			System.out.println("주사위 값이 7보다 작아 10배 포인트 = " + ((dice + dice2) * 7));
//		} else {
//			System.out.println("8배 포인트 " + ((dice + dice2) * 8));
//		}
//		
		if (dice == dice2) {
			if (dice + dice2 < 7) {
				System.out.println("주사위 값이 7보다 작아 10배 포인트 = " + ((dice + dice2) * 7));
			} else {
				System.out.println("8배 포인트 " + ((dice + dice2) * 8));
			}

		} else {
			System.out.println("주사위값이 같습니다. 포인트 = " + (dice + dice2));
		}

	}
}
