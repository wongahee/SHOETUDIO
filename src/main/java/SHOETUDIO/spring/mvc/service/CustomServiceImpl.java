package SHOETUDIO.spring.mvc.service;

import SHOETUDIO.spring.mvc.dao.CustomDAO;
import SHOETUDIO.spring.mvc.utils.CustomImgDownUtil;
import SHOETUDIO.spring.mvc.vo.Custom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service("csrv")
public class CustomServiceImpl implements CustomService {

    @Autowired private CustomDAO cdao;
    @Autowired private CustomImgDownUtil cidutil;

    @Override
    public Custom readOneFname(String cno, String order) {
        Map<String, String> param = new HashMap<>();
        param.put("order", "fname" + order);
        param.put("cno", cno);

        return cdao.selectOneFname(param);
    }

}