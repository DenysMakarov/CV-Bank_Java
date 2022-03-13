package cvbankproject.cvbank.controller;

import cvbankproject.cvbank.model.UserAccount;
import cvbankproject.cvbank.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAccountController {

    UserAccountService userAccountService;

    @Autowired
    public UserAccountController(UserAccountService userAccountService) {
        this.userAccountService = userAccountService;
    }

    @PostMapping("/register")
    public UserAccount register(@RequestBody UserAccount userAccount){
        return userAccountService.addUser(userAccount);
    }
}
