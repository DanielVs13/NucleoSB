package com.itsqmet.proyectoNucleo.controladores;

import com.itsqmet.proyectoNucleo.entidades.Aula;
import com.itsqmet.proyectoNucleo.entidades.Curso;
import com.itsqmet.proyectoNucleo.repositorio.AulaRepository;
import com.itsqmet.proyectoNucleo.repositorio.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AulaController {

    @Autowired
    private AulaRepository aulaRepository;

    @Autowired
    private CursoRepository cursoRepository;

    // READ
    @GetMapping("/aulas")
    public String aula(Model model) {
        List<Aula> aulas = aulaRepository.findAll();
        model.addAttribute("aulas", aulas);
        return "aula/aula";
    }

    // CREAR
    @GetMapping("/aula/form")
    public String formulario(Model model) {
        model.addAttribute("aula", new Aula());
        List<Curso> cursos = cursoRepository.findAll();
        model.addAttribute("cursos", cursos);
        return "aula/formulario";
    }

    @PostMapping("/aula/form")
    public String crear(Aula aula) {
        aulaRepository.save(aula);
        return "redirect:/aulas";  // Redirige al listado de aulas después de guardar
    }

    // ELIMINAR
    @GetMapping("/aula/eliminar/{id}")
    public String eliminar(@PathVariable int id) {
        aulaRepository.deleteById(id);
        return "redirect:/aulas";
    }

    @GetMapping("/aula/editar/{id}")
    public String editar(@PathVariable int id, Model model) {
        Aula aula = aulaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid aula id:" + id));
        model.addAttribute("aula", aula);
        return "aula/formulario";
    }
}

