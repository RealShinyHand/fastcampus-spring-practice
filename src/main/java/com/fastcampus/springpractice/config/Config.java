package com.fastcampus.springpractice.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ComponentScan("com.fastcampus.springpractice") //이 하위
@Configuration //스프링 설정용 클래스 명시 , 어노테이션,인터페이스 개념인거 아시죠?
public class Config {

}
