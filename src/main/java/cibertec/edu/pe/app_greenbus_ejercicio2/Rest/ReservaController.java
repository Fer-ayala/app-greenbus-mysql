package cibertec.edu.pe.app_greenbus_ejercicio2.Rest;

import cibertec.edu.pe.app_greenbus_ejercicio2.Model.Reservas;
import cibertec.edu.pe.app_greenbus_ejercicio2.Repository.ReservasRepository;
import cibertec.edu.pe.app_greenbus_ejercicio2.Service.ReservasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservas")
public class ReservaController {
    @Autowired
    ReservasService reservasService;

    @GetMapping
    public List<Reservas> obtenerReservas(){
        return reservasService.obtenerReservas();
    }
    @GetMapping("/{idRes}")
    public Reservas buscarReservaPorId(@PathVariable int idRes){
        return reservasService.buscarReservaPorId(idRes);
    }

    @PostMapping
    public Reservas guardarReserva(@RequestBody Reservas reservas){
        return reservasService.guardarReserva(reservas);
    }
    @PutMapping("/{idRes}")
    public Reservas actualizarReserva(@PathVariable int idRes, @RequestBody Reservas reservas){
        return reservasService.actualizarReserva(idRes, reservas);
    }
    @DeleteMapping("/{idRes}")
    public void eliminarReserva(@PathVariable int idRes){
        reservasService.eliminarReserva(idRes);
    }
}
