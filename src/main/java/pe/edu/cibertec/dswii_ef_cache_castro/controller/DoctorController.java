package pe.edu.cibertec.dswii_ef_cache_castro.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.dswii_ef_cache_castro.model.Doctor;
import pe.edu.cibertec.dswii_ef_cache_castro.service.IDoctorService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/doctor")
public class DoctorController {
    private final IDoctorService iDoctorService;

    @GetMapping("/{id}")
    public List<Doctor> obtenerDoctoresXIdEspe(@PathVariable("id") int id) {
        return iDoctorService.obtenerDoctoresXIdEspecialidad(id);
    }
}
