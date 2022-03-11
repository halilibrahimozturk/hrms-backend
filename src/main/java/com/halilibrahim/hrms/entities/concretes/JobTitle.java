package com.halilibrahim.hrms.entities.concretes;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name="job_titles")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

@JsonIgnoreProperties({"hibernateLazyInitializer","handler","users"})
public class JobTitle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

//    @Column(name="user_id")
//    private long userId;

    @Column(name="title")
    private String title;

   @JsonIgnore
//    @OneToMany(mappedBy = "jobTitle",cascade = CascadeType.ALL ,orphanRemoval = true)
//    private List<User> users;
@OneToMany(mappedBy = "jobTitle")
private List<User> users;


}
