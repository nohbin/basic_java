package operator;


public class Demo9 {

	public static void main(String[] args) {
		
		String name = "홍길동";
		System.out.println( (name != null && name.length() >0) );
		System.out.println( (name.length() >0) && (name != null) );
		
		
		name = null;
		//System.out.println( (name != null) && (name.length() >0) );
		//System.out.println( (name.length() >0) && (name != null));
		
		name = "";
		System.out.println( (name != null) && (name.length() >0) );

	}
}
