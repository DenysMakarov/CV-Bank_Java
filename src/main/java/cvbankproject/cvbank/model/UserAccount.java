package cvbankproject.cvbank.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(of={"login"})
@Document(collection = "users")
public class UserAccount {
    @Id
    String login;
    String email;
    String password;
    String firstName;
    String lastName;
    Set<Resume> resumes = new HashSet<>();
    Set<String> roles = new HashSet<>();

    public UserAccount(String login, String email, String password, String firstName, String lastName) {
        this.login = login;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Resume addResume(Resume resume){
        resumes.add(resume);
        return resume;
    }
}
