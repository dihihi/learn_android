package first;

import java.util.ArrayList;
import java.util.List;

import util.ArrayUtil;

public class ArrayTest {
	public static void main(String[] args) {
	int [] s={12,1,2,3,45};
		ArrayTest a=new ArrayTest();
		List lise=a.arr2List(s);
		//ArrayUtil.printArray(s);

		System.out.println(lise);
		lise.add(545);
		System.out.println(lise);
		
		List list1=new ArrayList();
		list1.add(34);
		list1.add(43);
		list1.add(5);
		a.listTohuzhi(list1);
		System.out.println(list1);
		
	}

	public List arr2List(int[] i) {
		
		List list = new ArrayList();
		for (int aa : i) {
			list.add(aa);
		}
		return list;
	}

	public int[] listTohuzhi(List list) {
		int[] arr = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			arr[i] = (Integer) (list.get(i));
		}
		return arr;
	}

}

 