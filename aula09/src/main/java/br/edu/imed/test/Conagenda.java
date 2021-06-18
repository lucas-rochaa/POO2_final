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

public class Conagenda {
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("aula09");
	static String user_name = null;
	@Test
	public static void agendar(String t, String t1, String t2, String t3) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction trans = null;
		
		try {
			trans = em.getTransaction();
			trans.begin();
			
			Agendamento aa = new Agendamento();
			aa.setNome_user(user_name);
			aa.setModalidades(t);
			aa.setData(t1);
			aa.setHorario(t2);
			aa.setPersonal(t3);
			
			//aa.setNome_user("JUtest");
			//aa.setModalidades("JUtest");
			//aa.setData("JUtest");
			//aa.setHorario(t2);
			//aa.setPersonal(t3);
			
			
			em.persist(aa);
			trans.commit();
			
		}catch (Exception e) {
			if (trans != null) {
				trans.rollback();

			}
			e.printStackTrace();
		}finally {
			em.close();
		}
		
	}

	public static void user(String user) {
		user_name = user;
	}

}

















