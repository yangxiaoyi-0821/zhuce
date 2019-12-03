package com.cn.Test;
import com.cn.Entity.Users;
import com.cn.Service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisSpringTest {
    @Test
    public void test(){
        //1.加载spring配置
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取对象
        CustomerService customerService=(CustomerService) applicationContext.getBean("CustomerService");
        //3.调用方法
        Users users=new Users();
        users.setUser_id(2017267070);
        users.setUser_name("lfy");
        users.setTelephone("1008611");
        users.setUser_password("lfy20201");
        users.setUser_type("admin");
        customerService.saveCustomer(users);
    }
}
