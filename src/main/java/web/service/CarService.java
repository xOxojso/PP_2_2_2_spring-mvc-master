package web.service;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;

@Repository
public interface CarService {
    List<Car> getCarsByCount(int count);
}
