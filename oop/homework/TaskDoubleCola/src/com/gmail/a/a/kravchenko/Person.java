package com.gmail.a.a.kravchenko;

public class Person{
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
}
