package com.cafe24.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {

	@ResponseBody
	@RequestMapping("/board/update")
	public String update(
	//		String name
	//		@RequestParam String name
	//		명시적으로 표현하여 주는 방식을 추천함 
			@RequestParam("name") String name
	) {
		System.out.println("---"+ name + "---");
		return "BoardController:update()";
	}
	
	
	@ResponseBody
	@RequestMapping("/board/write")
	public String write(
			//param이 들어오지 않아도 null값으로 접속은 가능하게 해주는 역할(required=false)
			//param이 들어오지 않으면 defaultValue로 채워줘(required=true, defaultValue="")
			
			@RequestParam(value="n", required=true, defaultValue="") String name,
			@RequestParam(value="age", required=true, defaultValue="0") int age
	) {
		System.out.println("---"+ name + "---");
		System.out.println("---"+ age + "---");
		return "BoardController:write()";
	}
	
	//URL에서 ~~?no=10 방식에서 ~~/10 으로 바꾸어 주는 방법 
	@ResponseBody
	@RequestMapping("/board/view/{no}")
	public String view(@PathVariable(value="no") Long no) {
		
		return "BoardController:view("+no+")";
	}
	
	
	
	
	
}
