package com.cafe24.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * @RequestMapping
 * type
 * 단, 명시적으로 표현해주는 것이 추후 해석하기 용이함
 */
@RequestMapping("/guestbook/*")
@Controller
public class GuestbookController {

	@ResponseBody
	@RequestMapping
	public String list() {
		return "GuestbookController:List";
	}
}
