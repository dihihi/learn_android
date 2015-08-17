package first;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;


/**
 * 测试异常
 * @author 丁大海
 *
 */
public class TestException {

	
	public static void main(String[] args) throws FileNotFoundException {
		User user = new User();
		user.setUsername("张三");
		
		FileOutputStream fos = new FileOutputStream("test/first/user.txt");
			
		
		//ObjectWriter 
	}

	
}
