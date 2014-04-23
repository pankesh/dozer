package org.gradle;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.panksdmz.dozer.simple.PersonMapper;

public class PersonMapperTest {

	@Test
	public void testSimplePropertySetter() throws Exception {

		Person person = new Person();
		person.setName("TestName");
		person.setSurName("TestSurName");

		Person2 person2 = new PersonMapper().mapPerson(person);

		Assert.assertEquals("TestName", person2.getFirstName());
		Assert.assertEquals("TestSurName", person2.getLastName());
	}
	
	@Test
	public void testNestedPropertySetter() throws Exception {
		
		Person person = new Person();
		person.setAddress("TestAddress");
		
		Person2 person2 = new PersonMapper().mapPerson(person);
		
		Assert.assertEquals("TestAddress", person2.getAddress().getStreet());
	}
	
	@Test
	public void testListPropertySetter() throws Exception {
		
		Person person = new Person();
		
		List<String> childrenNames = new ArrayList<String>();
		childrenNames.add("Patrick");
		childrenNames.add("Leena");
		
		person.setChildrenNames(childrenNames);
		
		Person2 person2 = new PersonMapper().mapPerson(person);
		
		assertEquals("Leena", person2.getChildNames()[1]);
	}
	
	

}
