package com.panksdmz.dozer.simple;

import java.util.ArrayList;

import org.dozer.DozerBeanMapper;
import org.dozer.DozerBeanMapperSingletonWrapper;
import org.dozer.Mapper;
import org.gradle.Person;
import org.gradle.Person2;

public class PersonMapper {
	private Mapper mapper = DozerBeanMapperSingletonWrapper.getInstance();

	public Person2 mapPerson(Person person) {
		ArrayList<String> mappingFileUrls = new ArrayList<String>();
		mappingFileUrls.add("META-INF/DozerBeanMapping.xml");
		
		((DozerBeanMapper) mapper).setMappingFiles(mappingFileUrls);

		Person2 person2 = mapper.map(person, Person2.class);
		return person2;
	}
}
