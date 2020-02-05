/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christianschool.edu.ec.sistemaNotas_user.dao;

import christianschool.edu.ec.sistemaNotas_user.model.Clase;
import christianschool.edu.ec.sistemaNotas_user.model.GradoParalelo;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author willy
 */
public interface ClaseRepository extends CrudRepository <Clase, Long> {
    @Query(value="select * from clase",nativeQuery=true)
    List<Clase> allclase();
    
}
