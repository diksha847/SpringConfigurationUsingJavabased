package com.excelr.springproject.springprj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.excelr.resources.SpringConfig;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
    	
    	
    	Student s1=(Student) context.getBean("create_std");//accessed the bean
    	s1.setId(101);
    	s1.setMarks(95);
    	s1.setName("kamla");
   
    	System.out.println(s1);
    	//printing the bean
    	
    }
}
