package gr.hua.dit.ds.controller;

import gr.hua.dit.ds.dao.UserDAO;
import gr.hua.dit.ds.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@SuppressWarnings("ALL")
@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserDAO usersDAO;
    private Object users;


    @GetMapping("/")
    public String listUser(Model model) {
        List<User> users = usersDAO.geUsers();
        model.addAttribute("users",users);
        return "users";

    }
}

