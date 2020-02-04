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
public class libretapVo implements Serializable {
      private static final long serialVersionUID = 1L;
      private int idGradoParalelo;
      private String nombreGrado;
      private String paralelo;

    public libretapVo() {
           
    }

    public libretapVo(int idGradoParalelo, String nombreGrado, String paralelo) {
        this.idGradoParalelo = idGradoParalelo;
        this.nombreGrado = nombreGrado;
        this.paralelo = paralelo;
    }

    public int getIdGradoParalelo() {
        return idGradoParalelo;
    }

    public void setIdGradoParalelo(int idGradoParalelo) {
        this.idGradoParalelo = idGradoParalelo;
    }

    public String getNombreGrado() {
        return nombreGrado;
    }

    public void setNombreGrado(String nombreGrado) {
        this.nombreGrado = nombreGrado;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

  
      
    
}
