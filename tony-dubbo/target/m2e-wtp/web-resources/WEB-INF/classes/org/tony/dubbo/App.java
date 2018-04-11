package org.tony.dubbo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tony.api.Test;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {

			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
			Test test = (Test) applicationContext.getBean("demoService");
			System.out.println(test.sayHello("xyh"));
		}

	}
}
