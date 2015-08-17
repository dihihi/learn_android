package argv;

import first.User;


public class Argv {
	
	public static void t(String name) {
		System.out.println("调用t方法： " + name);
		name = "李四";
	}
	
	public static void t2(User u) {
		System.out.println("调用t方法： " + u.username);
		u.username = "李四";
	}
	
	public static int t2(int sum) {
		return sum = sum * 100;
	}
}
