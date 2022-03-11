package com.halilibrahim.hrms.entities.concretes;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;


@Entity

@Table(name="educations")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Education implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name = "program_name")
    private String programName;


    @Column(name = "institution_name")
    private String institutionName;

    @Column(name = "description")
    private String description;





    @NotNull
    @NotBlank
    @Column(name = "start_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")

    private LocalDateTime startDate;

    @Column(name = "end_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")

    private LocalDateTime endDate;







    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    @JoinColumn(name="cv_id")
    private Cv cv;

}
