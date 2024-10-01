package com.te.ems.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Employee {
    @Id
    private String id;
    private String employeeId;
    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth;
    private LocalDate dateOfJoining;
    private Double salary;

    @Enumerated
    private Gender gender;

}
