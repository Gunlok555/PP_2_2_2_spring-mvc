package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import web.model.CarModel;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String getMyCars(@RequestParam(value = "count") Integer count, Model model) {
        List<CarModel> cars = new ArrayList<>();
        cars.add(new CarModel("TAZ","2101",1));
        cars.add(new CarModel("TAZ","2102",2));
        cars.add(new CarModel("TAZ","2103",3));
        cars.add(new CarModel("TAZ","2104",4));
        cars.add(new CarModel("TAZ","2105",5));
        if (count <= 5) {
            cars = CarServiceImpl.getCount(cars, count);
        }
        model.addAttribute("cars",cars);
        return "cars";
    }


}
