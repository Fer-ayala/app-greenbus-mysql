package cibertec.edu.pe.app_greenbus_ejercicio2.Repository;
import cibertec.edu.pe.app_greenbus_ejercicio2.Model.Reservas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservasRepository extends JpaRepository<Reservas, Integer>{
}
