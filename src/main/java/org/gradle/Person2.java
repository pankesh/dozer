package org.gradle;


public class Person2 {

	private String firstName;
	private String lastName;
	private Address address;
	private String[] childNames;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String[] getChildNames() {
		return childNames;
	}

	public void setChildNames(String[] childNames) {
		this.childNames = childNames;
	}

}
