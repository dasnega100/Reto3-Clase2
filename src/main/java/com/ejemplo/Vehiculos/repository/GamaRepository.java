package com.ejemplo.Vehiculos.repository;

import com.ejemplo.Vehiculos.model.Car;
import com.ejemplo.Vehiculos.model.Gama;
import com.ejemplo.Vehiculos.repository.crud.GamaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class GamaRepository {
    @Autowired
    private GamaCrudRepository gamaCrudRepository;
    public List<Gama> getAll(){
        return (List<Gama>) gamaCrudRepository.findAll();
    }
    public Optional<Gama> getGama(int id){
        return gamaCrudRepository.findById(id);
    }

    public Gama save(Gama gama){
        return gamaCrudRepository.save(gama);
    }
    public void delete(Gama gama){
        gamaCrudRepository.delete(gama);
    }

}
