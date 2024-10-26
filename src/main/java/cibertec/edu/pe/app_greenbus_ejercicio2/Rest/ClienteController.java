package cibertec.edu.pe.app_greenbus_ejercicio2.Rest;

import cibertec.edu.pe.app_greenbus_ejercicio2.Model.Cliente;
import cibertec.edu.pe.app_greenbus_ejercicio2.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import cibertec.edu.pe.app_greenbus_ejercicio2.Service.ClienteService;
import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> obtenerClientes(){
        return clienteService.obtenerClientes();
    }
    @GetMapping("/{idcliente}")
    public Cliente buscarClientePorId(@PathVariable int idcliente){
        return clienteService.buscarClientePorId(idcliente);
    }
    @PostMapping
    public Cliente guardarCliente(@RequestBody Cliente cliente){
        return clienteService.guardarCliente(cliente);
    }
    @PutMapping("/{idcliente}")
    public Cliente actualizarCliente(@PathVariable int idcliente, @RequestBody Cliente cliente){
        return clienteService.actualizarCliente(idcliente, cliente);
    }
    @DeleteMapping("/{idcliente}")
    public void eliminarCliente(@PathVariable int idcliente){
        clienteService.eliminarCliente(idcliente);
    }

}
