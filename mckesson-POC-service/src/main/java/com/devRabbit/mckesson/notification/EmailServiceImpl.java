package com.devRabbit.mckesson.notification;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;




@Component
public class EmailServiceImpl implements EmailService {
	
	@Autowired
	public JavaMailSender emailSender;
	
	
	
	@Autowired
	private Environment env;
	
	
	
	
	public void sendMail(String to,String subject,String text) throws Exception
	{
	
		SimpleMailMessage message=new SimpleMailMessage();
		
		message.setTo(to);
		message.setSubject(subject);
		message.setText(text);
		emailSender.send(message);
		
		
		
	}
	
	@Override
	public void sendMessageWithAttachment(
	  String to, String subject, String text, String fileName) throws Exception  {
	     
	    MimeMessage message = emailSender.createMimeMessage();
	      
	    MimeMessageHelper helper = new MimeMessageHelper(message, true);
	     
	    helper.setTo(to);
	    helper.setSubject(subject);
	    helper.setText(text);
	    String absolutePath=env.getProperty("attachment.absolutePath")+"/"+fileName;  
	    FileSystemResource file 
	      =new FileSystemResource(absolutePath);
	    helper.addAttachment("Invoice", file);
	    emailSender.send(message);
	   
	}
	
}
	
