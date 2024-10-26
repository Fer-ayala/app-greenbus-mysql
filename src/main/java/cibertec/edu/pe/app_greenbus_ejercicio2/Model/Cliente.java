package cibertec.edu.pe.app_greenbus_ejercicio2.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcliente;

    private String nomcli;

    private String dnicli;

    private String telefono;

    private int edad;

    private String dircli;
}
