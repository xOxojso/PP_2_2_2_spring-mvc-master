package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("car1", 2000, "red"));
        cars.add(new Car("car2", 2005, "blue"));
        cars.add(new Car("car3", 2010, "black"));
        cars.add(new Car("car4", 2015, "pink"));
        cars.add(new Car("car5", 2020, "purple"));
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getCarsByCount(Integer count) {
        return switch (count) {
            case 1 -> cars.stream().limit(1).toList();
            case 2 -> cars.stream().limit(2).toList();
            case 3 -> cars.stream().limit(3).toList();
            case 4 -> cars.stream().limit(4).toList();
            default -> cars;
        };
    }
}
