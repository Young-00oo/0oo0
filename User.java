package package1;

public class User {

	private String name=null;
	private String phone=null;
	private String address=null;
	private String id=null;
	private String pw=null;
	
	boolean login_state=false;
	
	public User(String pname,String paddress,String pphone,String pid, String ppw) {
		this.name=pname;
		this.phone=pphone;
		this.address=paddress;
		this.id=pid;
		this.pw=ppw;
	}
	
	public void login() {
		this.login_state=true;
	}
	
	public void logout() {
		this.login_state=false;
	}
	
	public boolean isLogin() {
		return this.login_state;
	}

	String getId() {
		return this.id;
	}
	
	
	String getPw() {
		return this.pw;
	}
	
	void setPw(String ppw) {
		this.pw=ppw;
	}
	
	String getName() {
		return this.name;
	}
	
	void setName(String pname) {
		this.name=pname;
	}
	
	String getPhone() {
		return this.phone;
	}
	
	void setPhone(String pphone) {
		this.phone=pphone;
	}
	
	String getAddress() {
		return this.address;
	}
	
	void setAddress(String paddress) {
		this.address=paddress;
	}
}
