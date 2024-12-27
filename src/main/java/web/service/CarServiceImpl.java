package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<Car>();
        cars.add(new Car("Daewoo Matiz", 12, "blue"));
        cars.add(new Car("BMW", 1, "red"));
        cars.add(new Car("Mercedes", 102, "pink"));
        cars.add(new Car("Mashina", 120, "green"));
        cars.add(new Car("Tapochec", 121, "brown"));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
