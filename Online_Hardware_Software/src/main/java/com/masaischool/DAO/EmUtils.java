package com.masaischool.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
public class EmUtils {

		static EntityManagerFactory emf;
		
		static {
			emf=Persistence.createEntityManagerFactory("Online_Hardware_Software");
		}
		static EntityManager getAnEntityManager() {
			return emf.createEntityManager();
		}

}
