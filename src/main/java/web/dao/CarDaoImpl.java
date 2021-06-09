package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> getAllCars() {
        List<Car> allCars = new ArrayList<>();
        allCars.add(new Car("BMW", "Black", "777"));
        allCars.add(new Car("Hyundai", "Silver", "111"));
        allCars.add(new Car("KIA", "Green", "123"));
        allCars.add(new Car("Volvo", "Green", "65"));
        allCars.add(new Car("Mers", "Red", "35"));
        return allCars;
    }
}