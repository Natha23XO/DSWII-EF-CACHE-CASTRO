package pe.edu.cibertec.dswii_ef_cache_castro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.dswii_ef_cache_castro.model.RecetaMedica;

import java.util.List;

@Repository
public interface RecetaMedicaRepository extends JpaRepository<RecetaMedica,Integer> {
    @Query(value = "SELECT rm.* FROM RecetaMedica rm JOIN Cita c ON rm.idcita = c.id WHERE YEAR(c.fecha) =:anio", nativeQuery = true)
    List<RecetaMedica> obtenerRecetasPorAnio(@Param("anio") int anio);
}
