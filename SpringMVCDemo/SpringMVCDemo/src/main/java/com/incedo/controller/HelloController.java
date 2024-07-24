package com.incedo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //-->same as component
@RequestMapping("/incedo") //--->this is root mapping ....used when there many mappings available...here we are mapping our controller with one url
public class HelloController {
    @GetMapping()  //---> This is our URI( Resource identifier) --when someone sends request to the url incedo..i want ot exceute this method
	public String sayHello(Model m) //-->when response body is used dispatcherservlet directly sends the output to client without going to view
	{
    	//--->key-value pair
		m.addAttribute("Name", "Soorya");
    	return "Hello";
	}
    
    
    
    
    
    
    
    /*@GetMapping("/getname")  //--->exceuted when url is "incedo/getname"
	public @ResponseBody String sayHello(String name)
	{
		return "Hello"+name;
	}*/
    /*@GetMapping("/{name}")    //--->Whatever the name we enter in url will be displayed
	public @ResponseBody String sayHello(@PathVariable String name)
	{
		return "Hello"+ name;
	}*/
    
}
