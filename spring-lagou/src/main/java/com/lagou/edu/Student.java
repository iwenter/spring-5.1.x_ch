package com.lagou.edu;

/**
 * @Description todo
 * @Author wenjunbo
 * @Date 2022/9/15 15:25
 **/


public class Student {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				'}';
	}

	public void initStudent(){
		System.out.println("Student bean init...");
	}


	public void destroyStudent(){
		System.out.println("Student bean destroy...");
	}
}
