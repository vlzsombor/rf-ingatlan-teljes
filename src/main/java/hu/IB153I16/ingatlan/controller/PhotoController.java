package hu.IB153I16.ingatlan.controller;

import com.sun.xml.bind.v2.TODO;
import hu.IB153I16.ingatlan.model.RealEstate;
import hu.IB153I16.ingatlan.repository.RealEstateRepository;
import hu.IB153I16.ingatlan.utils.constant.FileUploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;

@Controller
public class PhotoController {

    @Autowired
    private RealEstateRepository realEstateRepository;

    @GetMapping("photos")
    public String index() {




        return "photos/index";
    }


    @PostMapping("/photos")
    public RedirectView savePhoto(RealEstate realEstate, @RequestParam("image") MultipartFile multipartFile) throws IOException {

        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        realEstate.setPhotos(fileName);

        RealEstate realEstateSave = realEstateRepository.save(realEstate);

        String uploadDir = "realestate-photos/" + realEstateSave.getId();
        //TODO mi a path??

        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);

        return new RedirectView("/realestate", true);
    }




}
