package com.halilibrahim.hrms.entities.concretes;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name="cities")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;


    @Column(name="name")
    private String name;


    @JsonIgnore

    @OneToMany(mappedBy = "city",cascade = CascadeType.ALL ,orphanRemoval = true)
    private List<Job> jobs;

}
