package pe.edu.cibertec.dswii_ef_cache_castro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.dswii_ef_cache_castro.model.Medicamento;

@Repository
public interface MedicamentoRepository extends JpaRepository<Medicamento,Integer> {
}
