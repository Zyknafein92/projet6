package startapplication;

import contract.DaoFactory;
import contract.UsersManager;
import impl.ManagerImpl;
import impl.UsersManagerImpl;
import model.Users;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import repository.UserRepository;


@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class);
    }

  Users user = new Users("Paul",
          "Pierre",
          21,
          "male",
          "TitiWisiti",
          "1234",
          "pouletfermier@cocuou",
          "12345678910",
          false);




}
