package SHOETUDIO.spring.mvc.service;

import SHOETUDIO.spring.mvc.dao.ContactUsDAO;
import SHOETUDIO.spring.mvc.vo.ContactUs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("cusrv")
public class ContactUsServiceImpl implements ContactUsService {

    @Autowired
    private ContactUsDAO cudao;

    @Override
    public boolean newContact(ContactUs us) {
        boolean isInserted = false;
        if(cudao.insertContact(us) > 0) isInserted = true;

        return isInserted;
    }

}
