package package1;

import java.util.Scanner;

public class AddressManager {

	private User[] userList=null;
	private MenuManager menuManager=null;
	private User user=null;
	private final int USER_COUNT=3;
	
	public AddressManager() {
		this.menuManager=new MenuManager();
		userList=new User[] {new User("김아현","서울","1111","aa","11"),
				new User("유지안","경기","2222","bb","22"),
				new User("최현우","충북","3333","cc","33")};
	}

	public void run() {
		boolean end_flag = false;
		while (true) {
			this.menuManager.initMenu();
			int select = this.menuManager.selectInitMenu();
			switch (select) {
			case MenuManager.ADMIN_LOGIN:
				if (this.loginProcess()) {
					this.addressProcess();
				}
				break;
			case MenuManager.EXIT:
				end_flag=true;
				break;
			}
			if (end_flag) {
				break;
			}
		}
	}
	
	
	public boolean loginProcess() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("ID: ");
		String id = input.nextLine();
		System.out.println("PW: ");
		String pw = input.nextLine();

		for(int i=0; i<USER_COUNT;i++) {
		if (id.equals(this.userList[i].getId()) && pw.equals(this.userList[i].getPw())) {
			System.out.println("로그인 성공!");
			userList[i].login();
			return true;
		}
		
		}
		System.out.println("입력된 로그인 정보가 틀렸습니다.");
		return false;
	}
	
	public void addressProcess() {
		boolean end_flag=false;
		while(true) {
			this.menuManager.AddressMenu();
			int select=this.menuManager.selectAddressMenu();
			switch(select) {
			case MenuManager.SEARCH_ADDRESS:
				this.addressSearch();
				break;
			case MenuManager.SEARCH_ALL_ADDRESS:
				this.allAdressSearch();
				break;
			case MenuManager.LOGOUT:
				this.logout();
				end_flag=true;
				break;
			}
			if(end_flag) {
				break;
			}
		}
	}
	
	public void addressSearch() {
		Scanner input=new Scanner(System.in);
		System.out.print("검색할 유저의 이름: ");
		String userName=input.nextLine();
		boolean flag=false;
		for(int i=0; i<this.USER_COUNT; i++) {
			if(this.userList[i].getName().equals(userName)) {
				System.out.println(userList[i].getName()+"님의 주소: "+this.userList[i].getAddress());
				System.out.println(userList[i].getName()+"님의 전화번호: "+this.userList[i].getPhone());
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("입력하신 유저의 정보가 없습니다.");
		}
	}
	
	public void allAdressSearch() {
		for (int i = 0; i < this.USER_COUNT; i++) {
			System.out.println(userList[i].getName()+"님의 주소: "+this.userList[i].getAddress());
			System.out.println(userList[i].getName()+"님의 전화번호: "+this.userList[i].getPhone());
		}
	}
	
	public void logout() {
		for(int i=0; i<this.USER_COUNT; i++) {
			if(userList[i].isLogin()) {
				userList[i].logout();
			}
		}
	}
}
