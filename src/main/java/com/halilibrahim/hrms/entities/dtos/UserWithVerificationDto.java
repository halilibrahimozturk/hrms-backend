package com.halilibrahim.hrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserWithVerificationDto {
    private long id;
    private boolean verified;

}
