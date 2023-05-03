package com.college.management.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthorisationTwo {
	
	@After("execution(* com.college.management.controller.TeacherController.getTeacherLogin())")
	public void check() {
		System.out.println("check_____!");
	}
	
	@Before("execution(* com.college.management.controller.TeacherController.getTeacherLogin())")
	public void checkAfter() {
		System.out.println("check______!");
	}
}
