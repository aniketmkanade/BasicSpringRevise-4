package com.seleniumexpress.di.dependency_injection_object_type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client 
{
	public static void main(String[] args) 
	{
		/*MathCheat cheat = new MathCheat();
		Student student = new Student();
		student.setMathCheat(cheat);
		student.cheating();*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("xml loaded");
		Student student = context.getBean("stu", Student.class);
		student.cheating();
		
		AnotherStudent anotherStudent = context.getBean("anotherStudent", AnotherStudent.class);
		anotherStudent.startCheating();
		
	}
}
