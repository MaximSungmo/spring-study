package com.cafe24.springex.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
// configDriven
@EnableWebMvc
// ComponentScan은 지정된 위치에서 컴포넌트를 스캐닝하라는 의미 
@ComponentScan({"com.cafe24.springex.controller"})
public class WebConfig {

}
