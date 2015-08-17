package com.ddh.test;

import java.io.InputStream;
import java.util.List;

import android.test.AndroidTestCase;
import android.util.Log;

import com.ddh.domain.Person;
import com.ddh.service.PersonService;

public class PersonServiceTest extends AndroidTestCase {
	
	public void testPersons() throws Exception {
		InputStream xml = this.getClass().getClassLoader().getResourceAsStream("person.xml");
		List<Person> persons = PersonService.getPersons(xml);
		
		for (Person person : persons) {
			Log.w("person", person.toString());
		}
		
	}
	
}
