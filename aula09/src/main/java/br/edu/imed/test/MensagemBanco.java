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

public class MensagemBanco {
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("aula09");
	static String user_name = null;
	@Test
	public static void mensbanco(String telefone, String email, String func, String idade, String peso, String Mensagem) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction trans = null;
		
		try {
			trans = em.getTransaction();
			trans.begin();
			
			Mensagemadm mm = new Mensagemadm();
			mm.setNome_user(user_name);
			mm.setTelefone(telefone);
			mm.setEmail(email);
			mm.setFunc(func);
			mm.setIdade(idade);
			mm.setPeso(peso);
			mm.setMensagem(Mensagem);
			
			//aa.setNome_user("JUtest");
			//aa.setModalidades("JUtest");
			//aa.setData("JUtest");
			//aa.setHorario(t2);
			//aa.setPersonal(t3);
			
			
			em.persist(mm);
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

















