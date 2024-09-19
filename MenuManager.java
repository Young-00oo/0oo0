package package1;

import java.util.Scanner;

public class MenuManager {

	public final static int ADMIN_LOGIN=1; 
	public final static int EXIT=2;
	public final static int SEARCH_ADDRESS=1; 
	public final static int SEARCH_ALL_ADDRESS=2;
	public final static int LOGOUT=3;
	
	public MenuManager() {
		// TODO Auto-generated constructor stub
	}

	public void initMenu() {
		System.out.println("<< 주소록 관리 >>");
		System.out.println("1. 로그인");
		System.out.println("2. 종료");
		
	}
	
	public void AddressMenu() {
		System.out.println("<< 주소록 관리 >>");
		System.out.println("1. 주소록 검색");
		System.out.println("2. 전체 주소록 검색");
		System.out.println("3. 로그아웃");
	}
	
	public int selectInitMenu() {
		Scanner input=new Scanner(System.in);
		int select;
		while(true) {
			select=input.nextInt();
			input.nextLine(); 
			if(select<ADMIN_LOGIN || select>EXIT) {
				System.out.println("메뉴 선택이 잘못되었습니다.");
				continue;
			}
			break;
		}
		
		return select;
		
	}
	
	public int selectAddressMenu() {
		Scanner input=new Scanner(System.in);
		int select;
		while(true) {
			select=input.nextInt();
			input.nextLine(); 
			if(select<SEARCH_ADDRESS || select>LOGOUT) {
				System.out.println("메뉴 선택이 잘못되었습니다.");
				continue;
			}
			break;
		}
		
		return select;
		
	}
}
