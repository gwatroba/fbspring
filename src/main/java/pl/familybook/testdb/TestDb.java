package pl.familybook.testdb;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pl.familybook.models.Profile;

public class TestDb {
	public static void main( String[] args ) {
		   
	      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "entityManager" );
	      
	      EntityManager entitymanager = emfactory.createEntityManager();

	      Profile profile = new Profile( ); 
	      //employee.setEid( 12012 );
	      profile.setFirstName("Adam");
	      profile.setLastName("Bielan");
	      profile.setEmail("adam2@bielan.pl");
	      
		  entitymanager.getTransaction( ).begin( );
		  entitymanager.persist(profile);
		  entitymanager.getTransaction( ).commit( );

	      entitymanager.close( );
	      emfactory.close( );
	   }
}
