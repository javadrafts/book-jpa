package telran.java2022.author.dao;

import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import telran.java2022.author.model.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, String> {
	Optional<Author> findByName(String name);

	Stream<Author> streamByBooksIsbn(String isbn);
}
