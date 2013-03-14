package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.web.form.pojo.FlcInfo;

public class Test {
	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/application/configuration/spring/applicationContext.xml");
		FlcInfoAction flcAction = (FlcInfoAction)context.getBean("FlcInfoAction");
		System.out.println("-----------");
		FlcInfo flc = new FlcInfo();
		List<FlcInfo> flcs;
		try {
			flcs = flcAction.getMany(flc);
			for(FlcInfo f : flcs){
				System.out.println(f.getFlcid());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
