/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christianschool.edu.ec.sistemaNotas_user.dao;


import christianschool.edu.ec.sistemaNotas_user.model.PersonaRel;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author willy
 */
public interface PersonaRepositoryRel extends CrudRepository<PersonaRel, Long> {
    @Query(value = "select * from persona order by id_persona", nativeQuery = true)
    List<PersonaRel> findallUser();
    PersonaRel findUserByCedula(String cedula);
}
