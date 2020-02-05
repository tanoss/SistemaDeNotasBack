/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christianschool.edu.ec.sistemaNotas_user.controller;

import christianschool.edu.ec.sistemaNotas_user.dao.MateriaDocenteGradoRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import christianschool.edu.ec.sistemaNotas_user.dao.PersonaRepository;
import christianschool.edu.ec.sistemaNotas_user.dao.PersonaRepositoryRel;
import christianschool.edu.ec.sistemaNotas_user.model.MateriaDocenteGrado;
import christianschool.edu.ec.sistemaNotas_user.model.Persona;
import christianschool.edu.ec.sistemaNotas_user.model.PersonaRel;
import christianschool.edu.ec.sistemaNotas_user.model.segToken;
import christianschool.edu.ec.sistemaNotas_user.util.cryptPassword;
import christianschool.edu.ec.sistemaNotas_user.util.passToken;
import christianschool.edu.ec.sistemaNotas_user.util.segMessage;
import christianschool.edu.ec.sistemaNotas_user.vo.libretanotaVo;
import christianschool.edu.ec.sistemaNotas_user.vo.libretapVo;
import christianschool.edu.ec.sistemaNotas_user.vo.profesorVo;
import java.sql.SQLException;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author willy
 */
@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
@RestController
@RequestMapping("/sdn")
public class Profesor {
    
    private final segMessage mensaje = new segMessage();

    @Autowired
    private libretanotaVo libretaRep;

    @Autowired
    private MateriaDocenteGradoRepository mdg;

    //trae los cursos a los que da clases el profesor
    @RequestMapping(value = "/profesorasig", method = RequestMethod.GET)
    public ResponseEntity libretap() throws SQLException {
        String wi = " where p.id_tipo_usuario = 2 ";
        List<profesorVo> profesor = libretaRep.getdocentesid(wi);
        return new ResponseEntity(profesor, HttpStatus.OK);
    }

    //Asignar un Docente a un paralelo y materia
    @RequestMapping(value = "/profesorasig1", method = RequestMethod.POST)
    public ResponseEntity<MateriaDocenteGrado> asigp(@RequestBody MateriaDocenteGrado paralelo) throws SQLException {
        mdg.save(paralelo);
        return new ResponseEntity(mensaje.add(), HttpStatus.OK);
    }


}
