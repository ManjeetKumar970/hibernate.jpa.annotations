package org.jpa.demo.Hibername;

import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.mysql.cj.x.protobuf.MysqlxCrud.Find;
// Fatch All the Data
public class FetchDate {
	public static void main(String[] args) {
		Employee emp = new Employee();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager em = factory.createEntityManager();
		//String hql = "from Employee E WHERE E.name='MANJEET'";
		 String hql ="From Employee E "; // Fetch all Data
		//String hql ="From Employee E  ORDER BY E.id asc"; // oder By 
		 Query qry = em.createQuery(hql);
		 List<Employee>es =qry.getResultList();
		for(Employee e :es) {
			System.out.println(e.getId() +"  "+  e.getName()+"  "+ e.getSalary()+"  "+ e.getStream());
		}
		 
	 
	}
}
