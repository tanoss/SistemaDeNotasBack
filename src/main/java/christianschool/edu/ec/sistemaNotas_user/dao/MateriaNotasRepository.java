
package christianschool.edu.ec.sistemaNotas_user.dao;

import christianschool.edu.ec.sistemaNotas_user.model.MateriaNotas;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface MateriaNotasRepository extends CrudRepository<MateriaNotas, Long>  {
    @Query(value = "select * from materia_notas", nativeQuery = true)
    List<MateriaNotas> findallMateriaNotas();
    MateriaNotas findUserByidMateriaNotas(Long idMateriaNotas);
}
