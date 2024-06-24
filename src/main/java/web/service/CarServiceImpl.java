package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService{
    private List<Car> carList;
    public CarServiceImpl() {
        carList = new ArrayList<>();
        carList.add(new Car("Toyota", "Camry", 2020));
        carList.add(new Car("Honda", "Civic", 2021));
        carList.add(new Car("Ford", "Focus", 2019));
        carList.add(new Car("Chevrolet", "Niva", 2024));
        carList.add(new Car("Nissan", "GT-R", 2022));
    }
    @Override
    public List<Car> getCars(int count) {
        if (count >= carList.size() || count <= 0) {
            return carList;
        } else {
            return carList.subList(0, count);
        }
    }
}