package hu.IB153I16.ingatlan.controller;

import hu.IB153I16.ingatlan.model.User;
import hu.IB153I16.ingatlan.repository.RealEstateRepository;
import hu.IB153I16.ingatlan.model.RealEstate;
import hu.IB153I16.ingatlan.repository.UserRepository;
import hu.IB153I16.ingatlan.utils.constant.URLPATH;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.stream.Collectors;

@Controller
@RequestMapping(URLPATH.REALESTATE_ROOT)
public class RealEstateController {
    @Autowired
    RealEstateRepository realEstateRepository;
    @Autowired
    UserRepository userRepository;

    @GetMapping("{id}")
    public String index(@PathVariable("id") Long id, Model model) {
        RealEstate realEstate = realEstateRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid real estate id:" + id));
        model.addAttribute("realEstate", realEstate);


        return "realEstate/index";
    }

    @GetMapping(URLPATH.REALESTATE_UPLOAD)
    public String upload(Model model,RealEstate realEstate) {
        model.addAttribute("realEstate",realEstate);
        return "realEstate/upload";
    }

    @PostMapping(URLPATH.REALESTATE_UPLOAD)
    public String addActorPost(Model model,RealEstate realEstate) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String currentPrincipalName = auth.getName();

        realEstate.setUser(userRepository.findByEmail(currentPrincipalName));

        realEstateRepository.save(realEstate);

        return "redirect:/";
    }
    @PostMapping("update/{id}")
    public String addActorPut(@PathVariable("id") Long id,Model model,RealEstate realEstate) {

        realEstate.setId(id);
        System.out.println(id + "id");

        model.addAttribute("realEstate", realEstate);

        RealEstate realEstateRep = realEstateRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid movie id:" + id));
        realEstate.setUser(realEstateRep.getUser());
        realEstateRepository.save(realEstate);
        System.out.println(realEstate);
        return "redirect:/";
    }

    @GetMapping("update/{id}")
    public String uploadRealEstate(@PathVariable("id") Long id, Model model) {
        RealEstate realEstate = realEstateRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid movie id:" + id));
        model.addAttribute("realEstate", realEstate);
        System.out.println(id + "id");


        return "realEstate/update";
    }
    @GetMapping("delete/{id}")
    public String deleteRealEstate(@PathVariable("id") long id, Model model) {

        RealEstate realEstate = realEstateRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));

        realEstateRepository.delete(realEstate);
        //model.addAttribute("students", realEstateRepository.findAll());
        return "redirect:/profile";
    }


}

