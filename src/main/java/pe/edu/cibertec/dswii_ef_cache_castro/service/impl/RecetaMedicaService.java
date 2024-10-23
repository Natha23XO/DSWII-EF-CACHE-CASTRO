package pe.edu.cibertec.dswii_ef_cache_castro.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.dswii_ef_cache_castro.model.RecetaMedica;
import pe.edu.cibertec.dswii_ef_cache_castro.repository.RecetaMedicaRepository;
import pe.edu.cibertec.dswii_ef_cache_castro.service.IRecetaMedicaService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RecetaMedicaService implements IRecetaMedicaService {
    private final RecetaMedicaRepository recetaMedicaRepository;

    @Cacheable(value = "recetasPorAnioCita", key = "#anio")
    @Override
    public List<RecetaMedica> obtenerRecetaPorAnioDeCita(int anio) {
        return recetaMedicaRepository.obtenerRecetasPorAnio(anio);
    }
}
