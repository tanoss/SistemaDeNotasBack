
package christianschool.edu.ec.sistemaNotas_user.dao;

import christianschool.edu.ec.sistemaNotas_user.model.CursoGrado;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CursoGradoRepository extends CrudRepository<CursoGrado, Long> {
    @Query(value = "select * from curso_grado", nativeQuery = true)
    List<CursoGrado> findallCursoGrado();
    CursoGrado findUserByidCursoGrado(Long idCursoGrado);

    
}
