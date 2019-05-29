package com.cafe24.springex.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
// configDriven
@EnableWebMvc
// ComponentScan은 지정된 위치에서 컴포넌트를 스캐닝하라는 의미 
@ComponentScan({"com.cafe24.springex.controller"})
public class WebConfig {

	// spring-servlet.xml에서 작성하던 viewResolver Bean 생성 
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setExposeContextBeansAsAttributes(true);
		
		return resolver; 
	}
	
}
