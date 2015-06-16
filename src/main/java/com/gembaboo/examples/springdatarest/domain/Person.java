package com.gembaboo.examples.springdatarest.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Person {

    @Id
    private Integer id;

    private String firstName;

    private String lastName;

    private String gender;

    private String dateOfBirth;

}
