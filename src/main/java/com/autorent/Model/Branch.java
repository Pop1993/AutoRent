package com.autorent.Model;

import lombok.Data;

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
    private RentalOffice office;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "branch")
    private List<Employee> employeeList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "branch")
    private  List<Car> carList;

    @OneToOne(mappedBy = "pickUpBranch")
    private CarRental pickUpLoc;

    @OneToOne(mappedBy = "returnBranch")
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
