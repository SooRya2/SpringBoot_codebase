package hello;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //->informs IOC onctainer to create object for this class and for this we need to use componentscan in our configuration file
@Scope("prototype")
public class HelloWorld {

	public String sayHello(String name)
	{
		return "Hello"+name;
	}
}
