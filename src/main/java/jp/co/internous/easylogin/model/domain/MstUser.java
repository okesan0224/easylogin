package jp.co.internous.easylogin.model.domain;

public class MstUser {
	
	private int id;
	private String userName;
	private String password;
	private String fullName;
	
	//idのセッターゲッター
	public int getid() {
		return id;
	}
	public void setId(int id) {
		this.id= id;
	}
	
	//user_nameのセッターゲッター
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	//passwordのセッターゲッター
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//fullNameのセッターゲッター
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
