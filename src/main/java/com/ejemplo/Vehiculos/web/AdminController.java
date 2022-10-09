package com.ejemplo.Vehiculos.web;

import com.ejemplo.Vehiculos.model.Admin;
import com.ejemplo.Vehiculos.model.Car;
import com.ejemplo.Vehiculos.service.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Admin")
public class AdminController {
    @Autowired //Esto hace que gestione lo automatico por springboot
    private AdminService adminService;

    //Este es la url donde vamos a llamar todo el contenido de la tabla
    @GetMapping("/all")
    public List<Admin> getAdmin() {
        return adminService.getAll();
    }

    //hacemos una llamado parcia la la tabla con un id de referencia
    @GetMapping("/{id}")
    public Optional<Admin> getAdmin(@PathVariable("id") int adminId){
        return  adminService.getAdmin(adminId);
    }

    //Aca creamos un nuevo dato para la tabla
    @PostMapping("save")
    @ResponseStatus(HttpStatus.CREATED)
    public Admin save(@RequestBody Admin admin){
        return adminService.save(admin);
    }
    //Aqui actualizamos un datos para la tabla en la poscion de update y con un verbo put
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Admin update(@RequestBody Admin admin){
        return adminService.update(admin);
    }
    // Aca borramos un dato con el id que ingresen en la url y tendra dos estados se borra la fila queda sin contenido  no se borra no ejcuta la fila
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id")int adminId){
        return adminService.deleteAdmin(adminId);
    }

}
