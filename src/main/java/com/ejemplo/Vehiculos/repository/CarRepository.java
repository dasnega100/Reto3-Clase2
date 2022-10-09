package com.ejemplo.Vehiculos.repository;

import com.ejemplo.Vehiculos.model.Car;
import com.ejemplo.Vehiculos.repository.crud.CarCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CarRepository {
    @Autowired
    private CarCrudRepository carCrudRepository;

    public List<Car> getAll(){
        return (List<Car>) carCrudRepository.findAll();
    }

    public Optional<Car> getCar(int id){
        return carCrudRepository.findById(id);
    }

    public Car save(Car car){
        return carCrudRepository.save(car);
    }
    public void delete(Car car){
        carCrudRepository.delete(car);
    }

}
