package com.itsqmet.proyectoNucleo.repositorio;

import com.itsqmet.proyectoNucleo.entidades.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
}
