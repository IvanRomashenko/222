package web.dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAO {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "model1", 2020));
        cars.add(new Car(2, "model2", 2021));
        cars.add(new Car(3, "model3", 2022));
        cars.add(new Car(4, "model4", 2023));
        cars.add(new Car(5, "model5", 2024));

    }

    public List<Car> allCars() {
        return cars;
    }

    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
