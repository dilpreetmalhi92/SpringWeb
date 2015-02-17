package com.learning;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
@RequestMapping("/controller/")
public class HelloController {

	
@RequestMapping(value="/welcome/{country}/{user}",produces={"application/json"})
public String helloWorld(Model model, @PathVariable Map<String,String> pathVars){	
	String name= pathVars.get("user");
	String country=	pathVars.get("country");	
	
	Hello hello= new Hello("Great ");
	 model.addAttribute("msg", hello.getMsg()+country+" "+name);
		return "index";
}
@RequestMapping(value="/hi",produces={"application/json"})
public String hiWorld(Model model){	
	Hello hello= new Hello("Hi!!!!");
	 model.addAttribute("msg", hello.getMsg());
		return "index";
}
}