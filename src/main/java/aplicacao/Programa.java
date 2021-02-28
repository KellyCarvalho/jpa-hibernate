package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
	Pessoa pessoa = new Pessoa(0,"Kelly","18kellycarvalho@gmail.com");
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();
	em.persist(pessoa);
	em.getTransaction().commit();
	System.out.println("Tudo ok!!!!!!!!");
	
	System.out.println(pessoa);
	

	}

}
