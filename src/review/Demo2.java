package review;

public class Demo2 {

	public static void main(String[] args) {
		//연산자 사칙연산자
		//단항연산자 : 연산자와 피연산자가 각각 한개씩 ++num;
		//++ , --
		int number = 0; //정수형 변수를 선언하고 초기값으로 0을 대입
		++number; // 기존 number 가 가지고 있는 값에 1을 더해서 누적한다.
		number++; // 누적시점. 앞에 있으면 그 즉시 반영 , 뒤에 있으면 해당 명령어가 끝나고 난뒤
		System.out.println(number);
		number--; // 기존 number 가 가지고 있는 값에 11을 빼서 누적한다.
		System.out.println(number);
		//이항연산자 : 연산자의 좌우에 피연산자가 한개씩 num1 + num2;
		int number2 = number;
		int reslut = number + number2;
		
		number2 += number;
		System.out.println(number2);
		
		//대입연산자 : '=' 오른쪽에서 왼쪽으로 대입한다.
		//복합대입연산자 누적연산을 가능 : number += 100; , number = 100;
		
		//비교연산자 : 크다 작다 같다 같지 않다. 결과는 true , false 라는 0과 1 해당하는 형태를 반환
		
		
	}

}
