
package christianschool.edu.ec.sistemaNotas_user.dao;

import christianschool.edu.ec.sistemaNotas_user.model.Paralelo;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ParaleloRepository extends CrudRepository<Paralelo, Long>{
    @Query(value = "select * from paralelo", nativeQuery = true)
    List<Paralelo> findallParalelo();
    Paralelo findUserByidParalelo(Long idParalelo);

    
}
