package SHOETUDIO.spring.mvc.service;

import SHOETUDIO.spring.mvc.dao.CustomDAO;
import SHOETUDIO.spring.mvc.vo.Custom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("csrv")
public class CustomServiceImpl implements CustomService {

    @Autowired private CustomDAO cdao;

    @Override
    public List<Custom> readCustom(String cp) {
        int snum = (Integer.parseInt(cp) - 1) * 16;

        return cdao.selectCustom(snum);
    }

    @Override
    public Custom readOneCustom(String cno) {
        return cdao.selectOneCustom(cno);
    }

}