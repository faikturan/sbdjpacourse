package springframework.sdjpa.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springframework.sdjpa.domain.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
