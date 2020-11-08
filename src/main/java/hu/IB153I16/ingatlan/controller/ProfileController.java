package hu.IB153I16.ingatlan.controller;

import hu.IB153I16.ingatlan.repository.RealEstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.stream.Collectors;

@Controller
@RequestMapping("profile")
public class ProfileController {

    @Autowired
    private RealEstateRepository realEstateRepository;

    @GetMapping("index")
    public String index(Model model){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String currentPrincipalName = auth.getName();
        //(realEstateRepository.findAll().stream().filter( x -> x.getUser().getEmail().equals("dan@a.hu"))
        var realEstates = realEstateRepository.findAll().stream().filter(
                x -> x.getUser().getEmail().equals(currentPrincipalName)).collect(Collectors.toList());
        model.addAttribute("myRealEstates",realEstates);
        return "profile/index";
    }


}
