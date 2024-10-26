package cibertec.edu.pe.app_greenbus_ejercicio2.Repository;

import cibertec.edu.pe.app_greenbus_ejercicio2.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer > {

}
