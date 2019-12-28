
package christianschool.edu.ec.sistemaNotas_user.dao;

import christianschool.edu.ec.sistemaNotas_user.model.LibretaCalificaciones;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface LibretaCalificacionesRepository extends CrudRepository<LibretaCalificaciones, Long> {
    
    @Query(value = "select * from libreta_calificaciones", nativeQuery = true)
    List<LibretaCalificaciones> findallLibretaCalificaciones();
    LibretaCalificaciones findUserByidLibreta(Long idLibreta);
}
