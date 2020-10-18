package com.autorent.Controller;

import com.autorent.DTO.CarDTO;
import com.autorent.Model.Car;
import com.autorent.Service.CarService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class CarsController {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CarService carService;

    @GetMapping("/allcars")
    public List<CarDTO> carDTOList() {
        List<Car> cars = carService.getCars();

        List<CarDTO> carDTOS =  cars.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());

        return carDTOS;
    }

    private CarDTO convertToDto(Car car) {
        CarDTO carDTO = modelMapper.map(car, CarDTO.class);
        return carDTO;
    }
}
