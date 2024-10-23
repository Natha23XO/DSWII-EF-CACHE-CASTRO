package pe.edu.cibertec.dswii_ef_cache_castro.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.dswii_ef_cache_castro.model.Cita;
import pe.edu.cibertec.dswii_ef_cache_castro.repository.CitaRepository;
import pe.edu.cibertec.dswii_ef_cache_castro.service.ICitaService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CitaService implements ICitaService {
    private final CitaRepository citaRepository;

    @Cacheable(value = "citasPorAnio", key = "#anio")
    @Override
    public List<Cita> obtenerCitasPorAnio(int anio) {
        return citaRepository.obtenerCitasPorAnio(anio);
    }

    @CacheEvict(value = "citasPorAnio", allEntries = true)
    @Override
    public Cita registrarCita(Cita cita) {
        return citaRepository.save(cita);
    }

    @CachePut(value = "citasPorAnio", key = "#cita.id")
    @Override
    public Cita actualizarCita(Cita cita) {
        return citaRepository.save(cita);
    }

    @CacheEvict(value = {"citasPorAnio"}, allEntries = true)
    @Override
    public void eliminarCache() {

    }
}
