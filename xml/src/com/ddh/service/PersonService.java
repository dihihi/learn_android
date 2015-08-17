package com.ddh.service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;

import android.util.Xml;

import com.ddh.domain.Person;

public class PersonService {

	public static List<Person> getPersons(InputStream xml)throws Exception {
		List<Person> persons = null;
		Person person = null;
		
		XmlPullParser parser = Xml.newPullParser();
		parser.setInput(xml, "UTF-8");
		int event = parser.getEventType();
		while (event != XmlPullParser.END_DOCUMENT) {
			switch (event) {
			case XmlPullParser.START_DOCUMENT:
				persons = new ArrayList<Person>();
				break;
			
			case XmlPullParser.START_TAG:
				if ("person".equals(parser.getName())) {
					String id = parser.getAttributeValue(0);
					person = new Person();
					person.setId(id);
				}
				if ("name".equals(parser.getName())) {
					String name = parser.nextText();
					person.setName(name);
				}
				if ("age".equals(parser.getName())) {
					Integer age = new Integer(parser.nextText());
					person.setAge(age);
				}
				break;
				
			case XmlPullParser.END_TAG:
				if ("person".equals(parser.getName())) {
					persons.add(person);
				}
				break;
				
			default:
				break;
			}
		}
		xml.close();
		return persons;
	}
}
