package com.cn.Impl;

import com.cn.Dao.CustomerMapper;
import com.cn.Entity.Users;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class CustomerMapperImpl1 extends SqlSessionDaoSupport implements CustomerMapper {
    @Override
    public void saveUsers(Users users) {
        SqlSession sqlSession=this.getSqlSession();
        sqlSession.insert("saveUsers",users);

    }
}
