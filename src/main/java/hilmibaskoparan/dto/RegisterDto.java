package hilmibaskoparan.dto;

import lombok.*;
import lombok.extern.log4j.Log4j2;

import java.util.Date;

// LOMBOK
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
public class RegisterDto extends BaseDto{

    // Fields
    private String name;
    private String surname;
    private String email;
    private String password;

    public RegisterDto(Long id, Date createDate) {
        super(id, createDate);
    }

    public RegisterDto(Long id, Date createDate, String name, String surname, String email, String password) {
        super(id, createDate);
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }
}
