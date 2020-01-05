/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christianschool.edu.ec.sistemaNotas_user.dao;


import christianschool.edu.ec.sistemaNotas_user.model.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author willy
 */
public interface PersonaRepository extends CrudRepository<Persona, Long> {
    @Query(value = "select * from persona order by id_persona", nativeQuery = true)
    List<Persona> findallUser();
    Persona findUserByCedula(String cedula);
    @Query(value = "select * from persona where id_tipo_usuario=3 order by nombre", nativeQuery = true)
    List<Persona> findallestudents();
    @Query(value = "select * from persona where id_tipo_usuario=2 order by nombre", nativeQuery = true)
    List<Persona> findallprofesores();
}
