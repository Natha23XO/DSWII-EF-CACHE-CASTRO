package pe.edu.cibertec.dswii_ef_cache_castro.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.dswii_ef_cache_castro.model.RecetaMedica;
import pe.edu.cibertec.dswii_ef_cache_castro.service.IRecetaMedicaService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/receta-medica")
public class RecetaMedicaController {
    private final IRecetaMedicaService recetaMedicaService;

    @GetMapping("/{anio}")
    public List<RecetaMedica> obtenerRMPorAnioCita(@PathVariable("anio") int anio) {
        return recetaMedicaService.obtenerRecetaPorAnioDeCita(anio);
    }

}
