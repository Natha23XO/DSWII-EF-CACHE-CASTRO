package pe.edu.cibertec.dswii_ef_cache_castro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.dswii_ef_cache_castro.model.Doctor;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Integer> {

    @Query(value = "SELECT * FROM Doctor WHERE idespecialidad =:id", nativeQuery = true)
    List<Doctor> obtenerDoctoresXEspecialidad(@Param("id") int idEspecialidad);
}
