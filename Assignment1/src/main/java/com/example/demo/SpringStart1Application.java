package com.example.demo;

import javax.transaction.Transactional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

import com.model.InsufficientBalance;
import com.model.MyService;
import com.model.TransactionService;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
@ComponentScan(basePackages = {"com"})
public class SpringStart1Application {

	public static void main(String[] args) throws InsufficientBalance {
		ApplicationContext ctx=SpringApplication.run(SpringStart1Application.class, args);
//		AccountsDAO DAO=ctx.getBean("acdo",AccountsDAO.class);
//		AccountsDTO DTO=DAO.findByID(200);
//		System.out.println(DTO);

		
//		MyService myservice=ctx.getBean("myService",MyService.class);
//		myservice.doService(200,400);
		
		
		TransactionService tss = ctx.getBean("tss",TransactionService.class);
		tss.moneyTransfer(100, 200, 2);
//		System.out.println(DTO);
	}

}
