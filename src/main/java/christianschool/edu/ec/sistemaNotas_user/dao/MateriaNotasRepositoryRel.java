
package christianschool.edu.ec.sistemaNotas_user.dao;

import christianschool.edu.ec.sistemaNotas_user.model.MateriaNotasRel;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface MateriaNotasRepositoryRel extends CrudRepository<MateriaNotasRel, Long>{
    @Query(value = "select * from materia_notas", nativeQuery = true)
    List<MateriaNotasRel> findallMateriaNotas();
    MateriaNotasRel findUserByidMateriaNotas(Long idMateriaNotas);
}
