package web.service;

import web.model.CarModel;
import java.util.List;


public class CarServiceImpl {
    static public List<CarModel> getCount(List<web.model.CarModel> cars, int count) {
        return cars.stream().limit(count).toList();
    }
}
