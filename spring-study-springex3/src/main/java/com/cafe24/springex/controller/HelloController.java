package com.cafe24.springex.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String hello() {
		return "/WEB-INF/views/hello.jsp";
	}
	
	@RequestMapping("/hello2")
	public ModelAndView hello2() {
		 ModelAndView mav = new ModelAndView();
		 mav.addObject("email","SungmoKim@gmail.com");
		 mav.setViewName("/WEB-INF/views/hello.jsp");
		 
		 return mav;
	}

	@RequestMapping("/hello3")
	public String hello3(Model model) {
		model.addAttribute("email", "둘리");
		return "/WEB-INF/views/hello.jsp";
	}
	
	
	@RequestMapping("/hello4")
	public String hello4(Model model,
			//이메일에 대한 request parameter가 넘어오면 그 것을 model 내 email 파라미터에 셋팅한다. 
			@RequestParam("email") String email,
			/*어노테이션에 value 생략 시 변수 이름으로 넘어온 값으로 설정한다.*/
			@RequestParam String name) {
		model.addAttribute("email", email);
		System.out.println(name);
		return "/WEB-INF/views/hello.jsp";
	}
	
	/* 서블릿 기술이 침투했기 때문에 비추천, controller에서 request를 굳이 받아서 구현할 이유가 없음 */
	@RequestMapping("/hello5")
	public String hello5(Model model, HttpServletRequest request) {
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");		
		model.addAttribute("email", email);
		System.out.println(name);
		return "/WEB-INF/views/hello.jsp";
	}
}
