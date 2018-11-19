package com.baizhi.test;/*
package com.baizhi.test;

import com.baizhi.entity.User;
import com.baizhi.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConsumer {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext();
        IUserService qqUserService = applicationContext.getBean("qqUserService", IUserService.class);
        System.out.println(qqUserService.getClass());
        User user = qqUserService.queryUserById(1);
        System.out.println(user.getId()+" "+user.getName()+" "+user.getBirthDay());
    }

}
*/
import com.baizhi.entity.User;
import com.baizhi.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConsumer {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("consumer.xml");
        IUserService qqUserSerivice = ctx.getBean("qqUserService", IUserService.class);

        System.out.println(qqUserSerivice.getClass());
        User user = qqUserSerivice.queryUserById(1);
        System.out.println(user.getId()+" "+user.getName()+" "+user.getBirthDay());
    }
}
