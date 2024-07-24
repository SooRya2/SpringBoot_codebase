package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Employee;

import config.MyConfiguration;

public class HelloMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfiguration.class); // --->Initializing the
																								// IOC container
		HelloWorld h = ctx.getBean(HelloWorld.class);
		//Employee e=ctx.getBean(Employee.class);
		System.out.println(h.sayHello("Soorya"));
		//e.printEmployee();
	}

}
