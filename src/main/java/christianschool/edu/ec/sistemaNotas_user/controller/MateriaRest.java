/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christianschool.edu.ec.sistemaNotas_user.controller;

import christianschool.edu.ec.sistemaNotas_user.dao.GradoParaleloRepository;
import christianschool.edu.ec.sistemaNotas_user.dao.GradoRepository;
import christianschool.edu.ec.sistemaNotas_user.dao.ParaleloRepository;
import christianschool.edu.ec.sistemaNotas_user.model.Grado;
import christianschool.edu.ec.sistemaNotas_user.model.GradoParalelo;
import christianschool.edu.ec.sistemaNotas_user.model.Paralelo;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import christianschool.edu.ec.sistemaNotas_user.util.segMessage;
import java.sql.SQLException;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author willy
 */
@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
@RestController
@RequestMapping("/sdn")
public class MateriaRest {

    private final segMessage mensaje = new segMessage();

    @Autowired
    private ParaleloRepository paraleloRep;

    @Autowired
    private GradoRepository gradoRep;

    @Autowired
    private GradoParaleloRepository gradopRep;

    //listar paralelelos
    @RequestMapping(value = "/paralelo", method = RequestMethod.GET)
    public ResponseEntity<Paralelo> listaparalelo() {
        List<Paralelo> paralelo = paraleloRep.findallParalelo();
        if (paralelo.isEmpty()) {
            return new ResponseEntity(mensaje.notfound(), HttpStatus.OK);
        } else {
            return new ResponseEntity(paralelo, HttpStatus.OK);
        }
    }

    //Listar Grados
    @RequestMapping(value = "/grado", method = RequestMethod.GET)
    public ResponseEntity<Grado> listargrado() {
        List<Grado> grado = gradoRep.allgrade();
        if (grado.isEmpty()) {
            return new ResponseEntity(mensaje.notfound(), HttpStatus.OK);
        } else {
            return new ResponseEntity(grado, HttpStatus.OK);
        }
    }

    //Listar grados con paralelos
    @RequestMapping(value = "/gradop", method = RequestMethod.GET)
    public ResponseEntity<GradoParalelo> listparalelogrado() {
        List<GradoParalelo> gp = gradopRep.allgradep();
        if (gp.isEmpty()) {
            return new ResponseEntity(mensaje.notfound(), HttpStatus.OK);
        } else {
            return new ResponseEntity(gp, HttpStatus.OK);
        }
    }

    //crear un paralelo
    @RequestMapping(value = "paraleloadd", method = RequestMethod.POST)
    public ResponseEntity<Paralelo> crearparalelo(@RequestBody Paralelo paralelo) throws SQLException {
        Paralelo existe = new Paralelo();
        existe = paraleloRep.findUserByparalelo(paralelo.getParalelo());
        if (existe != null) {
            return new ResponseEntity(mensaje.ifexist(), HttpStatus.OK);
        } else {
            Paralelo cparalelo = new Paralelo();
            cparalelo.setParalelo(paralelo.getParalelo());
            cparalelo = paraleloRep.save(cparalelo);
            return new ResponseEntity(mensaje.add(), HttpStatus.CREATED);
        }
    }


    //crear un Curso
    @RequestMapping(value = "/gradoadd", method = RequestMethod.POST)
    public ResponseEntity<Grado> crearcurso(@RequestBody Grado grado) throws SQLException {
        Grado existeg = new Grado();
        existeg = gradoRep.findUserByGrado(grado.getGrado());
        if (existeg != null) {
            return new ResponseEntity(mensaje.ifexist(), HttpStatus.OK);
        } else {
            Grado gradoc = new Grado();
            gradoc.setGrado(grado.getGrado());
            gradoc.setNombreGrado(grado.getNombreGrado());
            return new ResponseEntity(gradoc, HttpStatus.CREATED);
        }
    }
    
    //asignar un palalelo a un curso
    @RequestMapping(value="/gradopadd", method = RequestMethod.POST)
    public ResponseEntity <GradoParalelo> creargp(@RequestBody GradoParalelo gradoparalelo) throws SQLException{
        GradoParalelo paralelogp = new GradoParalelo();
        paralelogp.setIdGrado(gradoparalelo.getIdGrado());
        paralelogp.setIdParalelo(gradoparalelo.getIdParalelo());
        paralelogp = gradopRep.save(paralelogp);
        return  new ResponseEntity(mensaje.add(), HttpStatus.CREATED);
        
        
    }

}
