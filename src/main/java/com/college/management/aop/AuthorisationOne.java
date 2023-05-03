package com.college.management.aop;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class AuthorisationOne {
	
	@Before("execution (* com.college.management.controller.StudentController.getAllStudentLogin())")
	public void checkAuthorization() {	
		System.out.println("checked");
	}
	
	@After("execution (* com.college.management.controller.StudentController.getAllStudentLogin())")
	public void checkAuthorization1() {	
		System.out.println("checked____!");
	}
}
