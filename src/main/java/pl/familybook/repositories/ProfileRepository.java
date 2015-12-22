package pl.familybook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import pl.familybook.models.Profile;

@RestResource(path = "users")
public interface ProfileRepository extends CrudRepository<Profile, Long>{
	
}
