package cibertec.edu.pe.app_greenbus_ejercicio2.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Reserva")
public class Reservas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idres;

    private int nrores;

    @Column(name = "metodopago", length = 25)
    private String metodopago;

    @Column(name = "nomcli", length = 50)
    private String nomcli;

    @Column(name = "dnicli", length = 8)
    private String dnicli;

    @Column(name = "empresa", length = 30)
    private String empresa;

    @Column(name = "Destino", length = 40)
    private String destino;

    @Column(name = "Inicio", length = 40)
    private String inicio;

    @Column(name = "fecviaje", length = 8)
    private String fecviaje;

    @Column(name = "Precio")
    private double precio;


}
