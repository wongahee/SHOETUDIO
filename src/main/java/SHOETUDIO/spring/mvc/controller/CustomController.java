package SHOETUDIO.spring.mvc.controller;

import SHOETUDIO.spring.mvc.service.CustomService;
import SHOETUDIO.spring.mvc.utils.CustomImgDownUtil;
import SHOETUDIO.spring.mvc.vo.Custom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
public class CustomController {

    @Autowired private CustomService csrv;
    @Autowired private CustomImgDownUtil cidutil;

    @GetMapping("/custom/customize")
    public String customize() {
        return "custom/customize";
    }

    @GetMapping("/custom/list")
    public String list() {
        return "custom/list";
    }

    @GetMapping("/custom/view")
    public String view() {
        return "custom/view";
    }

    @ResponseBody
    @GetMapping("/custom/down")
    public void cstdown(String cno, String order, HttpServletResponse res) {

        Custom c = csrv.readOneFname(cno, order);  // 다운로드할 파일정보 알아냄
        cidutil.procDownload(c.getFname(), c.getUuid(), res);  // 다운로드 처리
    }

}