package fun.test;


import fun.liwudi.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
    @Test
    public void run1(){
        ApplicationContext ac =new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService as= (AccountService) ac.getBean("AccountService");
        as.findAll();
    }
}
