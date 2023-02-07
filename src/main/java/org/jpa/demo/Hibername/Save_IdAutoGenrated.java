package org.jpa.demo.Hibername;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Save_IdAutoGenrated {
	public static void main(String[] args) {
		IdAutoGeratedValueExmple person = new IdAutoGeratedValueExmple();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		//person.setId(123);
		person.setName("Manjeet");
		person.setAge(26);
		person.setMobile_No(9700);
		
	     em.getTransaction().begin();
		 em.persist(person);
		
		 em.getTransaction().commit();
		
	}

}

