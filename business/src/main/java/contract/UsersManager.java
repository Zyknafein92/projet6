package contract;


import model.Users;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UsersManager {

    Users addUsers(Users user);

    void saveUsers(Users user);

    void deleteUsers(Long Id);

    List<Users> getuser();
}
