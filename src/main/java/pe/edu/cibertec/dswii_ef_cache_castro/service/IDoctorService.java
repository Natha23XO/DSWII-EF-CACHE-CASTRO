package pe.edu.cibertec.dswii_ef_cache_castro.service;

import pe.edu.cibertec.dswii_ef_cache_castro.model.Doctor;

import java.util.List;

public interface IDoctorService {
    List<Doctor> obtenerDoctoresXIdEspecialidad(Integer idEspecialidad);
    Doctor registrarDoctor(Doctor doctor);
    Doctor actualizarDoctor(Doctor doctor);
    void eliminarCache();
}
