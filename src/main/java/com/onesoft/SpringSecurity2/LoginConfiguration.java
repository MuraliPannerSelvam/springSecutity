package com.onesoft.SpringSecurity2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class LoginConfiguration extends WebSecurityConfigurerAdapter {

//  in public 	

//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		
//		auth.inMemoryAuthentication().withUser("Murali").password("$2a$10$O0TT.xrHLcPcLYNj93W4I.rxvCfqvT5xSf0WvPQvG0ybcRs0q7qoS").roles("student").and().withUser("Prakash").password("$2a$10$Od8Sd6hLJkTQzLnqLt.fK.py/ifZDw.h9MK88C3Hio7diIDCQUNli").roles("trainer");
//		
//	}
//	

//	@Bean
//	public PasswordEncoder getPassword1() {
////	return NoOpPasswordEncoder.getInstance();
//		return new BCryptPasswordEncoder(10);
//	}
//	
//// in private to set the user
//	
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		
//		http.authorizeHttpRequests().antMatchers("/trainer").hasAnyRole("trainer");
//		
//		http.authorizeHttpRequests().antMatchers("/trainer").hasAnyRole("trainer","student");
//		
//		http.authorizeHttpRequests().antMatchers("/student").permitAll().and().formLogin();
//		
//	}

	@Autowired
	MyUseService mySer;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.userDetailsService(mySer);

	}

	@Bean
	public PasswordEncoder getPassword() {
		return NoOpPasswordEncoder.getInstance();
	}

}
