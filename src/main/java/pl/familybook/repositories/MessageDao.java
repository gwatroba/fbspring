package pl.familybook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.familybook.models.Message;

public interface MessageDao extends JpaRepository<Message, Long>{

}
