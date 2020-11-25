package hu.IB153I16.ingatlan.controller;

import hu.IB153I16.ingatlan.repository.RealEstateRepository;
import hu.IB153I16.ingatlan.service.RealEstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.stream.Collectors;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private RealEstateRepository realEstateRepository;

    @Autowired
    private RealEstateService realEstateService;


    @GetMapping("/")
    public String index(Model model, String keyword){

        if(keyword != null){
            model.addAttribute("realEstates",realEstateService.findByKeyWord(keyword));
        }
        else
        {
            model.addAttribute("realEstates",realEstateRepository.findAll());
        }

        return "index";
    }

    @GetMapping("login")
    public String login(){ return "login"; }

    @GetMapping("viewads")
    public String viewAds(Model model){
        model.addAttribute("realEstates",realEstateRepository.findAll());
        return "viewads";

    }
}
