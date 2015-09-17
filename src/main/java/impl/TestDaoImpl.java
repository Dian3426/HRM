package impl;

import dao.TestDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by ZaraN on 2015/9/17.
 */
public class TestDaoImpl extends JdbcDaoSupport implements TestDao{

    public void insert(int ID, String username) {
        String sql = "INSERT INTO TEST VALUES(" + ID + ",'" + username + "' )";
        this.getJdbcTemplate().execute(sql);
    }
}
