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
public class libretaVo implements Serializable {

    private static final long serialVersionUID = 1L;
    private String materia;
    private Integer idLibreta;
    private Integer idClase;
    private Integer idPeriodoLectivo;
    private float notaQuimestreUno;
    private float notaQuimestreDos;
    private float promedioFinal;

    public libretaVo() {
    }

    public libretaVo(String materia, Integer idLibreta, Integer idClase, Integer idPeriodoLectivo, float notaQuimestreUno, float notaQuimestreDos, float promedioFinal) {
        this.materia = materia;
        this.idLibreta = idLibreta;
        this.idClase = idClase;
        this.idPeriodoLectivo = idPeriodoLectivo;
        this.notaQuimestreUno = notaQuimestreUno;
        this.notaQuimestreDos = notaQuimestreDos;
        this.promedioFinal = promedioFinal;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Integer getIdLibreta() {
        return idLibreta;
    }

    public void setIdLibreta(Integer idLibreta) {
        this.idLibreta = idLibreta;
    }

    public Integer getIdClase() {
        return idClase;
    }

    public void setIdClase(Integer idClase) {
        this.idClase = idClase;
    }

    public Integer getIdPeriodoLectivo() {
        return idPeriodoLectivo;
    }

    public void setIdPeriodoLectivo(Integer idPeriodoLectivo) {
        this.idPeriodoLectivo = idPeriodoLectivo;
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

}
