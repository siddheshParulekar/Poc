package com.poc.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "emp_table")
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "emp_id")
    private int id;

    @Column(name = "emp_name", nullable = false)
    private String name;

    @Column(name = "emp_gender")
    private String gender;

    @Column(name = "emp_depart")
    private String department;

//    @Column(name = "emp_dob")
//    private String dob;

}
