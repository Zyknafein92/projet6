package startapplication;

import contract.DaoFactory;
import contract.UsersManager;
import impl.ManagerImpl;
import impl.UsersManagerImpl;
import model.Users;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import repository.UserRepository;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "repository")
@EntityScan( basePackages = "model" )
public class DemoApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class);
    }

}
