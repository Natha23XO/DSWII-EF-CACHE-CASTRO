package pe.edu.cibertec.dswii_ef_cache_castro.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.dswii_ef_cache_castro.model.Cita;
import pe.edu.cibertec.dswii_ef_cache_castro.service.ICitaService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/citas")
public class CitaController {
    private final ICitaService iCitaService;

    @GetMapping("/{anio}")
    public List<Cita> obtenerCitasPorAnio(@PathVariable("anio") int anio) {
        return iCitaService.obtenerCitasPorAnio(anio);
    }
}
