package uz.data.warehauseupgrade.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private String message;

    private Boolean active;

    private Integer status;
}
