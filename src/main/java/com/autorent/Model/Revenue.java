package com.autorent.Model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "revenue")
public class Revenue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private int initialPay;
    @Column(nullable = false)
    private int additionalPay;
    @Column(nullable = false)
    private int totalPay;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "return_id", referencedColumnName = "id", nullable = false)
    private Return aReturn;
}
