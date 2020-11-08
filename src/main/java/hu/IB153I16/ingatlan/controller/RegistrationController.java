package hu.IB153I16.ingatlan.controller;

import hu.IB153I16.ingatlan.model.User;
import hu.IB153I16.ingatlan.model.dto.UserRegistrationDto;
import hu.IB153I16.ingatlan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    private UserService userService;

    @ModelAttribute("userRegistrationDto")
    public UserRegistrationDto userRegistrationDto() {
        return new UserRegistrationDto();
    }

    @GetMapping
    public String showRegistrationForm(Model model) {
        return "registration/index";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("userRegistrationDto") @Valid UserRegistrationDto userDto,
                                      BindingResult result){

        User existing = userService.findByEmail(userDto.getEmail());
        if (existing != null){
            result.rejectValue("email", null, "There is already an account registered with that email");
        }

        if (result.hasErrors()){
            return "registration/index";
        }

        userService.save(userDto);
        return "redirect:/registration?success";
    }
}
