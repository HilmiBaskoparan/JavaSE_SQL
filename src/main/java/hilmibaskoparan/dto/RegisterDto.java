package hilmibaskoparan.dto;

import lombok.*;
import lombok.extern.log4j.Log4j2;

import java.util.Date;

// LOMBOK
@Data               // @Getter @Setter @ToString @EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
public class RegisterDto {

    // Fields
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private Date createDate;


}
