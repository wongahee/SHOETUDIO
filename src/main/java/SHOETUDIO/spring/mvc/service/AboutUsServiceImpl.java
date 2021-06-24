package SHOETUDIO.spring.mvc.service;

import SHOETUDIO.spring.mvc.dao.AboutUsDAO;
import SHOETUDIO.spring.mvc.vo.AboutUs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("asrv")
public class AboutUsServiceImpl implements AboutUsService {

    @Autowired
    private AboutUsDAO usdao;

    @Override
    public boolean newContact(AboutUs us) {
        boolean isInserted = false;
        if(usdao.insertContact(us) > 0) isInserted = true;

        return isInserted;
    }
}
