package org.gradle;

import org.junit.Assert;
import org.junit.Test;

import com.panksdmz.dozer.simple.PersonMapper;

public class PersonMapperTest {
	
	@Test
	public void testname() throws Exception {
		
		Person person = new Person();
		person.setName("TestName");
		person.setSurName("TestSurName");
		person.setAddress("TestAddress");

		Person2 person2 = new PersonMapper().mapPerson(person);
		
		Assert.assertEquals("TestName", person2.getFirstName());
		Assert.assertEquals("TestSurName", person2.getLastName());
		Assert.assertEquals("TestAddress", person2.getAddress().getStreet());
		
	}

}
