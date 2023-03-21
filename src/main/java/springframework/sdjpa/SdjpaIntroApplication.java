package springframework.sdjpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springframework.sdjpa.repositories.BookRepository;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class SdjpaIntroApplication {

    public static void main(String[] args) {
        SpringApplication.run(SdjpaIntroApplication.class, args);
    }
}
