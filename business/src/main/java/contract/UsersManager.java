package contract;


import model.Users;

import java.util.List;

public interface UsersManager {

    Users addUsers(Users user);

    void saveUsers(Users user);

    void deleteUsers(Long Id);

    List<Users> getuser();
}
