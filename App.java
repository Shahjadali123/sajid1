package com.shahjad2.demo2;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathApplicationContext("spring.xml");
    	Vehicle obj=(Vehicle)context.getBean("vehicle");
    	obj.drive();
    }
}
