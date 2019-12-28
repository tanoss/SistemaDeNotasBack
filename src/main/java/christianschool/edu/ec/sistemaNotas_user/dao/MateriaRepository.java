
package christianschool.edu.ec.sistemaNotas_user.dao;

import christianschool.edu.ec.sistemaNotas_user.model.Materia;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface MateriaRepository extends CrudRepository<Materia, Long>{
    @Query(value = "select * from materia", nativeQuery = true)
    List<Materia> findallMateria();
    Materia findUserByidMateria (Long idMateria);
}
