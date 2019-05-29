package com.cafe24.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
/*
 * @RequestMapping
 * type + method 
 */
@Controller
@RequestMapping("/user")
public class UserController {
		@RequestMapping(value="/join", method=RequestMethod.GET)
	// @GetMapping("/join") 완전 동일
	public String join() {

		return"/WEB-INF/views/join.jsp";
	}	
	
	
	@RequestMapping(value= {"/join", "/j"}, method=RequestMethod.POST)
	// @PostMapping("/join", "/j") 완전 동일
	// 가입 화면에서 valid 체크하는 부분을 넣어주며 modelAttribute를 넣어준다
	public String join(@ModelAttribute UserVo userVo) {
		System.out.println(userVo);

		if(valid(userVo) == false) {
			return "/WEB-INF/views/join.jsp";
		}
		// redirect가 아래와 같은 작업으로 가능하다 
		return"redirect:/hello";
	}
	
	private boolean valid(UserVo userVo) {
		return false;
	}
	
}
