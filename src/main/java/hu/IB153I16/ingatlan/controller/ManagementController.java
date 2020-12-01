package hu.IB153I16.ingatlan.controller;

import hu.IB153I16.ingatlan.model.RealEstate;
import hu.IB153I16.ingatlan.repository.RealEstateRepository;
import hu.IB153I16.ingatlan.utils.constant.FileUploadUtil;
import net.bytebuddy.pool.TypePool;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("management")
public class ManagementController {
    @Autowired
    private RealEstateRepository realEstateRepository;

    @GetMapping("index")
    public String index(Model model){
        model.addAttribute("realEstates", realEstateRepository.findAll());
        return "management/index";
    }

    @GetMapping("/delete/{id}")
    public String deleteAd(@ModelAttribute("id") Long id){
        realEstateRepository.deleteById(id);
        return "redirect:/management/index";
    }

    @GetMapping("/update/{id}")
    public String updateAd(@PathVariable("id") Long id, Model model){
        RealEstate realEstate = realEstateRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid ad id: " + id));
        model.addAttribute("realEstate", realEstate);
        return "/realEstate/update";
    }
}
