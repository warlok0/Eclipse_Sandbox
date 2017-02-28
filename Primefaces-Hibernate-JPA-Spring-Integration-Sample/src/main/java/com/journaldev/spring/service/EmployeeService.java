package com.journaldev.spring.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.journaldev.hibernate.jpa.data.Alumno;

@Component
public class EmployeeService {

	@PersistenceContext
	private EntityManager em;
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Transactional
	public void register(Alumno emp) {
		// Save employee
		this.em.persist(emp);
	}
	
}
