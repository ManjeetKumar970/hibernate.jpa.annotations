package org.jpa.demo.Hibername;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Eloging_Save {
	public static void main(String[] args) {
		Elogin emp =new Elogin();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		emp.setName("Manjgseet");
		emp.setPassword("125gdg3");
		emp.setDate(LocalDate.parse("2023-06-02"));
		manager.persist(emp);
		
		manager.getTransaction().commit();
		
		
		
	}

}
