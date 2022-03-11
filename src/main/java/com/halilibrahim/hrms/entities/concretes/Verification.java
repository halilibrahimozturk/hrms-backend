package com.halilibrahim.hrms.entities.concretes;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Table(name = "verifications")
@Data

@AllArgsConstructor
@NoArgsConstructor
@Entity

@Inheritance(strategy = InheritanceType.JOINED)

public class Verification  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

//    @Column(name = "user_id")
//    private long userId;
//

    @Column(name = "user_id")

    private long userId;


    @Column(name ="verified")
    private boolean verified;


        @JsonIgnore
    @OneToOne(mappedBy = "verification")
    private User user;



}