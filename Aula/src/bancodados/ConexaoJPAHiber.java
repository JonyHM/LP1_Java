package bancodados;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConexaoJPAHiber {
	
	public void InsereDocente()
	{
		Docente prof=new Docente();
		prof.setMatricula(20);
		prof.setAltura(181);
		prof.setMassa(85);
		prof.setSexo('M');
		prof.setNome("Rubens");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Fatec");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(prof);
		manager.getTransaction().commit();
		System.out.println("Matricula do professor: " + prof.getMatricula());
		manager.close();
		factory.close();
	}
	
	public void SelectDocente()
	{
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("Fatec");
		 EntityManager manager = factory.createEntityManager();
		 Docente prof = manager.find(Docente.class, 1L);
		 
		 System.out.println("onde est� o erro" + prof.getNome());
		 manager.close();
		 factory.close();
	}
	
	public static void main(String[] args) {
		//EntityManagerFactory factory = Persistence.createEntityManagerFactory("Fatec");
		//factory.close();
		ConexaoJPAHiber cjh = new ConexaoJPAHiber();
		cjh.InsereDocente();
		//cjh.SelectDocente();
		}

}
