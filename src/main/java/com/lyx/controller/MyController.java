package com.lyx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController
{
	@GetMapping("/foo")
	public String foo()
	{
		return "测试成功";
	}
}