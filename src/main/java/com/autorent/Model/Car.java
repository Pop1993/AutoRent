package com.autorent.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String make;
    @Column(nullable = false)
    private String model;
    @Column(nullable = false)
    private String bodyType;
    @Column(nullable = false)
    private String color;
    @Column(nullable = false)
    private Integer yearOfMake;
    @Column(nullable = false)
    private Integer Mileage;
    @Column(nullable = false)
    private CarStatus carStatus;
    @Column(nullable = false)
    private Double pricePerDay;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "branch_id", nullable = false)
    private Branch branch;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "car")
    private List<CarRental> rentals;


//    public void setId(Integer id) {
//        this.id = id;
//    }
//    public Integer getId() {
//        return id;
//    }
//
//    public String getMake() {
//        return make;
//    }
//    public void setMake(String make) {
//        this.make = make;
//    }
//
//    public String getModel() {
//        return model;
//    }
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public String getBodyType() {
//        return bodyType;
//    }
//    public void setBodyType(String bodyType) {
//        this.bodyType = bodyType;
//    }
//
//    public String getColor() {
//        return color;
//    }
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public Integer getYearOfMake() {
//        return yearOfMake;
//    }
//    public void setYearOfMake(Integer yearOfMake) {
//        this.yearOfMake = yearOfMake;
//    }
//
//    public Integer getMileage() {
//        return Mileage;
//    }
//    public void setMileage(Integer mileage) {
//        Mileage = mileage;
//    }
//
//    public CarStatus getCarStatus() {
//        return carStatus;
//    }
//    public void setCarStatus(CarStatus carStatus) {
//        this.carStatus = carStatus;
//    }
//
//    public Double getPricePerDay() {
//        return pricePerDay;
//    }
//    public void setPricePerDay(Double pricePerDay) {
//        this.pricePerDay = pricePerDay;
//    }
//
//    public Branch getBranch() {
//        return branch;
//    }
//    public void setBranch(Branch branch) {
//        this.branch = branch;
//    }
}
