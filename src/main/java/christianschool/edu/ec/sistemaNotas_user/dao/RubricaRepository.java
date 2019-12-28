
package christianschool.edu.ec.sistemaNotas_user.dao;

import christianschool.edu.ec.sistemaNotas_user.model.Rubrica;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface RubricaRepository extends CrudRepository<Rubrica, Long> {
    @Query(value = "select * from rubrica", nativeQuery = true)
    List<Rubrica> findallRubrica();
    Rubrica findUserByidRubrica (Long idRubrica);

}
