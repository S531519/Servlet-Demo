package com.veridic;

import java.util.List;

public class Data {
	String name1;
	String email1;
	String address1;

	public Data(String name1, String email1, String address1) {
		super();
		this.name1 = name1;
		this.email1 = email1;
		this.address1 = address1;
	}

	@Override
	public String toString() {
		return "Data [name1=" + name1 + ", email1=" + email1 + ", address1=" + address1 + "]";
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

}
