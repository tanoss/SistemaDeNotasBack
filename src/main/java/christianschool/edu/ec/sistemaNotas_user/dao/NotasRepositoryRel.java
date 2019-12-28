
package christianschool.edu.ec.sistemaNotas_user.dao;

import christianschool.edu.ec.sistemaNotas_user.model.NotasRel;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface NotasRepositoryRel  extends CrudRepository<NotasRel, Long>{
    @Query(value = "select * from notas", nativeQuery = true)
    List<NotasRel> findallNotas();
    NotasRel findUserByidNotas(Long idNotas);
}