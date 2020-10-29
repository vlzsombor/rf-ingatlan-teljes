package hu.IB153I16.ingatlan.controller;

import hu.IB153I16.ingatlan.Repository.RealEstateRepository;
import hu.IB153I16.ingatlan.model.RealEstate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private RealEstateRepository realEstateRepository;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("realEstates",realEstateRepository.findAll());
        return "index";
    }

    @GetMapping("login")
    public String login(){ return "login"; }



}
