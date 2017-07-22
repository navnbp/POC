package com.devRabbit.mckesson.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig  extends WebSecurityConfigurerAdapter{
	
	public void configure(HttpSecurity httpSecurity) throws Exception 
	{
		
//		http
//        .authorizeRequests()
//        .antMatchers("/signup").permitAll()
//        .antMatchers("/").permitAll()
//        //.antMatchers("/first").hasAuthority("Service_Center")
//        .antMatchers("/login").permitAll()
//        .anyRequest().fullyAuthenticated()
//.and().formLogin()
//        .loginPage("/login")
//        .usernameParameter("email")
//        .passwordParameter("password")
//        .defaultSuccessUrl("/default")
//        .failureUrl("/login?error").permitAll()
//.and().logout()
//        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//        .logoutSuccessUrl("/login?logout")
//        .deleteCookies("JSESSIONID")
//        .invalidateHttpSession(true).permitAll();
		
		httpSecurity.csrf().disable().
		authorizeRequests()//.anyRequest().authenticated()
		.antMatchers("/assets/**", "/**", "/css/**", "/js/**", "/fonts/**", "/images/**", "/public/rest/**","/login*","/logout*","/signin/**","/signup/**").permitAll()
		.antMatchers("/admin/*").hasAnyRole("ADMIN")
		.antMatchers("/user/*").hasAnyRole("USER")
		.and()
		.formLogin().loginPage("/login").permitAll().and().httpBasic().disable();
		
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception 
	{
//		auth.inMemoryAuthentication()
//		.withUser("user").password("user").roles("USER")
//		.and()
//		.withUser("admin").password("admin").roles("ADMIN");
	}
	
	

}
