package com.devRabbit.mckesson.config;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

@Component
public class RestServiceConfig {
	
	
	@Bean
	public RestOperations createRestTemplate(ClientHttpRequestFactory clientHttpRequestFactory) 
	{
		return new RestTemplate(clientHttpRequestFactory);
		
	}
	
	@Bean
	public ClientHttpRequestFactory createClientHttpRequestFactory
	(@Value("${connect.timeout}") final int connectTimeOut,@Value("${read.timeout}") final int readTimeOut)
	{
		
		HttpComponentsClientHttpRequestFactory httpComponentsClientHttpRequestFactory	=new HttpComponentsClientHttpRequestFactory();
		httpComponentsClientHttpRequestFactory.setConnectTimeout(connectTimeOut);
		httpComponentsClientHttpRequestFactory.setReadTimeout(readTimeOut);
	return httpComponentsClientHttpRequestFactory;
	}
	

}
