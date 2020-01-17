package fun.liwudi.controller;

import fun.liwudi.domain.Account;
import fun.liwudi.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountCotroller {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层，查询所有");
        List<Account> list=accountService.findAll();
        model.addAttribute( "list",list);
        return "list";
    }
    @RequestMapping("/save")
    public void findAll(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层，查询所有");
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return ;
    }
}

