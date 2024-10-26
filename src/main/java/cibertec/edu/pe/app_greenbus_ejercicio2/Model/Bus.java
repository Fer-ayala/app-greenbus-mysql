package cibertec.edu.pe.app_greenbus_ejercicio2.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idbus;

    private String empresa;

    private int calificacion;

    private String destino;

    private String inicio;

    private String fecviaje;

    private double Precio;
}
