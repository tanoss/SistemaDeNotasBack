/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christianschool.edu.ec.sistemaNotas_user.controller;
import christianschool.edu.ec.sistemaNotas_user.dao.PersonaRepository;
import christianschool.edu.ec.sistemaNotas_user.model.Persona;
import christianschool.edu.ec.sistemaNotas_user.util.segMessage;
import christianschool.edu.ec.sistemaNotas_user.util.segMessage;
import christianschool.edu.ec.sistemaNotas_user.vo.libretaVo;
import christianschool.edu.ec.sistemaNotas_user.vo.libretanotaVo;



import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
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
  private  libretanotaVo libretaRep;
          
          
   @RequestMapping(value = "/id/{data}", method = RequestMethod.GET)
    public ResponseEntity libretaById(@PathVariable String data) throws SQLException {

        String wa = "where p.cedula = '"+ data +"'";
        List<libretaVo> libreta = libretaRep.getLibreta(wa);
        return new ResponseEntity(libreta, HttpStatus.OK);
        
    }
  

    
}
