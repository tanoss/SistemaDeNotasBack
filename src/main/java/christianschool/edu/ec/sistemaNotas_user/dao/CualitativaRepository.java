
package christianschool.edu.ec.sistemaNotas_user.dao;

import christianschool.edu.ec.sistemaNotas_user.model.Cualitativas;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CualitativaRepository extends CrudRepository<Cualitativas, Long> {
    
    @Query(value = "select * from cualitativas", nativeQuery = true)
    List<Cualitativas> findallCualitativas();
    Cualitativas findUserByidCualitativas (Long idCualitativas);
}
