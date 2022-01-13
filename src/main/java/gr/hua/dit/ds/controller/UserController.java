package gr.hua.dit.ds.controller;

import gr.hua.dit.ds.dao.UserDAO;
import gr.hua.dit.ds.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserDAO userDAO;
    private Object users;


    @GetMapping("/")
    public String listStudents(Model model) {
        List<User> students = userDAO.geUsers();
        model.addAttribute("users",users);
        return "users";

    }
}

