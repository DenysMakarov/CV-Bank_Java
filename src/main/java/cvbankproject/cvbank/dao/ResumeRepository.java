package cvbankproject.cvbank.dao;

import cvbankproject.cvbank.model.Resume;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ResumeRepository extends MongoRepository<Resume, String> {

}
