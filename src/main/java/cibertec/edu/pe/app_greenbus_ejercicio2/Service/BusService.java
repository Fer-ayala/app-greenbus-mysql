package cibertec.edu.pe.app_greenbus_ejercicio2.Service;

import cibertec.edu.pe.app_greenbus_ejercicio2.Model.Bus;
import cibertec.edu.pe.app_greenbus_ejercicio2.Repository.BusRepository;
import cibertec.edu.pe.app_greenbus_ejercicio2.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusService {
    @Autowired
    private BusRepository busRepository;
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Bus> obtenerBus(){
        return busRepository.findAll();
    }
    public Bus buscarBusPorId(int idbus){
        return busRepository.findById(idbus).orElse(null);
    }
    public Bus guardarBus(Bus bus){
        return busRepository.save(bus);
    }
    public void eliminarBus (int idbus){
        busRepository.deleteById(idbus);
    }
    public Bus actualizarBus(int idbus,Bus bus){
        bus.setIdbus(idbus);
        return busRepository.save(bus);
    }
}
