package controller;

import contract.UsersManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class UsersController {

    private UsersManager usersManager;

    @RequestMapping(value= "/getUsers")
    public ModelAndView getallUsers(){
        ModelAndView mv = new ModelAndView("listUser");
        mv.addObject("users", usersManager.getuser());
        return mv;
    }


}
