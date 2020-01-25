/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christianschool.edu.ec.sistemaNotas_user.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author willy
 */
@Entity
@Table(name = "GRADO_PARALELO")
public class GradoParalelo implements Serializable {

    private static final long serialVersionUID = 1L;

    @SequenceGenerator(name = "SEQ_GRADO", sequenceName = "SEQ_GRADO_PARALELO", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GRADO_PARALELO")

    @Basic(optional = false)
    @Column(name = "ID_GRADO_PARALELO")
    private Long idGradoParalelo;

    @Basic(optional = false)
    @Column(name = "ID_GRADO")
    private Long idGrado;

    @Basic(optional = false)
    @Column(name = "ID_PARALELO")
    private Long idParalelo;

    public Long getIdGradoParalelo() {
        return idGradoParalelo;
    }

    public void setIdGradoParalelo(Long idGradoParalelo) {
        this.idGradoParalelo = idGradoParalelo;
    }

    public Long getIdGrado() {
        return idGrado;
    }

    public void setIdGrado(Long idGrado) {
        this.idGrado = idGrado;
    }

    public Long getIdParalelo() {
        return idParalelo;
    }

    public void setIdParalelo(Long idParalelo) {
        this.idParalelo = idParalelo;
    }

    
}
