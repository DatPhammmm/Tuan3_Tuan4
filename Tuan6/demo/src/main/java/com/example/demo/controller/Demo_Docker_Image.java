package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Demo_Docker_Image {

	
	 @GetMapping("/hello")
	    public String hello(){
	        return "hello dat pham";
	 }
}
