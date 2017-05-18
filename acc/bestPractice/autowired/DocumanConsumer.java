package com.ccc.rabbitmq;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DocumanConsumer {

	final String consumer = "consumer";
	
	@Value("${app.documan.rabbitmq.queues.documan}")
	private String docuName;
	
	@Scheduled(fixedRate = 1500)
	public void methodCall(){
		System.out.println("called:" + consumer + ": " + docuName);
	}
	
	public void methodWrite(){
		System.out.println("write:" + consumer);
	}
}
