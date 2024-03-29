package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;



import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> list;


    public CarServiceImpl() {
        list = new ArrayList<>();
        list.add(new Car("Koenigsegg", "Agera", 2018));
        list.add(new Car("Koenigsegg", "Gemera", 2023));
        list.add(new Car("Bugatti", "Divo", 2022));
        list.add(new Car("Bugatti", "Chiron", 2023));
        list.add(new Car("Porsche", "911 GT3 touring", 2023));
    }

    @Override
    public List<Car> listCars() {
        return list;
    }
}
