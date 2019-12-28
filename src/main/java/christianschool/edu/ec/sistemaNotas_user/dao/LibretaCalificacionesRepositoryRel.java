
package christianschool.edu.ec.sistemaNotas_user.dao;

import christianschool.edu.ec.sistemaNotas_user.model.LibretaCalificacionesRel;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface LibretaCalificacionesRepositoryRel extends CrudRepository<LibretaCalificacionesRel, Long> {
    @Query(value = "select * from libreta_calificaciones", nativeQuery = true)
    List<LibretaCalificacionesRel> findallLibretaCalificaciones();
    LibretaCalificacionesRel findUserByidLibreta(Long idLibreta);
}
