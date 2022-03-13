package cvbankproject.cvbank.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(of={"login"})
@Document(collection = "resumes")
public class Resume {
    @Id
    String id;
    String description;

    public Resume(String description) {
        this.description = description;
    }
}
