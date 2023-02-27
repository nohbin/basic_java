package solo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 *  고객 관리 프로그램.
 *  Map 번호 당 customer 관리,
 *  1번부터 시작.
 *  기본 등급 GENERAL 부터 시작, 금액 충족 시 VIP TOP 로 등급 UP
 */

public class Demo {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);	
	Map<Integer, Customer> customers = new HashMap<>();
	

	
	boolean done = false;
	
	int menuNum = chooseMenu();
	
	while(menuNum == 1) {
		setCustomerInfo(customers, menuNum);
		menuNum = chooseMenu();
		if(menuNum ==4) {
			return;
		}	
	}
	menuNum = modifyCustomerName(sc, customers, menuNum);
	
	}



public static int chooseMenu() {
	System.out.println("---- 고객 관리 시스템 ------");
	System.out.println("1. 고객정보 등록");
	System.out.println("2. 고객정보 수정");
	System.out.println("3. 고객정보 출력");
	System.out.println("4. 나가기");
	
	int menuNum = (new Scanner(System.in)).nextInt();
		
	if(menuNum == 4) {
		return 0;
	}	
	return menuNum;	
}

public static void setCustomerInfo(Map<Integer, Customer> customers , int menuNum ) {// 고객 정보 입력
	int customersNum = 1;
	Scanner sc = new Scanner(System.in);
	boolean done = false;
	
	while (!done) {
		Customer cs = new Customer();		
		System.out.println("이름을 입력하세요 : (종료를 원하시면 exit를 입력해주세요.)"); // 고객이름 입력 및 탈출 문
		cs.setName(sc.next()); 
		if(cs.getName().equals("exit")) {
			done = true;
			break;
		}		
		cs.setGrad(new General()); // 기본 등급 general 부터 시작;		
		System.out.println("금액을 입력하세요 : "); // 고객 금액 등록 
		cs.setTotalPrice(sc.nextInt()); 
		if(cs.getTotalPrice() > 1000000) {
			cs.setGrad(new Top());
		} else if (cs.getTotalPrice() > 500000) {
			cs.setGrad(new VIP());
		} else {
			cs.setGrad(new General());
		}
		cs.setRewardPrice(); //적립금액 계산 문 // 등급별 차등 적립.	
		customers.put(customersNum++, cs); // Map 에 번호 , 고객 등록.	
	}
}

public static void customInfo(Scanner sc, Map<Integer, Customer> customers , int menuNum) { // 고객 번호 별 고객 출력
	boolean done = false;
	int customersNum;
	while(!done) {
	System.out.println("고객 번호를 입력하세요.");
	customersNum = sc.nextInt(); // 
	if(customersNum == 0) {
		done = true;
		return;
	}
	System.out.println(customers.get(customersNum));	
	}
}

public static int modifyCustomerName(Scanner sc, Map<Integer, Customer> customers , int menuNum) { // 고객 이름 정보 변경 문
   
	boolean done = false;
	if(menuNum == 2) {
		while(!done) {
	System.out.println("변경하고 싶은 고객번호를 입력하세요 :  종료하시려면 0 번을 입력해주세요.");
    int customerNum = sc.nextInt();
    if(customerNum == 0) {
		done = true;
		return chooseMenu();
	}
 
    Customer cs = customers.get(customerNum);

    System.out.println("새로운 이름을 입력하세요 : ");
    String newName = sc.next();
    cs.setName(newName);

    System.out.println("변경 후 고객 정보입니다. : ");
    System.out.println(cs);
    
			}
	}
	
	chooseMenu();
    return menuNum;
}




}
