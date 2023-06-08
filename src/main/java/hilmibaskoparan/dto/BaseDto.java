package hilmibaskoparan.dto;

import lombok.Data;

import java.util.Date;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class BaseDto {

    private Long id;
    private Date createDate;

    public BaseDto() {
        this.createDate = new Date(System.currentTimeMillis());
    }

    public BaseDto(Long id, Date createDate) {
        this.id = id;
        this.createDate = createDate;
    }
}
