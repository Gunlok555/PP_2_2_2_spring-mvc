package web.service;

import web.model.CarModel;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl extends CarService {


    private final List<CarModel> cars = new ArrayList<>();

    {
        cars.add(new CarModel("TAZ", "2101", 1));
        cars.add(new CarModel("TAZ", "2102", 2));
        cars.add(new CarModel("TAZ", "2103", 3));
        cars.add(new CarModel("TAZ", "2104", 4));
        cars.add(new CarModel("TAZ", "2105", 5));
    }

@Override
    public List<CarModel> getCars() {

        return cars;
    }
@Override
    public List<CarModel> getCount(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}