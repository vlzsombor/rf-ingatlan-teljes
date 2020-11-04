package hu.IB153I16.ingatlan.controller;

import hu.IB153I16.ingatlan.repository.RealEstateRepository;
import hu.IB153I16.ingatlan.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.stream.Collectors;

@Controller
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("index")
    public String index() {
        return "admin/index";
    }

    @GetMapping("/getusers")
    public String getUsers(Model model) {

        var users = userRepository.findAll();
        model.addAttribute("users",users);

        return "profile/getUsers";
    }
}
