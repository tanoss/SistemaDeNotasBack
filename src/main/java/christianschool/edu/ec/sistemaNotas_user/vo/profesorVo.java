/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christianschool.edu.ec.sistemaNotas_user.vo;

import java.io.Serializable;

/**
 *
 * @author willy
 */
public class profesorVo implements Serializable {

    private static final long serialVersionUID = 1L;
    private String nombre;
    private String apellido;
    private int idDocente;

    public profesorVo() {
    }

    public profesorVo(String nombre, String apellido, int idDocente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idDocente = idDocente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }
    
    
    

}
