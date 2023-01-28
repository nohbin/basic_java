package classModule;
// static 이란 객체 없이 클래스명으로 사용가능한 기능
// 굳이 객체가 될 이유가 없을 경우?
// 객체 란 : 독립적인 데이터를 갖는다.?
// 데이터 : 내부에 정의된 변수
// 하지만 getNumber 는 변수를 사용하지 않는다. 순수 기능만 제공한다.
// 클래스는 클래스 로더가 최초 한번 실행될때 static 이 붙은 메소드 나 변수를 
// static 영역에 한번만 생성해서 프로그램이 끝날때까지 공통적으로 사용한다.
// 
import java.util.Scanner;

public class input {
	
	public static int getNumber() throws Exception {
		Scanner sc = new Scanner(System.in);
		int number = -1;
		try {
			number = sc.nextInt();
		} catch (Exception e) {
			throw new Exception("정수만 입력하세요.");
		} finally {
			sc.close();

		}

		return number;

	}

}
