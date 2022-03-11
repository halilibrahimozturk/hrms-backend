package com.halilibrahim.hrms.entities.concretes;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity

@Table(name="job_seekers")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class JobSeeker extends User implements Serializable{


    @Id
    @Column(name="id")
    private long id;

    @NotNull
//    @NotBlank(message = "E-posta alanı boş geçilemez.")

    @Column(name="name")
    private String name;


    @NotNull

    @Column(name="surname")
    private String surname;

    @Column(name="identity_number")
    private Long identityNumber;

    @Column(name="year_of_birth")
    private int yearOfBirth;

    @ManyToOne(cascade = CascadeType.ALL)

    @JoinColumn(name="city_id")
    private City city;





    @JsonIgnore

    @OneToMany(mappedBy = "jobSeeker",cascade = CascadeType.ALL ,orphanRemoval = true)
    private List<Cv> cvs;



}