package pl.familybook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import pl.familybook.models.Message;

@RestResource(path = "posts")
public interface MessageRepository extends CrudRepository<Message, Long>{

}
