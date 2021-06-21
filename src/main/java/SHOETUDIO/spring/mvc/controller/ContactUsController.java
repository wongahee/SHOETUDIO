package SHOETUDIO.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactUsController {

    @GetMapping("/contactus")
    public String contactus() {
        return "contactus";
    }
}
