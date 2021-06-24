package SHOETUDIO.spring.mvc.dao;

import SHOETUDIO.spring.mvc.vo.Custom;

import java.util.List;

public interface CustomDAO {

    List<Custom> selectCustom(int snum);
    Custom selectOneCustom(String cno);

}