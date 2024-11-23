package com.excelr.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.excelr.springproject.springprj.Student;

@Configuration
public class SpringConfig {

	@Bean
	public Student create_std()
	{
		Student std=new Student();
		return std;
		
	}
	
}
