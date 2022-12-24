package loop;

/*
 * Iteration : 반복/반복  , Enumeration : 열거/카운팅이 가능
 *  While 문
 *  순환문을 만들 경우
 *  break = 자기를 감싸는 순환문을 탈출 시키는 명령어
 *  
 */
public class Demo1 {

	public static void main(String[] args) {

		boolean condition = true;

		int count = 0; // 무한루프 방식

		while (condition) {
			count++;
			System.out.println(count);

			if (count == 5) {
				break;
			}

		}
	}

}
