package com.vikas.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VikasController {

	@GetMapping("/abc")
	 public String getForm() {
		 System.out.println( "This is form ");
		 return "abc";
	 }
}
