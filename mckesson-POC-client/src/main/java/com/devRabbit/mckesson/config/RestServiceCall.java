package com.devRabbit.mckesson.config;

import java.nio.charset.Charset;
import org.apache.commons.codec.binary.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestOperations;



@Component
public class RestServiceCall {

	
	@Autowired
	private RestOperations restOperations;
	
	@Value("${service.url}")
	private String url;
	
	@Autowired
	private Environment env;
	
	public <T ,R extends Object> ResponseEntity<T> execute(String uri, HttpMethod httpMethod,R requestBody, Class<T> className)
	{
		HttpEntity<R> request= new HttpEntity<>(requestBody,createHeaders());
		ResponseEntity<T> result= restOperations.exchange(url+uri, httpMethod,request,className);
		return result;
	}	
	
	HttpHeaders createHeaders(){
		   return new HttpHeaders() {{
		         String auth = env.getProperty("webservice.authentication.username") + ":" + env.getProperty("webservice.authentication.password");
		         byte[] encodedAuth = Base64.encodeBase64( 
		            auth.getBytes(Charset.forName("US-ASCII")) );
		         String authHeader = "Basic " + new String( encodedAuth );
		         set( "Authorization", authHeader );
		      }};
		}
}
