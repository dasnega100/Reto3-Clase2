package com.ejemplo.Vehiculos.repository.crud;

import com.ejemplo.Vehiculos.model.Reservation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface ReservationCrudRepository extends CrudRepository<Reservation,Integer> {

    //select count(*) as "total", carId from reservation group by carId order by total desc;

    @Query("SELECT c.car, COUNT(c.car) from Reservation AS c group by c.car order by COUNT(c.car) DESC")
    public List<Object[]> countTotalReservationsByCar();


    //select clientId, count(*) as "total" from reservation group by clientId order by total desc;
    @Query("SELECT c.client, COUNT(c.client) from Reservation AS c group by c.client order by COUNT(c.client) DESC")
    public List<Object[]> countTotalReservationsByClient();

    public List<Reservation> findAllByStartDateAfterAndStartDateBefore(Date dateOne,Date dateTwo );

    public List<Reservation>findAllByStatus(String status);
}
