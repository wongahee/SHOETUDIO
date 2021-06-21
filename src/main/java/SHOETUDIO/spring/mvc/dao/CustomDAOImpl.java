package SHOETUDIO.spring.mvc.dao;

import SHOETUDIO.spring.mvc.vo.Custom;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository("cdao")
public class CustomDAOImpl implements CustomDAO {

    @Autowired private SqlSession sqlSession;

    @Override
    public Custom selectOneFname(Map<String, String> param) {
        return sqlSession.selectOne("custom.selectFname", param);
    }
}
