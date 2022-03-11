package com.halilibrahim.hrms.entities.concretes;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity

@Table(name="employers")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employer extends User implements Serializable {


    @Id
    @Column(name="id")
    private long id;


    @Column(name="company_name")
    private String companyName;

    @Column(name="web_site")
    private String webSite;

    @Column(name="phone_number")
    private String phoneNumber;



    @ManyToOne(cascade = CascadeType.ALL)

    @JoinColumn(name="city_id")
    private City city;


    @JsonIgnore

    @OneToMany(mappedBy = "employer",cascade = CascadeType.ALL ,orphanRemoval = true)
    private List<Job> jobs;

}