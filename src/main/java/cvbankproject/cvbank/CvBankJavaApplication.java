package cvbankproject.cvbank;

import cvbankproject.cvbank.dao.ResumeRepository;
import cvbankproject.cvbank.dao.UserAccountRepository;
import cvbankproject.cvbank.model.Resume;
import cvbankproject.cvbank.model.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CvBankJavaApplication implements CommandLineRunner {
    @Autowired
    UserAccountRepository userAccountRepository;
    @Autowired
    ResumeRepository resumeRepository;


    public static void main(String[] args) {
        SpringApplication.run(CvBankJavaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        UserAccount user = new UserAccount("Hulk", "hulk@gmail.com", "1234", "Hulk", "Hulkovich");
        Resume resume = new Resume("lite resume");
        user.addResume(resume);
        resumeRepository.save(resume);
    }
}
