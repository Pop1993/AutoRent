package com.autorent.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "branches")
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String city;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "office_id", nullable = false, unique = true)
    @JsonBackReference
    private RentalOffice office;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "branch")
    @JsonManagedReference
    private List<Employee> employeeList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "branch")
    @JsonManagedReference
    private  List<Car> carList;

    @OneToOne(mappedBy = "pickUpBranch")
    @JsonManagedReference
    private CarRental pickUpLoc;

    @OneToOne(mappedBy = "returnBranch")
    @JsonManagedReference
    private CarRental returnLoc;


//    public void setId(Integer id) {
//        this.id = id;
//    }
//    public Integer getId() {
//        return id;
//    }
//
//    public String getCity() {
//        return city;
//    }
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public RentalOffice getOffice() {
//        return office;
//    }
//    public void setOffice(RentalOffice office) {
//        this.office = office;
//    }
//
//    public List<Employee> getEmployeeList() {
//        return employeeList;
//    }
//    public void setEmployeeList(List<Employee> employeeList) {
//        this.employeeList = employeeList;
//    }
}
