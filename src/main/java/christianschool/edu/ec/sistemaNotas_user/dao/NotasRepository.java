
package christianschool.edu.ec.sistemaNotas_user.dao;

import christianschool.edu.ec.sistemaNotas_user.model.Notas;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface NotasRepository extends CrudRepository<Notas, Long> {
    @Query(value = "select * from notas", nativeQuery = true)
    List<Notas> findallNotas();
    Notas findUserByidNotas(Long idNotas);
}
