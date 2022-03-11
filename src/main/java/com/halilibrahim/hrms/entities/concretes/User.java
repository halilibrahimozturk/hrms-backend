package com.halilibrahim.hrms.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import com.sun.istack.NotNull;

@Data

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)

public class User  {
 @Id

 @GeneratedValue(strategy = GenerationType.IDENTITY)

 @Column(name = "id",unique = true)
 private long id;

 @Column(name = "email" , unique = true)
 @Email
 @NotBlank

 @NotNull
 private String email;

 @Column(name = "password")
 @NotBlank
 @NotNull
 private String password;

//@ManyToOne(cascade = CascadeType.ALL)
// private JobTitle jobTitle;


@OneToOne(cascade = CascadeType.ALL)
 @JoinColumn(name="verification_id")
 private Verification verification;


@ManyToOne(cascade = CascadeType.ALL)

@JoinColumn(name="job_title_id")
 private JobTitle jobTitle;



}