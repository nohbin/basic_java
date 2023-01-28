package classModule;

import java.util.Scanner;

/*
 * 상속이란
 * 모든 자식 생성자는 부모의 기본 생성자를 호출하게 되어있다.
 * 자식 생성자에서 부모의 특정 생성자를 지정해서 호출할 수 있다. - 이때 super(..) 사용
 * 
 * 
 */

class Person {

	public Person() {
	}

	protected int age, weight, height;
	protected String lang;

	public Person(int age, int weight, int height, String lang) {
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.lang = lang;
	}

}

// 기존 클래스를 확장해서 새로운것
class Korean extends Person {

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	private String lang;

}

class American extends Person {
	private String lang;

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

}

class Japaneese extends Person {
	private String lang;

	public String getLang() {
		return lang;

	}

	public void setlang(String lang) {
		this.lang = lang;
	}

}

public class Demo14 {
	public static void main(String[] args) {
		Korean korea = new Korean();
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		korea.age = age;
		korea.height = 170;
		korea.weight = 70;
		korea.setLang("Kor");

		System.out.println(korea.toString());
		
		

	}

}
