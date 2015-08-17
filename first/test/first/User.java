package first;

import exception.Exception1;
import exception.Exception2;

public class User {
	/** 用户的名字 */
	public String username;
	
	/**
	 * 获取用户名字的长度
	 * @return 名字长度
	 */
	public int getNameLength() {
		return username.length();
	}

	public int getNameLength2() {
		if (username == null) {
			throw new Exception1("用户名为空");
		} else {
			return username.length();
		}
		
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
