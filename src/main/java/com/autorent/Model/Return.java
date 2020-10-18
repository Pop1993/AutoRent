package com.autorent.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "returns")
public class Return {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private Date actualReturnedDate;
    @Column(nullable = false)
    private int additionalPayment;
    @Column
    private String comments;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rental_id", referencedColumnName = "id", nullable = false)
    @JsonBackReference
    private CarRental carRental;

    @OneToOne(cascade = CascadeType.ALL,mappedBy = "aReturn")
    @JsonManagedReference
    private Revenue revenue;
}
