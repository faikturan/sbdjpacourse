package springframework.sdjpa;

import org.junit.jupiter.api.Test;
import springframework.sdjpa.repositories.BookRepository;

import static org.assertj.core.api.Assertions.assertThat;

class SdjpaIntroApplicationTest {

    BookRepository bookRepository;


    @Test
    void testBookRepository(){
        long count = bookRepository.count();

        assertThat(count).isGreaterThan(0);
    }

    @Test
    void contextLoads(){
    }

}