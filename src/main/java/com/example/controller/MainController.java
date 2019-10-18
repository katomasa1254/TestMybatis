package com.example.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.LoginLogic;


@ResponseBody
@RestController
@MapperScan("com.example.db")
public class MainController {

	@RequestMapping("/login/{id}/{pw}")
	public String login(@PathVariable String id, @PathVariable String pw) {
		
		LoginLogic ll = new LoginLogic();
		ll.loginMain(id, pw);
				
		return pw;
	}

}
