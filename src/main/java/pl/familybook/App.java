package pl.familybook;

import java.util.List;

import org.neo4j.cypher.internal.compiler.v2_1.ast.rewriters.deMorganRewriter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import pl.familybook.models.Profile;
import pl.familybook.repositories.ProfileDao;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		
		SpringApplication.run(App.class, args);
						
	}
	
	@Bean
	public Profile demo(ProfileDao repo) {
		
		Profile profile = new Profile("daoa1q211q", "sada", "Watroba", "adaqao1k@1qa1aa.pl"); 
		repo.save(profile);
		return profile;
	}
	
//	@Bean
//	public List<Profile> demo2() {
//		ProfileDao profileDao;
//		return profileDao.findAll();
//	}
	
}