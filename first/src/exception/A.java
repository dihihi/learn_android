package exception;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class A {
	private String  name="dajdgkajgKJFKJAad";
	private int age;
	{
		
		System.out.println(name.indexOf("A", 15));
	int c=	name.lastIndexOf("d",name.length() -7);

		char ch=name.charAt(4);
		System.out.println(ch);
		int in="abc".compareTo("a");
		System.out.println(in);
	}
	
	public static void main(String[] args) {
		A ccc=new A();
		ccc.getAge();
		List<String> list = new ArrayList<String>();
		
		A a = new A();
		A b=a;
		a.age=33;
		b.age=22;
		System.out.println(a.getAge());
		System.out.println(b.age);
		
		Exception2 exc=null;
		exc=new Exception2();
	System.out.println(exc.getClass());	
		
	}
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void fangFa(String name){
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
