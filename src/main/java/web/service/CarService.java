package web.service;


import org.springframework.stereotype.Component;
import web.model.CarModel;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class CarService {

     static List<CarModel> cars;

    {
        cars = new ArrayList<>();
        cars.add(new CarModel("TAZ", "2101", 1));
        cars.add(new CarModel("TAZ", "2102", 2));
        cars.add(new CarModel("TAZ", "2103", 3));
        cars.add(new CarModel("TAZ", "2104", 4));
        cars.add(new CarModel("TAZ", "2105", 5));
    }


    public List<CarModel> getCars() {
        return cars;
    }
    public List<CarModel> getCount(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }


}