package com.iu.b5.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AnyRequestMatcher;
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	public void configure(WebSecurity web) throws Exception {
		// TODO Auto-generated method stub
		web.ignoring()
					.antMatchers("/css/**")
					.antMatchers("/js/**")
					.antMatchers("/images/**")
					.antMatchers("/vendor/**")
					.antMatchers("/favicon/**")
					.antMatchers("/resources/**");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.cors()
			.and()
			.csrf().disable()
			.authorizeRequests()
								.antMatchers("/").permitAll()
								.antMatchers("/notice/selectList", "/notice/selectOne").permitAll()
								.antMatchers("/notice/**").hasRole("ADMIN")
								//위 처럼 하거나, 아래 처럼 하거나.
								//.antMatchers("/notice/insert", "/notice/update", "/notice/delete").hasRole("ADMIN")
								//ROLE_ 를 제외한 나머지 이름만 넣을 것 -> 오류뜸
								//.antMatchers("/member/memberLogin").permitAll()
								.anyRequest().authenticated()
								//위의 antMatchers 외에, 그 외 나머지는 인증(로그인)이 되어야 가능
								.and()
			//개발자가 만든 로그인 폼으로 이동
			.formLogin()
						.loginPage("/member/memberLogin")
						//파라미터이름은 security에서는 username, 이것과 이름이 다를 경우 따로 작성
						.usernameParameter("id")
						.passwordParameter("pw")
						.permitAll()
								;
	}
}
