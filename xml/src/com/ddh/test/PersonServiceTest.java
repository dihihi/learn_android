package com.ddh.test;

import android.test.AndroidTestCase;
import android.util.Log;

public class PersonServiceTest extends AndroidTestCase {
	
	public void testPersons() throws Exception {
		/*InputStream xml = this.getClass().getClassLoader().getResourceAsStream("person.xml");
		List<Person> persons = PersonService.getPersons(xml);
		
		for (Person person : persons) {
			Log.i("person", person.toString());
		}*/
		Log.e("person", "eee");
		Log.d("person", "hello");
		Log.i("person", "hello");
		Log.d("person", "debug");
		Log.e("person", "haha");
		
	}
	
}
