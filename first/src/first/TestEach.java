package first;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestEach {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		File file = new File("/home/ddh/workspace/first/src/first/554");
		FileInputStream fis = new FileInputStream(file);
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		
		
		
		String str;
		int n = 0;
		while ( (str = br.readLine()) != null ) {
			n++;
			if (str.equals("乐安")) {
				System.out.println("在第" + n + "行");
			}
			System.out.println(str);
		}
		
		
		br.close();
		
		
		System.out.println(file.getAbsolutePath());
		
		Class<String> string = (Class<String>) Class.forName("java.lang.String");
		Method[] methods = string.getMethods();
		for (Method method : methods) {
			System.out.print(method.getName() + "(");
			Class<?>[] types = method.getParameterTypes();
			if (types != null) {
				for (int i=0, len = types.length; i < len; i++) {
					//System.out.print(types[i].getSimpleName());
					if (i < len -1 ) {
						//System.out.print(",");
					}
				}
				
				
				
				for (Class<?> class1 : types) {
					
				}
				System.out.println(")");
			}
		}
		
		for (int i=0; i<100; i++) {
			
		}
		
		
		String[] arr = new String[] {"d", "d", "h"};
		
		for (String a : arr) {
			
		}
		
		
		List<String> list = new ArrayList<String>();
		list.add("d");
		list.add("d2");
		list.add("d3");
		
		for (String s : list) {
			System.out.println();
		}
		
		for (int i=0,len=list.size(); i<len; i++) {
			System.out.println(list.get(i));
		}
		
		Iterator it = list.iterator();
		while (it.hasNext()) {
			String s = (String)it.next();
			System.out.println(s);
		}
		
		for ( Iterator it2 = list.iterator(); it2.hasNext();) {
			String s = (String)it2.next();
			System.out.println(s);
		}
		
		
		int i=0;
		while (i<100) {
			
			i++;
		}
		
		i=0;
		do {
			
		} while (i<100);
		
		
	}
	

}
