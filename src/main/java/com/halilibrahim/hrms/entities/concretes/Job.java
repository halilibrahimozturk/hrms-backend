package com.halilibrahim.hrms.entities.concretes;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Entity

@Table(name="jobs")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Job implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "minimum_salary")
    private int minimumSalary;

    @Column(name = "maximum_salary")
    private int maximumSalary;

    @Column(name = "number_of_people")
    private int numberOfPeople;

    @Column(name = "application_deadline")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")

    private LocalDateTime applicationDeadline;


    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")

    @Column(name = "release_date")
    private LocalDateTime releaseDate;


    @Column(name = "is_active")
    private boolean isActive;





    @ManyToOne(cascade = CascadeType.ALL)

    @JoinColumn(name="city_id")
    private City city;


    @ManyToOne(cascade = CascadeType.ALL)

    @JoinColumn(name="employer_id")
    private Employer employer;

}