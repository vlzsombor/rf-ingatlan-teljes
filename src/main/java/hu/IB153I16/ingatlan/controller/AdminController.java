package hu.IB153I16.ingatlan.controller;

import hu.IB153I16.ingatlan.model.RealEstate;
import hu.IB153I16.ingatlan.model.Role;
import hu.IB153I16.ingatlan.model.User;
import hu.IB153I16.ingatlan.repository.RolesRepository;
import hu.IB153I16.ingatlan.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RolesRepository rolesRepository;

    @GetMapping
    public String index(Model model){
        var users = userRepository.findAll();

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentPrincipalName = authentication.getName();

        model.addAttribute("users",
                users.stream()
                .filter(i -> !(i.getEmail().equals(currentPrincipalName)))
                .collect(Collectors.toList())
        );
        return "admin/index";
    }

    @GetMapping("delete/{id}")
    public String deleteRealEstate(@PathVariable("id") long id, Model model) {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));

        userRepository.delete(user);
        //model.addAttribute("students", realEstateRepository.findAll());
        return "redirect:/admin";
    }

    @GetMapping("update/{id}")
    public String updateRealEstate(@PathVariable("id") Long id, Model model, String role) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid movie id:" + id));
        Role roleObj = null;
        if(role != null){
            switch (role){
                case "A":
                    roleObj = new Role("ROLE_ADMIN");

                    break;
                case "R":
                    roleObj = new Role("ROLE_USER");

                    break;
            }
            var roleObjReal =  rolesRepository.findByName(roleObj.getName());
            user.getRoles().clear();
            user.getRoles().add(roleObjReal.get(0));

            System.out.println(roleObjReal);
            userRepository.save(user);
        }

        return "redirect:/admin";
    }

}
