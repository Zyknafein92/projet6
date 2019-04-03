package controller;

import contract.UsersManager;
import model.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UsersController {

    private UsersManager usersManager;


    @RequestMapping("/userlist")
    public List<Users> usersList (){
        return usersManager.getuser();
    }

    @RequestMapping("/index.html")
    public Users addUsers(Users users){
        return usersManager.addUsers(users);
    }

    @RequestMapping("/index.html")
    public void saveUser(Users users){
        usersManager.saveUsers(users);
    }

    @RequestMapping("/index.html")
    public void deleteUser(Long id){
        usersManager.deleteUsers(id);
    }


}
