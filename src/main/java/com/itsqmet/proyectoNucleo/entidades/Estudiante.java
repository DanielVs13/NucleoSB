package com.itsqmet.proyectoNucleo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Data
@Entity
public class Estudiante  {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private int idEstudiante ;
    @NotNull
    private  String nombre ;
    @NotNull
    private  String apellido;
    private  String cedula;
    private  String correo;
    private  String telefono ;


}
