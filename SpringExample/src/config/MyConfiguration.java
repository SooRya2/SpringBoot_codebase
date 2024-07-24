package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.Address;
import com.Employee;

import hello.HelloWorld;

@Configuration
@ComponentScans({@ComponentScan("com"),@ComponentScan("hello")}) //-->Searches for the component in the package mentioned
public class MyConfiguration { //--->This is the class IOC container is going to read

	/*@Bean
	@Scope("prototype")
	public HelloWorld getHelloWord() //--->when this method is called ..give me a helloworld object
	{
		return new HelloWorld();
	}
	
	@Bean
	public Employee getEmployee()
	{
		return new Employee(new Address("Salem"));
	}
	
	@Bean(name="address1")
	public Address getAddress()
	{
		Address add=new Address();
		add.setCity("salem");
		add.setCountry("India");
		add.setZip(2222);
		return add;
	}
	
	@Bean(name="address")
	public Address getAddress1()
	{
		Address add=new Address();
		add.setCity("chennai");
		add.setCountry("TN");
		add.setZip(2222);
		return add;
	}*/
	
}
