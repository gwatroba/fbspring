package pl.familybook.testdb;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pl.familybook.models.Message;
import pl.familybook.models.Profile;

public class TestDb {
	public static void main( String[] args ) {
		   
	      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "entityManager" );
	      
	      EntityManager entitymanager = emfactory.createEntityManager();

	      Profile profile = new Profile("g1r1eq1x", "sada", "Watroba", "aa111@1qa1aa.pl"); 
	      Profile profile2 = new Profile("g11wq1", "Greg1", "Watroba", null);
	      
		  entitymanager.getTransaction( ).begin( );
		  entitymanager.persist(profile);
		  entitymanager.persist(profile2);
		  entitymanager.getTransaction( ).commit( );
		  
		  Message message = new Message("Siemanko aaa");
		  Message message2 = new Message("Siemanko bbb");
		  
		  message.setProfile(profile);
		  message2.setProfile(profile2);
		  
		  entitymanager.getTransaction( ).begin( );
		  entitymanager.persist(message);
		  entitymanager.persist(message2);
		  entitymanager.getTransaction( ).commit( );  

	      entitymanager.close( );
	      emfactory.close( );
	   }
}
