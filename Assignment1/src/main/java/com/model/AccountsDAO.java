package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("acdo")
public class AccountsDAO {
	
	@Autowired
	private SessionFactory factory;
	
	public AccountsDTO findByID(int acid) {
		Session session=factory.getCurrentSession();
		AccountsDTO dto=session.get(AccountsDTO.class,acid);
		return dto;
	}
	public SessionFactory getFactory() {
		return factory;
	}
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	public void updateuser(AccountsDTO dto) {
		Session session=factory.getCurrentSession();
		session.persist(dto);
	}
	
}
