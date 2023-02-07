package org.jpa.demo.Hibername;

import org.hibernate.mapping.*;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchDataUsingColum {
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager  manager = factory.createEntityManager();
		//String hql = "FROM Employee E";//Fetch All the Data
		String hql = "FROM Employee E WHERE E.name='MANJEET'";
	    Query query = manager.createQuery(hql);
	    List <Employee>es =query.getResultList();
		for(Employee e :es) {
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getStream());
			System.out.println(e.getSalary());
			
		}
		
	}

}
