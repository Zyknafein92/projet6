package contract;


import model.Users;

public interface UsersManager {

    Users addUsers(Users user);

    void saveUsers(Users user);

    void deleteUsers(Long Id);
}
