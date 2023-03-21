package springframework.sdjpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import springframework.sdjpa.repositories.BookRepository;

import static org.assertj.core.api.Assertions.assertThat;

class SdjpaIntroApplicationTest {

    @Autowired
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