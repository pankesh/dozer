package org.gradle;

import java.util.List;



public class Person {
	private String name;
	private String surName;
	private String address;
	private List<String> childrenNames;

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<String> getChildrenNames() {
		return childrenNames;
	}

	public void setChildrenNames(List<String> childrenNames) {
		this.childrenNames = childrenNames;
	}
}
