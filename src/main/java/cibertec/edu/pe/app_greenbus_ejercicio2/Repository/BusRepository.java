package cibertec.edu.pe.app_greenbus_ejercicio2.Repository;
import cibertec.edu.pe.app_greenbus_ejercicio2.Model.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusRepository extends JpaRepository<Bus, Integer> {
}
