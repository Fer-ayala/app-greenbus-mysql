package cibertec.edu.pe.app_greenbus_ejercicio2.Rest;

import cibertec.edu.pe.app_greenbus_ejercicio2.Service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import cibertec.edu.pe.app_greenbus_ejercicio2.Model.Bus;
import java.util.List;

@RestController
@RequestMapping("/api/bus")
public class BusController {
    @Autowired
    private BusService busService;

    @GetMapping
    public List<Bus> obtenerBus(){
        return busService.obtenerBus();
    }
    @GetMapping("/{idbus}")
    public Bus buscarBusPorId(@PathVariable int idbus){
        return busService.buscarBusPorId(idbus);
    }
    @PostMapping
    public Bus guardarBus(@RequestBody Bus bus){
        return busService.guardarBus(bus);
    }
    @PutMapping("/{idbus}")
    public Bus actualizarBus(@PathVariable int idbus,@RequestBody Bus bus){
        return busService.actualizarBus(idbus, bus);
    }
    @DeleteMapping("/{idbus}")
    public void eliminarBus(@PathVariable int idbus){
        busService.eliminarBus(idbus);
    }
}
