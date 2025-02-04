package com.itsqmet.proyectoNucleo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Inscripcion {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private int idInscripcion ;
    private  int idEstudiante;
    private  int idCurso;
    private  String datosInscripcion;
}
