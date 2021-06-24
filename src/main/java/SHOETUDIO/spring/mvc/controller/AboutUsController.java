package SHOETUDIO.spring.mvc.controller;

import SHOETUDIO.spring.mvc.service.AboutUsService;
import SHOETUDIO.spring.mvc.vo.AboutUs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AboutUsController {

    @Autowired private AboutUsService asrv;

    @GetMapping("/aboutus")
    public String contactUs(){
        return "aboutus.tiles";
    }

    @PostMapping("/aboutus")
    public String contactUsok(AboutUs us){
        String returnPage = "redirect:/aboutus";

        if(asrv.newContact(us))
            System.out.println("contactUs 데이터 추가완료");

        return returnPage;
    }

}