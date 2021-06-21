package SHOETUDIO.spring.mvc.dao;

import SHOETUDIO.spring.mvc.vo.ContactUs;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("cudao")
public class ContactUsDAOImpl implements ContactUsDAO {

    @Autowired private SqlSession sqlSession;

    @Override
    public int insertContactus(ContactUs cu) {
        return sqlSession.insert("contactus.insertContactus", cu);

    }

}