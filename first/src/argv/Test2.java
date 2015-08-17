package argv;

//【17】有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。 (不使用数学公式，要求用递归)
public class Test2 {

	public static void main(String[] args) {
		// 定义两个初始变量，一个保存结果的变量
		float a = 2;//分子
		float b = 1;//分母
		double sum = 0;
		// 循环，设置次数：
		for (int i = 0; i < 7; i++) {
			// 每次把一个数加到sum中，每个数都是一个分数，分母为前一个数
			sum += a / b;
			
			System.out.println("" + sum + "+=" + a/b);
			float tmp = a;
			a = a + b;
			b = tmp;
			System.out.println("" +  a + "/" + b);
		}
		
		System.out.println("结果为： " + sum);
	}
}