package SHOETUDIO.spring.mvc.controller;

import SHOETUDIO.spring.mvc.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class CustomController {

    @Autowired private CustomService csrv;

    // list
    @GetMapping("/custom/list")
    public String list(){
        return "custom/list.tiles";
    }

    // view
    @GetMapping("/custom/view")
    public String view(){
        return "custom/view.tiles";
    }

    // custom
    @GetMapping("/custom/lEditDesign")
    public String customizel(){
        return "custom/lEditDesign.tiles";
    }
    @GetMapping("/custom/hEditDesign")
    public String customizeh(){
        return "custom/hEditDesign.tiles";
    }

}