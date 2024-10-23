package pe.edu.cibertec.dswii_ef_cache_castro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.dswii_ef_cache_castro.model.Cita;

import java.util.List;

@Repository
public interface CitaRepository extends JpaRepository<Cita,Integer> {

    @Query(value = "select * from Cita where year(fecha) = :anio", nativeQuery = true)
    List<Cita> obtenerCitasPorAnio(@Param("anio") int anio);

}
