package telran.java2022.book.dao;

import java.util.stream.Stream;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import telran.java2022.book.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, String> {
	Stream<Book> streamByAuthorsNameContains(String authorName);

	Stream<Book> streamByPublisherName(String publisherName);
}
