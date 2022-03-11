package com.halilibrahim.hrms.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Entity

@Table(name="system_verifications")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SystemVerification extends Verification implements Serializable {


    @Id
    @Column(name="id")
    private long id;

    @Column(name = "system_verified")
    private boolean systemVerified;






}