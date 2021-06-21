package SHOETUDIO.spring.mvc.dao;

import SHOETUDIO.spring.mvc.vo.Custom;

import java.util.Map;

public interface CustomDAO {

    Custom selectOneFname(Map<String, String> param);

}