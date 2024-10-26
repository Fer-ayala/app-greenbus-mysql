package cibertec.edu.pe.app_greenbus_ejercicio2.Service;

import cibertec.edu.pe.app_greenbus_ejercicio2.Model.Cliente;
import cibertec.edu.pe.app_greenbus_ejercicio2.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> obtenerClientes() {
        return clienteRepository.findAll();
    }
    public Cliente guardarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
    public void eliminarCliente(int idcliente) {
        clienteRepository.deleteById(idcliente);
    }
    public Cliente buscarClientePorId(int idcliente) {
        return  clienteRepository.findById(idcliente).orElse(null);
    }
    public Cliente actualizarCliente(int idcliente,Cliente cliente){
        cliente.setIdcliente(idcliente);
        return clienteRepository.save(cliente);
    }
}
