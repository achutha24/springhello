package com.hello.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Api(value = "Demo APIs", tags = "Demo APIs Spring Boot")
public class EmployeeController {
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	@ApiOperation(value = "To Get Welcome Message")
    public String getMessage() 
    {
		return "Hello, Welcome to Spring Boot!";
    }

}
