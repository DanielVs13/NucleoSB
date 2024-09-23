package com.itsqmet.proyectoNucleo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idDocente;
    private String docenteNombre;
    private String docenteApellido;
    private String correo;
    private String especialidad;
}

