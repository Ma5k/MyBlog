package com.mask.blog.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 安全配置类
 * @author Mask
 *
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	/**
	 * 自定义配置
	 */
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
		.antMatchers("/css/**","/images/**","/js/**").permitAll()	//都可以访问
		.antMatchers("/users/**").hasRole("ADMIN")	//需要相应角色才能访问
		.and()
		.formLogin()	//基于Form表单登录验证
		.loginPage("/login").failureUrl("/login-error");
	}
	
	/**
	 * 认证信息管理
	 * @param auth
	 * @throws Exception
	 */
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
		auth
		.inMemoryAuthentication()	//认证信息存储于内存中
		.withUser("mask").password("123").roles("ADMIN");
	}
}
