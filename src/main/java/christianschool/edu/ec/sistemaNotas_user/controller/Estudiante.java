/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christianschool.edu.ec.sistemaNotas_user.controller;

import christianschool.edu.ec.sistemaNotas_user.dao.ClaseRepository;
import christianschool.edu.ec.sistemaNotas_user.dao.LibretaRepository;
import christianschool.edu.ec.sistemaNotas_user.model.Clase;
import christianschool.edu.ec.sistemaNotas_user.model.Libreta;
import christianschool.edu.ec.sistemaNotas_user.model.MateriaDocenteGrado;
import christianschool.edu.ec.sistemaNotas_user.util.segMessage;
import christianschool.edu.ec.sistemaNotas_user.vo.estudianteVo;
import christianschool.edu.ec.sistemaNotas_user.vo.libretanotaVo;
import christianschool.edu.ec.sistemaNotas_user.vo.profesorVo;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author willy
 */
@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
@RestController
@RequestMapping("/sdn")
public class Estudiante {
     private final segMessage mensaje = new segMessage();

    @Autowired
    private libretanotaVo libretaRep;
    
     @Autowired
    private ClaseRepository clase;
    
    //trae los cursos a los que da clases el profesor
    @RequestMapping(value = "/estudianteid", method = RequestMethod.GET)
    public ResponseEntity libretap() throws SQLException {
        String wi = " where p.id_tipo_usuario = 3 ";
        List<estudianteVo> estudiante = libretaRep.getestudiantesid(wi);
        return new ResponseEntity(estudiante, HttpStatus.OK);
    }
    
    //Asigno un estudiante a un docente ,materia,grado
    //Asignar un Docente a un paralelo y materia
    @RequestMapping(value = "/clase", method = RequestMethod.POST)
    public ResponseEntity<Clase> asigl(@RequestBody Clase clasee) throws SQLException {
        clase.save(clasee);
        return new ResponseEntity(mensaje.add(), HttpStatus.OK);
    }
    
}
