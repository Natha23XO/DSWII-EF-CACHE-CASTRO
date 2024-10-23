package pe.edu.cibertec.dswii_ef_cache_castro.service;

import pe.edu.cibertec.dswii_ef_cache_castro.model.Cita;

import java.util.List;

public interface ICitaService {
    List<Cita> obtenerCitasPorAnio(int anio);
    Cita registrarCita(Cita cita);
    Cita actualizarCita(Cita cita);
    void eliminarCache();
}
