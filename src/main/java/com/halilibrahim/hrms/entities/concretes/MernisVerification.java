package com.halilibrahim.hrms.entities.concretes;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Entity

@Table(name="mernis_verifications")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MernisVerification extends Verification implements Serializable {


    @Id
    @Column(name="id")
    private long id;

    @Column(name = "mernis_verified")
    private boolean mernisVerified;






}