package com.blog.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.blog.security.CustomUserDetailService;
import com.blog.security.JwtAuthenticationEntryPoint;
import com.blog.security.JwtAuthenticationFilter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled =true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private CustomUserDetailService customUserDetailService;

	@Autowired
	private JwtAuthenticationEntryPoint unauthorizedHandler;

	@Autowired
	private JwtAuthenticationFilter jwtAuthenticationFilter;

	
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.userDetailsService(this.customUserDetailService).passwordEncoder(passwordEncoder());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.csrf().disable().cors().disable().
		authorizeHttpRequests().antMatchers("/api/v1/auth/login","/api/users","/api/client/addClient","/api/project/addProject","/api/provider/addProvider","/api/saveLocation","/api/saveEnrollment","/api/saveClientLicense","/api//updateClientLicense/{id}","/api/updateClientLocation/{id}","/api/insertClientCoi","/api/updateClientCoi/{id}","/api/insertProviderID","/api/updateProviderID/{id}","/api/insertProviderLocation","/api/updateProviderLocation/{id}","/api/insertproviderEnrollment","/api/updateProviderEnrollment/{id}","/api/insertProviderTraining","/api/updateProviderTraining/{id}","/api/saveproviderCOI","/api/insertproviderInformation","/api/updateproviderInformation/{id}")
		//authorizeHttpRequests().antMatchers(HttpMethod.GET,"/api/v1/auth/login")
		.permitAll()
		
		.antMatchers((HttpMethod.GET)).permitAll()
		//.antMatchers("/api/users/").permitAll()
		.anyRequest().authenticated().and()
	.exceptionHandling().authenticationEntryPoint(unauthorizedHandler).
	and().sessionManagement()
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS).
				and().

				addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);

	}

	@Bean
	public PasswordEncoder passwordEncoder() {

		return new BCryptPasswordEncoder();
	}

	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		
		return super.authenticationManagerBean();
	}	

		
	
	
	

}
