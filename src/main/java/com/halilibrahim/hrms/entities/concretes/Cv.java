package com.halilibrahim.hrms.entities.concretes;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity

@Table(name="cvs")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cv implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name = "name")
    private String name;




    @Column(name = "github_adress")
    private String githubAdress;

    @Column(name = "linkedin_adress")
    private String linkedinAdress;





    @Column(name = "cover_letter")
    private String coverLetter;







    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    @JoinColumn(name="jobseeker_id")
    private JobSeeker jobSeeker;








    @OneToMany(mappedBy = "cv",cascade = CascadeType.ALL ,orphanRemoval = true)
    private List<Education> educations;

    @OneToMany(mappedBy = "cv",cascade = CascadeType.ALL ,orphanRemoval = true)
    private List<Language> languages;


    @OneToMany(mappedBy = "cv",cascade = CascadeType.ALL ,orphanRemoval = true)
    private List<Skill> skills;

    @OneToMany(mappedBy = "cv",cascade = CascadeType.ALL ,orphanRemoval = true)
    private List<WorkExperience> workExperiences;
}