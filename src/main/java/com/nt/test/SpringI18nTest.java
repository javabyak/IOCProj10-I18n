package com.nt.test;

import java.util.Locale;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringI18nTest {

	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//create local object
		Locale locale=new Locale(args[0],args[1]);
		//get msg from local specific or base properties file
		String msg1=ctx.getMessage("welcome.msg",new Object[]{}, locale);
		String msg2=ctx.getMessage("goodbye.msg",new Object[]{}, locale);
		System.out.println(msg1+" "+msg2);
		//close container
		ctx.close();
		

	}

}
