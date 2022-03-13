package cvbankproject.cvbank.dao;

import cvbankproject.cvbank.model.UserAccount;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountRepository extends MongoRepository<UserAccount, String> {

}
