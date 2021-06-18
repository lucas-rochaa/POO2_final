package br.edu.imed.test;

import static org.junit.Assert.*;
import static org.junit.Assert.*;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.junit.Test;

public class testarcon {
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("aula09");
	
	@Test
	public static void cadastrar(String nome, String senha) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction trans = null;
		
		try {
			trans = em.getTransaction();
			trans.begin();
			
			Usuario u1 = new Usuario();
			u1.setId(null);
			///u1.setNome("JUtest");
			///u1.setSenha("JUtest");
			u1.setNome(nome);
			u1.setSenha(senha);

			
			em.persist(u1);
			
			
			trans.commit();

			
		}catch (Exception e) {
			if (trans != null) {
				trans.rollback();

			}
			e.printStackTrace();
		}finally {
			em.close();
		}
		
	} public static boolean listuser(String user, String pass) {
			
		Usuario u = null;
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();		
		
		try {
			
			TypedQuery<Usuario> tq = em.createQuery("SELECT u FROM usuarios u WHERE u.nome_user = '"+user+"' AND u.senha_user = '"+pass+"'", Usuario.class);
			u = tq.getSingleResult();
			return true;

		}catch(Exception e) {
			e.printStackTrace();
			return false;
		
		} finally {
			em.close();
		}
				
		
	}


}

















