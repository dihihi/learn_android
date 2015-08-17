package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayUtil {
	public static void main(String[] args) {
		Integer[] arr={3,223,2,32};
		System.out.println(Arrays.asList(arr));
		System.out.println(tolist(arr));	
		//System.out.println(new ArrayList<Integer>(arr));
		
	}
	
	/**
	 * 打印数组
	 * @param arr
	 */
	public static <T>  void printArray(T[] arr) {
		for (T t : arr) {
			System.out.print(t + "\t");
		}
		System.out.println();
	}
	
	public static <T> List<T> tolist(T[] arr) {

		List<T> list=new ArrayList<>();
		if(arr==null){
	
			System.out.println("kongde");
			return list;
			
		}
		for(int i=0;i<arr.length;i++){
			list.add(arr[i]);
		}
		
		return list;
	}

}
abstract  class Kdsh{
	
}