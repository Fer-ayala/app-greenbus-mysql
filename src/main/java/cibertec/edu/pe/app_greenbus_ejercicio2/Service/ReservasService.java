package cibertec.edu.pe.app_greenbus_ejercicio2.Service;

import cibertec.edu.pe.app_greenbus_ejercicio2.Model.Reservas;
import cibertec.edu.pe.app_greenbus_ejercicio2.Repository.ReservasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservasService {
    @Autowired
    private ReservasRepository reservasRepository;

    public List<Reservas> obtenerReservas(){
        return reservasRepository.findAll();
    }
    public Reservas buscarReservaPorId(int idRes){
        return reservasRepository.findById(idRes).orElse(null);
    }
    public Reservas guardarReserva(Reservas reservas){
        return reservasRepository.save(reservas);
    }
    public Reservas actualizarReserva(int idRes, Reservas reservas){
        reservas.setIdres(idRes);
        return reservasRepository.save(reservas);
    }
    public void eliminarReserva(int idRes){
        reservasRepository.deleteById(idRes);
    }
}
