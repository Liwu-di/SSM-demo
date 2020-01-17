package fun.liwudi.service.impl;

import fun.liwudi.dao.AccountDao;
import fun.liwudi.domain.Account;
import fun.liwudi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("业务层查询所有");
        return accountDao.findAll();

    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层保存");
        accountDao.saveAccount(account);
    }
}
