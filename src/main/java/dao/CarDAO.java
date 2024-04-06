package dao;

import models.Car;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Tesla", "red", 2020));
        carList.add(new Car("Mazda", "silver", 2021));
        carList.add(new Car("Toyota", "blue", 2019));
        carList.add(new Car("BMW", "white", 2022));
        carList.add(new Car("Audi", "black", 2018));
    }

    public List<Car> getCarList() {
        return carList;
    }
}
