package com.autorent.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "rentals")
public class CarRental {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private Date startDate;
    @Column(nullable = false)
    private Date returnDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pick_up_branch_id", nullable = false)
    private Branch pickUpBranch;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "return_branch_id", nullable = false)
    private Branch returnBranch;

    @Column(nullable = false)
    private int price;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "car_id", nullable = false)
    private Car car;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "carRental")
    private Return aReturn;

}
