/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christianschool.edu.ec.sistemaNotas_user.controller;

import christianschool.edu.ec.sistemaNotas_user.dao.PersonaRepository;
import christianschool.edu.ec.sistemaNotas_user.dao.PersonaRepositoryRel;
import christianschool.edu.ec.sistemaNotas_user.model.Persona;
import christianschool.edu.ec.sistemaNotas_user.model.PersonaRel;
import christianschool.edu.ec.sistemaNotas_user.model.SegUsuario;
import christianschool.edu.ec.sistemaNotas_user.model.segToken;
import christianschool.edu.ec.sistemaNotas_user.util.cryptPassword;
import christianschool.edu.ec.sistemaNotas_user.util.passToken;
import christianschool.edu.ec.sistemaNotas_user.util.segMessage;
import java.sql.SQLException;
import java.util.Calendar;
import javax.servlet.ServletException;

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
public class Autorizacion {

  

    @Autowired
    private PersonaRepository personaRep;

    @Autowired
    private PersonaRepositoryRel personaRepRel;

    private final cryptPassword api = new cryptPassword();
    private final segMessage msg = new segMessage();
    private final passToken jwt = new passToken();
    private final segToken token = new segToken();

//    Metodo para la verificacion de la encriptacion md5
    @RequestMapping(value = "/pass/{id}", method = RequestMethod.GET)
    public String passMD5(@PathVariable String id) throws SQLException {
        String passs = api.md5(id);
        return " " + passs + " ";
    }


//    //Metodo de validacion de credenciales 
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity login(@RequestBody PersonaRel persona) throws ServletException {
        PersonaRel user = new PersonaRel();
        user = personaRepRel.findUserByCedula(persona.getCedula());

        if (user != null && user.getClave().equals(api.md5(persona.getClave()))) {
            token.setSegToken(jwt.passSegToken(persona.getCedula()));
            return new ResponseEntity(token, HttpStatus.OK);
        } else {
            return new ResponseEntity(msg.errorl(), HttpStatus.OK);
        }
    }


    //    Metodo para la actualizacion de la clave de seguridad
    @RequestMapping(value = "/updusu", method = RequestMethod.PUT)
    public ResponseEntity<Persona> changepass(@RequestBody Persona persona) throws SQLException {
        Persona user = new Persona();
        user = personaRep.findUserByCedula(persona.getCedula());  
        user.setClave(api.md5(persona.getClave())); 
        personaRep.save(user);
        return new ResponseEntity(msg.update(), HttpStatus.OK);
    }

//    //Metodo de validacion de credencial antigua
    @RequestMapping(value = "/passOld", method = RequestMethod.POST)
    public ResponseEntity passOld(@RequestBody Persona persona) throws ServletException {
        Persona user = new Persona();
        user = personaRep.findUserByCedula(persona.getCedula());
        if (user != null && user.getClave().equals(api.md5(persona.getClave()))) {
            return new ResponseEntity(true, HttpStatus.OK);
        } else {
            return new ResponseEntity(false, HttpStatus.OK);
        }
    }
}
