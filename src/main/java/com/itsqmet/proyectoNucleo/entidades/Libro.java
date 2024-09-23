package com.itsqmet.proyectoNucleo.entidades;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Libro {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Integer id;
    private String titulo;
    private LocalDate publicacion;

    @ManyToOne
    @JoinColumn(name = "autorId")
    private Autor autor;

}
