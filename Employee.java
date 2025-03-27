package com.as;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="myemp")
public class Employee {
	@Value(value="101")
	private int id;
	@Value(value="Vivek")
	private String name;
	@Value(value="23")
	private int age;
	@Value(value="30000")
	private double sal;
	@Value(value="ASE")
	private String job;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getSal() {
		return sal;
	}
	public String getJob() {
		return job;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", sal=" + sal + ", job=" + job + "]";
	}

}
