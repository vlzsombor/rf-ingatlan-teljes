
package hu.zsolt.ingatlan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @RequestMapping("/login")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
