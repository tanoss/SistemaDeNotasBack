/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christianschool.edu.ec.sistemaNotas_user.controller;

import christianschool.edu.ec.sistemaNotas_user.dao.GradoRepository;
import christianschool.edu.ec.sistemaNotas_user.dao.ParaleloRepository;
import christianschool.edu.ec.sistemaNotas_user.model.Grado;
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

    @RequestMapping(value = "/paralelo", method = RequestMethod.GET)
    public ResponseEntity<Paralelo> listaparalelo() {
        List<Paralelo> paralelo = paraleloRep.findallParalelo();
        if (paralelo.isEmpty()) {
            return new ResponseEntity(mensaje.notfound(), HttpStatus.OK);
        } else {
            return new ResponseEntity(paralelo, HttpStatus.OK);
        }
    }
    //crear un paralelo
    @RequestMapping(value="paraleloadd",method = RequestMethod.POST)
    public ResponseEntity <Paralelo> crearparalelo(@RequestBody Paralelo paralelo) throws SQLException{
        Paralelo existe = new Paralelo();
        existe = paraleloRep.findUserByparalelo(paralelo.getParalelo());
        if(existe != null){
            return new ResponseEntity(mensaje.ifexist(), HttpStatus.OK);
        }else{
            Paralelo cparalelo = new Paralelo();
            cparalelo.setParalelo(paralelo.getParalelo());
            cparalelo = paraleloRep.save(cparalelo);
            return new ResponseEntity(cparalelo,HttpStatus.CREATED);
        }
    }
    
    //listar cursos con paralelos
    @RequestMapping(value= "/grado", method = RequestMethod.GET)
    public ResponseEntity<Grado> listargradop(){
        List<Grado> grad = gradoRep.allgrade();
        return new ResponseEntity(grad, HttpStatus.OK);
    }
    
    
    //crear un Curso
    @RequestMapping(value="/gradoadd" , method = RequestMethod.POST)
    public ResponseEntity<Grado>crearcurso(@RequestBody Grado grado)throws SQLException{
        Grado gradoc = new Grado();
        gradoc.setIdParalelo(grado.getIdParalelo());
        gradoc.setGrado(grado.getGrado());
        return new ResponseEntity(gradoc,HttpStatus.CREATED);    
    }
    
    

}
