package cvbankproject.cvbank.service;

import cvbankproject.cvbank.dao.UserAccountRepository;
import cvbankproject.cvbank.model.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserAccountServiceImpl implements UserAccountService {

    UserAccountRepository userAccountRepository;

    @Autowired
    public UserAccountServiceImpl(UserAccountRepository userAccountRepository) {
        this.userAccountRepository = userAccountRepository;
    }

    @Override
    public UserAccount addUser(UserAccount userAccount) {
        userAccountRepository.save(userAccount);
        return userAccount;
    }
}
