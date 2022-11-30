package telran.java2022.publisher.dao;

import java.util.stream.Stream;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import telran.java2022.publisher.model.Publisher;

@Repository
public interface PublisherRepository extends CrudRepository<Publisher, String> {
	Stream<Publisher> streamByBooksAuthorsNameContains(String authorName);
}
