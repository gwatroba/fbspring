package pl.familybook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import pl.familybook.models.Profile;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface ProfileDao extends JpaRepository<Profile, Long>{

}
