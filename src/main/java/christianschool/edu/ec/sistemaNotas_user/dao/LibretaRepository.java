/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christianschool.edu.ec.sistemaNotas_user.dao;

import christianschool.edu.ec.sistemaNotas_user.model.Grado;
import christianschool.edu.ec.sistemaNotas_user.model.Libreta;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author willy
 */
public interface LibretaRepository extends CrudRepository<Libreta, Long> {
    @Query(value = "Select * from libreta ", nativeQuery = true)
    List<Libreta> alllibreta();
    Grado findUserByidLibreta(Long nombre);

}
