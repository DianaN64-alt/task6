package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private List<Car> cars = Arrays.asList(new Car("BMW", "red", 1997),
            new Car("Audi", "yellow", 1999),
            new Car("Mercedes", "green", 2000),
            new Car("BMW", "yellow", 1999),
            new Car("Lada_Priora", "black", 2015));

    @Override
    public List<Car> getCarsByCount(int count) {
        if (count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
