package springframework.sdjpa.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import springframework.sdjpa.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
