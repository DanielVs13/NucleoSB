package com.itsqmet.proyectoNucleo.repositorio;


import com.itsqmet.proyectoNucleo.entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Integer> {
}
