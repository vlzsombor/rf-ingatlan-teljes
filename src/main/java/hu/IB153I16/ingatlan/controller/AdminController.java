package hu.IB153I16.ingatlan.controller;

import hu.IB153I16.ingatlan.model.User;
import hu.IB153I16.ingatlan.repository.UserRepository;
import hu.IB153I16.ingatlan.utils.constant.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String index(Model model){
        var users = userRepository.findAll();
        model.addAttribute("users",users);
        model.addAttribute("ROLES_LIST", Roles.ROLES_LIST);
        return "admin/index";
    }

    @PostMapping
    public String editRoles(Model model, Collection<User> user){
        System.out.println(user);
        return "admin/index";
    }

}
