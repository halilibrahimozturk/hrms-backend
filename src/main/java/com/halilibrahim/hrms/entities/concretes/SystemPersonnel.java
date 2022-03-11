package com.halilibrahim.hrms.entities.concretes;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Entity

@Table(name="system_personnels")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class SystemPersonnel extends User implements Serializable {


    @Id
    @Column(name="id")
    private long id;


    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;








}
