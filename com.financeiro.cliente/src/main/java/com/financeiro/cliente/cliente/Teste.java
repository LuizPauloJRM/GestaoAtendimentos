package com.financeiro.cliente.cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.financeiro.cliente.model.Cliente;

public class Teste {
	//Conexao entre a persistencia de dados e o banco 
	//Variaveis stact para gerenciar 
	//Nome la no persistence BancoPU 
	public static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BancoPU");
			
	private static EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	public static void main(String[] args) {
//		Find
//		Cliente cliente = entityManager.find(Cliente.class,1);
//		System.out.println("Nome do cliente" + cliente.getNome());
		
		
//		Insert
		
//		Criando mais uma instancia da classe cliente
//		Trabalhar com transação
//		Obter uma transação atual e persistir o dado objeto que vai ser persistido no banco de dados 
//		Objeto gerenciado pelo JPA 
//		Cliente cliente = new Cliente();
//		cliente.setNome("GOOGLE");
//		entityManager.getTransaction().begin();
//		entityManager.persist(cliente);
//		entityManager.getTransaction().commit();
		
		
//		Delete 
//		Cliente cliente = entityManager.find(Cliente.class,2);
//		entityManager.getTransaction().begin();
//		entityManager.remove(cliente);
//		entityManager.getTransaction().commit();
		
//		Modify
		Cliente cliente = new Cliente();
		cliente.setId(1);
		cliente.setNome("FACEBOOK INC.");
		entityManager.getTransaction().begin();
		entityManager.merge(cliente);
		entityManager.getTransaction().commit();
		
		
	}
}