package com.test.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	
	public static void main(String[] ar) {
		
		Customer customer = new Customer();
		customer.setCustContact("111");
		customer.setCustName("sihath");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(customer); 
		em.getTransaction().commit();
//		Customer customer = em.find(Customer.class, 2); 
//		System.out.print(customer); 
		
	}

}
