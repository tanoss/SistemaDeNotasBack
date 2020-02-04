/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christianschool.edu.ec.sistemaNotas_user.controller;

import christianschool.edu.ec.sistemaNotas_user.dao.LibretaRepository;
import christianschool.edu.ec.sistemaNotas_user.dao.PersonaRepository;
import christianschool.edu.ec.sistemaNotas_user.model.Libreta;
import christianschool.edu.ec.sistemaNotas_user.model.Persona;
import christianschool.edu.ec.sistemaNotas_user.util.segMessage;
import christianschool.edu.ec.sistemaNotas_user.util.segMessage;
import christianschool.edu.ec.sistemaNotas_user.vo.libretaVo;
import christianschool.edu.ec.sistemaNotas_user.vo.libretaeVo;
import christianschool.edu.ec.sistemaNotas_user.vo.libretanotaVo;
import christianschool.edu.ec.sistemaNotas_user.vo.libretapVo;
import christianschool.edu.ec.sistemaNotas_user.vo.libretamVo;

import java.sql.SQLException;
import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
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
public class CalificacionRest {

    private final segMessage mensaje = new segMessage();

    @Autowired
    private libretanotaVo libretaRep;
    
    @Autowired
    private LibretaRepository libretaRep1;

    //condicion para traer las materias y notas de un estudiante
    @RequestMapping(value = "/id/{data}", method = RequestMethod.GET)
    public ResponseEntity libretaById(@PathVariable String data) throws SQLException {
        String wa = "where p.cedula = '" + data + "'";
        List<libretaVo> libreta = libretaRep.getLibreta(wa);
        return new ResponseEntity(libreta, HttpStatus.OK);
    }

    //trae los cursos a los que da clases el profesor
    @RequestMapping(value = "/idp/{data}", method = RequestMethod.GET)
    public ResponseEntity libretap(@PathVariable String data) throws SQLException {
        String wi = " where p.cedula = '" + data + "' group by gp.id_grado_paralelo, pl.id_paralelo, g.nombre_grado;";
        List<libretapVo> libreta1 = libretaRep.getLibretap(wi);
        return new ResponseEntity(libreta1, HttpStatus.OK);
    }

    //trae todas las materia de  un docente en un grado especifico
    @RequestMapping(value = "/idm/{data}/{data1}", method = RequestMethod.GET)
    public ResponseEntity libretam(@PathVariable String data, @PathVariable int data1) throws SQLException {
        String we = " where p.cedula = '" + data + "' AND gp.id_grado_paralelo = " + data1 + " ";
        List<libretamVo> libreta2 = libretaRep.getLibretam(we);
        return new ResponseEntity(libreta2, HttpStatus.OK);
    }

    // trar los estudiantes de un profesor de un grado en especifico de una materia
    @RequestMapping(value = "/idme/{data}/{data1}/{data3}", method = RequestMethod.GET)
    public ResponseEntity libretamep(@PathVariable int data, @PathVariable int data1, @PathVariable int data3) throws SQLException {
        String wu = " where d.id_docente = " + data + " AND gp.id_grado_paralelo = " + data1 + " AND m.id_materia = " + data3 + " ";
        List<libretaeVo> libreta3 = libretaRep.getLibretaestudiante(wu);
        if (libreta3.isEmpty()) {
            return new ResponseEntity(mensaje.notfound(), HttpStatus.OK);
        } else {
            return new ResponseEntity(libreta3, HttpStatus.OK);

        }
    }

    //guarda las notas de un estudiante
    @RequestMapping(value = "/editnotas", method = RequestMethod.PUT)
    public ResponseEntity<Libreta> actualizarPerfil(@Valid @RequestBody Libreta perfilA) {
        libretaRep1.save(perfilA);
        return new ResponseEntity(mensaje.update(), HttpStatus.OK);
    }

}
