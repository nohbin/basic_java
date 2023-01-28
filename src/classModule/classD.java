package classModule;

class Class {

	static String className;

	public static void setName(String name) {
		Class.className = name;
	}

}

class classIf extends Class {

	static void classIf() {
		System.out.println("If문 수업");
	}

	static void SampleIf() {
		System.out.println("If문이란 ~~~~");
	}

	static void DemoIf() {
		System.out.println("If문 예제들~~~~");
	}
}

class classFor extends Class {

	static void classFor() {
		System.out.println("for문");
	}

	static void SampleFor() {
		System.out.println("For문이란 ~~~~");
	}

	static void DemoFor() {
		System.out.println("For문 예제들~~~~");
	}
}

class classWhile extends Class {

	static void classWhile() {
		System.out.println("While문");
	}

	static void SampleWhile() {
		System.out.println("While문이란 ~~~~");
	}

	static void DemoWhile() {
		System.out.println("While문 예제들~~~~");
	}
}

public class classD {

}
