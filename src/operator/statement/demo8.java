package operator.statement;

import java.util.Scanner;

public class demo8 {

	public static void main(String[] args) {

//		int rank;
//		Scanner sc = new Scanner(System.in);
//		rank = sc.nextInt();
//
//		switch (rank) {
//		case 1:
//			System.out.println("일등");
//			break;
//		case 2:
//			System.out.println("이등");
//			break;
//		case 3:
//			System.out.println("삼등");
//			break;
//
//		default:
//			break;

//		int month = 3;
//		String monthString;
//		switch (month) {
//		case 1:
//			monthString = "January";
//			System.out.println(monthString);
//			break;
//		case 2:
//			monthString = "February";
//			System.out.println(monthString);
//			break;
//		case 3:
//			monthString = "March";
//			System.out.println(monthString);
//			break;
//		case 4:
//			monthString = "April";
//			System.out.println(monthString);
//			break;
//		case 5:
//			monthString = "May";
//			System.out.println(monthString);
//			break;
//		case 6:
//			monthString = "June";
//			System.out.println(monthString);
//			break;
//		case 7:
//			monthString = "July";
//			System.out.println(monthString);
//			break;
//		case 8:
//			monthString = "August";
//			System.out.println(monthString);
//			break;
//		case 9:
//			monthString = "September";
//			System.out.println(monthString);
//			break;
//		case 10:
//			monthString = "October";
//			System.out.println(monthString);
//			break;
//		case 11:
//			monthString = "November";
//			System.out.println(monthString);
//			break;
//		case 12:
//			monthString = "December";
//			System.out.println(monthString);
//			break;
//		default:
//			monthString = "Invalid month";
//			System.out.println(monthString);
//			break;

		Scanner stdIn = new Scanner(System.in);

		System.out.println("몇 월입니까?:");
		int month = stdIn.nextInt();

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("그런 월은 없습니다.");
			break;

		}

	}

}
