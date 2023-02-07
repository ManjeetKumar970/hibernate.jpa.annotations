package org.jpa.demo.Hibername;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveEmployee {
	
	public static void main(String[] args) {
		 Employee e = new Employee();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager em =factory.createEntityManager();
		 e.setId(121);
		 e.setName("Vikash kumar");
		 e.setSalary(46);
		 e.setStream("MC4A");
	
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		
				
		System.out.println(e);		
	}

}
