package com.spring.springCore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
    	
    	Plane cp =(Plane)context.getBean("cp");
    	System.out.println(cp);
    	Plane fp =(Plane)context.getBean("fp");
    	System.out.println(fp);
    	Plane pp =(Plane)context.getBean("pp");
    	System.out.println(pp);
    }
}
