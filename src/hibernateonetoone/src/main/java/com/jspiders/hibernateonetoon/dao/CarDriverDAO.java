package com.jspiders.hibernateonetoon.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernateonetoon.dto.CarDTO;
import com.jspiders.hibernateonetoon.dto.DriverDTO;

public class CarDriverDAO {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("OneToOne");
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
			
			DriverDTO driver = new DriverDTO();
			driver.setId(1);
			driver.setName("Akshay");
			driver.setContact(7866545909L);
			manager.persist(driver);
			
			CarDTO car = new CarDTO();
			car.setId(1);
			car.setBrand("Brand");
			car.setModel("NEXON");
			car.setRegno("MH106677");
			car.setDriver(driver);
			manager.persist(car);
			
			transaction.commit();
			
		} finally {
			closeConnection();

		}
	}
}
