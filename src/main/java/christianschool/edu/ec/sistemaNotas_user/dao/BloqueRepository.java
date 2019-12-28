
package christianschool.edu.ec.sistemaNotas_user.dao;

import christianschool.edu.ec.sistemaNotas_user.model.Bloque;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface BloqueRepository extends CrudRepository<Bloque, Long>  {
    @Query(value = "select * from bloque", nativeQuery = true)
    List<Bloque> findallBloque();
    Bloque findUserByidBloque(Long idBloque);
}
