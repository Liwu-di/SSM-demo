package fun.test;

import fun.liwudi.dao.AccountDao;
import fun.liwudi.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class testMybatis {
    @Test
    public void run1() throws Exception {
        InputStream is= Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
        SqlSession session =factory.openSession();
        AccountDao dao=session.getMapper(AccountDao.class);
        List<Account> list =dao.findAll();
        for(Account account : list){
            System.out.println(account);
        }
        session.close();
        is.close();
    }
    @Test
    public void run2() throws IOException {
        Account account = new Account();
        account.setName("熊大");
        account.setMoney(400d);
// 加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
// 创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
// 创建sqlSession对象
        SqlSession session = factory.openSession();
// 获取代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
        dao.saveAccount(account);
// 提交事务
        session.commit();
// 释放资源
        session.close();
        inputStream.close();
    }

}
