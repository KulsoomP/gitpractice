package com.jspyders.hibernateonetmany.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspyders.hibernateonetmany.dto.PlayerDTO;
import com.jspyders.hibernateonetmany.dto.TeamDTO;

public class TeamPlayerDAO {
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
			
			PlayerDTO player1 =new PlayerDTO();
			player1.setId(1);
			player1.setName("Rohit sharma");
			player1.setRole("Batsman");
			player1.setJerseyno(45);
			manager.persist(player1);
			
			PlayerDTO player2 =new PlayerDTO();
			player2.setId(2);
			player2.setName("Bumrah");
			player2.setRole("Bowler");
			player2.setJerseyno(93);
			manager.persist(player2);
			
			PlayerDTO player3 =new PlayerDTO();
			player3.setId(3);
			player3.setName("Hardik Pandy");
			player3.setRole("Batsman");
			player3.setJerseyno(45);
			manager.persist(player3);
			
			List<PlayerDTO> players = Arrays.asList(player1,player2,player3);
			
			TeamDTO team = new TeamDTO();
			team.setId(1);
			team.setName("Mumbai Indian");
			team.setCoach("ZAHEER");
			team.setCity("Mumbai");
			team.setPlayer(players);
			manager.persist(team);
			transaction.commit();
			
		} finally {
					closeConnection();
		}
	}

}
