package com.simplilearn.oops;

public class Encapsulation {
	private String name;
	private String age;
	
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		Encapsulation s = new Encapsulation();
		s.setName("javed");
		System.out.println(s.getName());
		
	}
	

}
