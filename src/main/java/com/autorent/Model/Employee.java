package com.autorent.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private JobType jobType;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "branch_id", nullable = false)
    private Branch branch;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private List<CarRental> carRentals;
}
