package com.ejemplo.Vehiculos.repository;

import com.ejemplo.Vehiculos.model.Client;
import com.ejemplo.Vehiculos.model.Gama;
import com.ejemplo.Vehiculos.repository.crud.ClientCrudRepository;
import com.ejemplo.Vehiculos.repository.crud.GamaCrudRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientRepository {
    @Autowired
    private ClientCrudRepository clientCrudRepository;
    public List<Client> getAll(){
        System.out.println("Respositorio");
        return (List<Client>) clientCrudRepository.findAll();
    }
    public Optional<Client> getClient(int id){
        return clientCrudRepository.findById(id);
    }

    public Client save(Client client){
        return clientCrudRepository.save(client);
    }
    public void delete(Client client){
        clientCrudRepository.delete(client);
    }

}

