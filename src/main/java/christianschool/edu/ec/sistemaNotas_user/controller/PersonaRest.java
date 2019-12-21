/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christianschool.edu.ec.sistemaNotas_user.controller;

import christianschool.edu.ec.sistemaNotas_user.dao.PersonaRepository;
import christianschool.edu.ec.sistemaNotas_user.dao.PersonaRepositoryRel;
import christianschool.edu.ec.sistemaNotas_user.model.Persona;
import christianschool.edu.ec.sistemaNotas_user.model.segToken;
import christianschool.edu.ec.sistemaNotas_user.util.cryptPassword;
import christianschool.edu.ec.sistemaNotas_user.util.passToken;
import christianschool.edu.ec.sistemaNotas_user.util.segMessage;
import java.sql.SQLException;
import javax.validation.Valid;
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
public class PersonaRest {

    private final cryptPassword api = new cryptPassword();
    private final segMessage msg = new segMessage();
    private final passToken jwt = new passToken();
    private final segToken token = new segToken();

    @Autowired
    private PersonaRepository personaRep;

    @Autowired
    private PersonaRepositoryRel personaRepRel;
    
    

   

    //Metodo de creacion de un nuevo usuario Estudiante o profesor con clave encriptada 
    @RequestMapping(value = "/addprofe", method = RequestMethod.POST)
    public ResponseEntity<Persona> registerusu(@RequestBody Persona persona) throws SQLException {
        Persona userexist = new Persona();
        // userexist = usuarioRep.findUserByusuCc(usuario.getUsuCc());
        userexist = personaRep.findUserByCedula(persona.getCedula());
        if (userexist != null) {
            return new ResponseEntity(msg.ifexist(), HttpStatus.CREATED);
        } else {
            Persona user = new Persona();

            user.setIdTipoUsuario(persona.getIdTipoUsuario());
            user.setCedula(persona.getCedula());
            user.setNombre(persona.getNombre());
            user.setApellido(persona.getApellido());
            user.setCorreo(persona.getCorreo());
            user.setClave(api.md5(persona.getCedula()));
            user = personaRep.save(user);
            return new ResponseEntity(user, HttpStatus.CREATED);
        }
    }

//     //Funcion para crear un profesor
//    @RequestMapping(value = "/sisp", method = RequestMethod.POST)
//    public ResponseEntity<Persona> crearPersona(@Valid @RequestBody Persona persona) {
//        personaRep.save(persona);
//        return new ResponseEntity(msg.add(), HttpStatus.CREATED);
//    }
//    
//     //Funcion para crear un estudiante
//    @RequestMapping(value = "/sisp", method = RequestMethod.POST)
//    public ResponseEntity<Persona> crearPersona(@Valid @RequestBody Persona persona) {
//        personaRep.save(persona);
//        return new ResponseEntity(msg.add(), HttpStatus.CREATED);
//    }
//    
//     //Funcion para crear un paralelo                                                  
//    @RequestMapping(value = "/sisp", method = RequestMethod.POST)
//    public ResponseEntity<Persona> crearPersona(@Valid @RequestBody Persona persona) {
//        personaRep.save(persona);
//        return new ResponseEntity(msg.add(), HttpStatus.CREATED);
//    }
}
