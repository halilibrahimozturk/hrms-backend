package com.halilibrahim.hrms.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.io.Serializable;



@Table(name="e_mail_verifications")


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class EMailVerification extends Verification implements Serializable {


    @Id
    @Column(name="id")
    private long id;

    @Column(name = "e_mail_verified")
    private boolean eMailVerified;

    @Column(name="e_mail_code")
    private String eMailCode;




}