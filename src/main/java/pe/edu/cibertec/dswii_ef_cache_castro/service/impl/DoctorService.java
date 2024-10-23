package pe.edu.cibertec.dswii_ef_cache_castro.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.dswii_ef_cache_castro.model.Doctor;
import pe.edu.cibertec.dswii_ef_cache_castro.repository.DoctorRepository;
import pe.edu.cibertec.dswii_ef_cache_castro.service.IDoctorService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DoctorService implements IDoctorService {
    private final DoctorRepository doctorRepository;

    @Cacheable(value = "doctoresEspecialidad", key = "#idespecialidad")
    @Override
    public List<Doctor> obtenerDoctoresXIdEspecialidad(Integer idespecialidad) {
        return doctorRepository.obtenerDoctoresXEspecialidad(idespecialidad);
    }

    @CacheEvict(value = "doctoresEspecialidad", allEntries = true)
    @Override
    public Doctor registrarDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @CachePut(value = "doctoresEspecialidad", key = "#doctor.id")
    @Override
    public Doctor actualizarDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @CacheEvict(value = {"doctoresEspecialidad"}, allEntries = true)
    @Override
    public void eliminarCache() {

    }
}
