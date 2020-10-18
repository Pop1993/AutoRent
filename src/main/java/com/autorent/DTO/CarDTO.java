package com.autorent.DTO;

import com.autorent.Model.Branch;
import com.autorent.Model.CarRental;
import com.autorent.Model.CarStatus;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
public class CarDTO {

    private Integer id;
    private String make;
    private String model;
    private String bodyType;
    private String color;
    private Integer yearOfMake;
    private Integer Mileage;
    private CarStatus carStatus;
    private Double pricePerDay;

//    @Getter(AccessLevel.NONE)
//    @Setter(AccessLevel.NONE)
    private String branch;

    public void setBranch(Branch branch) {
        this.branch = branch.getCity();
    }

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<CarRental> rentals;


}
