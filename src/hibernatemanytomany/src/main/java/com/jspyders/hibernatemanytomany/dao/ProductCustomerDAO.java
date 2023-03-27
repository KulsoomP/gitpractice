package com.jspyders.hibernatemanytomany.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspyders.hibernatemanytomany.dto.CustomerDTO;

public class ProductCustomerDAO {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("OneToMany");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();

	}

	private static void closeConnection() {
		if (factory != null) {
			factory.close();
		}
		if (manager != null) {
			manager.close();
		}
		if (transaction.isActive()) {
			transaction.rollback();
		}

	}
public static void main(String[] args) {
	try {
		openConnection();
		transaction.begin();
		
		CustomerDTO customer1 = new CustomerDTO();
		customer1.setId(1);
		customer1.setName("Kulsoom");
		customer1.setContact(7588313909L);
		customer1.setCity("pune");
		manager.persist(customer1);
		
		CustomerDTO customer2 = new CustomerDTO();
		customer2.setId(1);
		customer2.setName("Makko");
		customer2.setContact(9403403545L);
		customer2.setCity("Sangli");
		manager.persist(customer2);
		
		CustomerDTO customer3 = new CustomerDTO();
		customer3.setId(1);
		customer3.setName("sap");
		customer3.setContact(9403403540L);
		customer3.setCity("Mubmai");
		manager.persist(customer3);
		
		
		transaction.commit();
		
	} finally {
		closeConnection();
	}
}
}
