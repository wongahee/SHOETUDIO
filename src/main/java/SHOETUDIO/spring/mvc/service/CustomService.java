package SHOETUDIO.spring.mvc.service;

import SHOETUDIO.spring.mvc.vo.Custom;
import java.util.List;

public interface CustomService {

    List<Custom> readCustom(String cp);

    Custom readOneCustom(String cno);

}