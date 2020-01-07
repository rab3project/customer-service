package com.customerService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

import com.amazon.sqs.javamessaging.SQSConnectionFactory;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;


@Configuration
@EnableJms
public class SqsConfig {
	
	@Value("${sqs.queue.endpoint}")
	private String endPoint;
	
	@Value("${sqs.queue.name}")
	private String queueName;
	
	@Value("${aws.accesskey}")
	private String accessKey;
	
	@Value("${aws.secretkey}")
	private String secretKey;
	
	@Bean
    public JmsTemplate createJMSTemplate() {
 
        SQSConnectionFactory sqsConnectionFactory = SQSConnectionFactory.builder()
                .withAWSCredentialsProvider(awsCredentialsProvider())
                .withEndpoint(endPoint)
                .withNumberOfMessagesToPrefetch(10).build();
 
        JmsTemplate jmsTemplate = new JmsTemplate(sqsConnectionFactory);
        jmsTemplate.setDefaultDestinationName(queueName);
        jmsTemplate.setDeliveryPersistent(false);
 
 
        return jmsTemplate;
    }
 
	@Bean
    public AWSCredentialsProvider awsCredentialsProvider() {
		AWSCredentialsProvider credentials = new AWSCredentialsProvider() {
			
			public void refresh() {
				
			}
			
			public AWSCredentials getCredentials() {
				return new BasicAWSCredentials(accessKey, secretKey);
			}
		};
		
		return credentials;
    }

	
}
