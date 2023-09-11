package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String getCarsByCount(@RequestParam(value = "count", required = false) Integer count,
                                 ModelMap modelMap) {

        List<Car> cars = carService.getCarsByCount(count);
        modelMap.addAttribute("cars", cars);
        return "cars";
    }
}
