package pe.edu.cibertec.dswii_ef_cache_castro.service;


import pe.edu.cibertec.dswii_ef_cache_castro.model.RecetaMedica;

import java.util.List;

public interface IRecetaMedicaService {
    List<RecetaMedica> obtenerRecetaPorAnioDeCita(int anio);

}
