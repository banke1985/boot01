package com.zbk.springboot.jwt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;



@SuppressWarnings("deprecation")
@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter  {
    
	 @Bean
	 public AuthenticationInterceptor authenticationInterceptor() {
	        return new AuthenticationInterceptor();
	    }
	 
	
	@Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authenticationInterceptor())
                .addPathPatterns("/**");    // 拦截所有请求，通过判断是否有 @LoginRequired 注解 决定是否需要登录
        super.addInterceptors(registry);
    }
   
}
