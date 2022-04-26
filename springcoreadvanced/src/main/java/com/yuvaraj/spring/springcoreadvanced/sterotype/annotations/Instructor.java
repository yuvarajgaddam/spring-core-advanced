package com.yuvaraj.spring.springcoreadvanced.sterotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")
@Scope("prototype")

public class Instructor {
	
	@Value("10")
	private int id;
	@Value("Yuvaraj")
	private String name;
	@Value("#{topics}")
	private List<String> topics;

	@Autowired
	private Profile profile;



	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", profile=" + profile + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
