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
public class libretamVo implements Serializable  {
    
     private static final long serialVersionUID = 1L;
     private int idMateriaDocenteGrado;
      private int idMateria;
      private  String materia;
      private int idDocente;
      private int idGradoParalelo;

    public libretamVo() {
    }

    public libretamVo(int idMateriaDocenteGrado, int idMateria, String materia, int idDocente, int idGradoParalelo) {
        this.idMateriaDocenteGrado = idMateriaDocenteGrado;
        this.idMateria = idMateria;
        this.materia = materia;
        this.idDocente = idDocente;
        this.idGradoParalelo = idGradoParalelo;
    }

    public int getIdMateriaDocenteGrado() {
        return idMateriaDocenteGrado;
    }

    public void setIdMateriaDocenteGrado(int idMateriaDocenteGrado) {
        this.idMateriaDocenteGrado = idMateriaDocenteGrado;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public int getIdGradoParalelo() {
        return idGradoParalelo;
    }

    public void setIdGradoParalelo(int idGradoParalelo) {
        this.idGradoParalelo = idGradoParalelo;
    }

    

  
      
    
}
