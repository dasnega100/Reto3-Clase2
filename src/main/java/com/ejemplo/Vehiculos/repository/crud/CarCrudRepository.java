package com.ejemplo.Vehiculos.repository.crud;

import com.ejemplo.Vehiculos.model.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarCrudRepository extends CrudRepository<Car,Integer> {

}
