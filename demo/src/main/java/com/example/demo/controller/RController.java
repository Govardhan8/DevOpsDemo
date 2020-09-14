package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.MyName;

@RestController
@RequestMapping("")
public class RController {

	@GetMapping("/get")
	public MyName name()
	{
		MyName name=new MyName(1, "gova");
		return name;
	}
	
	@GetMapping("/getname")
	public MyName name()
	{
		MyName name=new MyName(1, "Govardhan");
		return name;
	}	
}
