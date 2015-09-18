package mapper;

import domain.Test;

/**
 * Created by ZaraN on 2015/9/18.
 * test mapper
 */
public interface TestMapper {
    void insert(Test test);
    void delete(int ID);
}