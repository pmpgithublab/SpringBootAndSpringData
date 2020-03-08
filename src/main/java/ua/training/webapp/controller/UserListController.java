package ua.training.webapp.controller;

import ua.training.webapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UserListController {

    private final UserService userService;

    @Autowired
    public UserListController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/showUsers")
    public String showUsers(Model model){
        model.addAttribute("users", userService.getAllUsers());
        return "users_list";
    }
}
