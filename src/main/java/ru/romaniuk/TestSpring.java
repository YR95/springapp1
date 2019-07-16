package ru.romaniuk;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) throws PerformerEcxeption {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.getBean("poetStar", Performer.class).perform();
		context.getBean("kenny", Performer.class).perform();
		
	}
}
