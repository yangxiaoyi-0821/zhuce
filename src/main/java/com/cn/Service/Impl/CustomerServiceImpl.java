package com.cn.Service.Impl;

import com.cn.Dao.CustomerMapper;
import com.cn.Entity.Users;
import com.cn.Service.CustomerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {
    //注入Mapper对象
    @Resource
    private CustomerMapper customerMapper;
    @Override
    public void saveCustomer(Users users) {
        customerMapper.saveUsers(users);
        int i=100/0;
        customerMapper.saveUsers(users);
    }
}
