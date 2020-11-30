package hu.IB153I16.ingatlan.controller;

import hu.IB153I16.ingatlan.model.RealEstate;
import hu.IB153I16.ingatlan.repository.RealEstateRepository;
import hu.IB153I16.ingatlan.service.RealEstateService;
import hu.IB153I16.ingatlan.utils.constant.FileUploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private RealEstateRepository realEstateRepository;

    @Autowired
    private RealEstateService realEstateService;


    String ingatlanTipusArray[]={
            "Lakas",
            "Haz",
            "Ikerhaz",
            "Nyaralo"
    };

    @GetMapping("/")
    public String index(Model model, Integer ingatlanTipus, String telepulesNev){
        if(telepulesNev != null && ingatlanTipus != null)
        {
            model.addAttribute("realEstates",realEstateRepository.findByTelepulesNevAndLakasOption(telepulesNev,ingatlanTipusArray[ingatlanTipus]));
        }
        else if(telepulesNev != null)
        {
            model.addAttribute("realEstates",realEstateService.findByTelepulesNev(telepulesNev));
        } else {
            var list = realEstateRepository.findAll();

            Collections.shuffle(list);
            model.addAttribute("realEstates",list);


            return "index";
        }

        return "viewads";
    }

    @GetMapping("login")
    public String login(){ return "login"; }

    @GetMapping("viewads")
    public String viewAds(Model model){
        model.addAttribute("realEstates",realEstateRepository.findAll());
        return "viewads";

    }
}
