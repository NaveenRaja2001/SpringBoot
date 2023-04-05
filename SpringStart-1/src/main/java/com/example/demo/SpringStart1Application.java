package com.example.demo;

import javax.transaction.Transactional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

import com.model.InsufficientBalanceException;
import com.model.TransactionService;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
@ComponentScan(basePackages = {"com"})
public class SpringStart1Application {

	public static void main(String[] args) throws InsufficientBalanceException {
		ApplicationContext applicationContext=SpringApplication.run(SpringStart1Application.class, args);
		
//		MyService myservice=ctx.getBean("myService",MyService.class);
//		myservice.doService(100,600);
		
		
		TransactionService transactionService = applicationContext.getBean("transactionService",TransactionService.class);
		transactionService.moneyTransfer(100, 200, 10000);
//		System.out.println(DTO);
	}

}
