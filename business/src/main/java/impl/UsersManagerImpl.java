package impl;



import contract.UsersManager;
import model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repository.UserRepository;

import java.util.List;

@Component
public class UsersManagerImpl extends ManagerImpl implements UsersManager {

    @Override
    public Users addUsers(Users user) {
        return getDaoFactory().getuserRepository().save(user);
    }

    @Override
    public void saveUsers(Users user) {
        getDaoFactory().getuserRepository().save(user);
    }

    @Override
    public void deleteUsers(Long Id) {
        getDaoFactory().getuserRepository().deleteById(Id);
    }

    @Override
    public List<Users> getuser() {
        return getDaoFactory().getuserRepository().findAll();
    }
}



