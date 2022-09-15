package com.lagou.edu;

/**
 * @Description todo
 * @Author wenjunbo
 * @Date 2022/9/15 14:49
 **/
public class Person {

	private String uuid;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Override
	public String toString() {
		return "Person{" +
				"uuid='" + uuid + '\'' +
				'}';
	}
}
