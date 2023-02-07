package org.jpa.demo.Hibername;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;

public class TestConfiguratonDemo {
	public static void main(String[] args) {
		Employee e = new Employee();
		 e.setId(50);
		 e.setName("Manjeet");
		 e.setSalary(50000);
		 e.setStream("MCA");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager em =factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		
		
		
	}

}
