package loop;

public class Demo3 {

	public static void main(String[] args) {
		int count = 0;
		boolean isContinue = false;
		
		do {
			System.out.println(count);
			count++;
		} while (isContinue); // 요즘 잘 사용하지 않는다. 왜일까.?
		
		
		
		while (isContinue) {
			System.out.println(count);
			count++;
		}

	}

}
