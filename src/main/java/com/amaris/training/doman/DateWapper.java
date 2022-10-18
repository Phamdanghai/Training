package com.amaris.training.doman;

import lombok.*;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;
@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class DateWapper {
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private LocalDateTime deleteDate;

    private String createByUser;
    private String updateByUser;
    private String deleteByUser;


}
