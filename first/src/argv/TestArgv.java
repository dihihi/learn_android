package argv;

import first.User;

public class TestArgv {

	public static void main(String[] args) {

		User user = new User();
		user.username = "张三";
		Argv.t(user.username);// 0
		System.out.println("main方法中打印的username：" + user.username);// 3

		String name = new String("马云");
		Argv.t(name);// m
		System.out.println(name);//

		System.out.println("==========================");
		Argv.t2(user);// 3
		System.out.println(user.username);// 3
		int b = 0;
		int sum = 7;
		int a = Argv.t2(sum);
		System.out.println(sum);

		int n = 3;
		System.out.println("Before change, n = " + n);
		changeData(n);
		System.out.println("After changeData(n), n = " + n);

		//
		StringBuffer sb = new StringBuffer("Hello ");
		System.out.println("Before change, sb = " + sb);
		changeData(sb, sb);
		System.out.println("After changeData(n), sb = " + sb);
	}

	public static void changeData(int n) {
		n = 10;

	}

	public static void changeData(StringBuffer strBuf, StringBuffer strBuf2) {
		strBuf = new StringBuffer("Hi ");
		strBuf.append("World!");
		strBuf2.append("World! ");
	}
}