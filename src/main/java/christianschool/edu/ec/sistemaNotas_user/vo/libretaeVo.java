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

//trae todos los estudiantes  que estudien con ese profesor en ese curso
public class libretaeVo implements Serializable {
      private static final long serialVersionUID = 1L;
      private String nombre;
      private String apellido;
      private float notaQuimestreUno;
      private float notaQuimestreDos;
      private float promedioFinal;
      private int idLibreta;
      private int idPeriodoLectivo;
      private int idClase;

    public libretaeVo() {
    }

    public libretaeVo(String nombre, String apellido, float notaQuimestreUno, float notaQuimestreDos, float promedioFinal, int idPeriodoLectivo, int idClase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.notaQuimestreUno = notaQuimestreUno;
        this.notaQuimestreDos = notaQuimestreDos;
        this.promedioFinal = promedioFinal;
        this.idPeriodoLectivo = idPeriodoLectivo;
        this.idClase = idClase;
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

    public float getNotaQuimestreUno() {
        return notaQuimestreUno;
    }

    public void setNotaQuimestreUno(float notaQuimestreUno) {
        this.notaQuimestreUno = notaQuimestreUno;
    }

    public float getNotaQuimestreDos() {
        return notaQuimestreDos;
    }

    public void setNotaQuimestreDos(float notaQuimestreDos) {
        this.notaQuimestreDos = notaQuimestreDos;
    }

    public float getPromedioFinal() {
        return promedioFinal;
    }

    public void setPromedioFinal(float promedioFinal) {
        this.promedioFinal = promedioFinal;
    }

    public int getIdLibreta() {
        return idLibreta;
    }

    public void setIdLibreta(int idLibreta) {
        this.idLibreta = idLibreta;
    }

    public int getIdPeriodoLectivo() {
        return idPeriodoLectivo;
    }

    public void setIdPeriodoLectivo(int idPeriodoLectivo) {
        this.idPeriodoLectivo = idPeriodoLectivo;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }
    
    

    
    
         
      
      
    
}
