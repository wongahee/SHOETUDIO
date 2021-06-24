package SHOETUDIO.spring.mvc.dao;

import SHOETUDIO.spring.mvc.vo.AboutUs;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("usdao")
public class AboutUsDAOImpl implements AboutUsDAO {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public int insertContact(AboutUs us) {
        return sqlSession.insert("aboutus.insertContact", us);
    }
}
