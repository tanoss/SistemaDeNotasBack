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

@Entity
@Table(name = "CUALITATIVAS")
public class Cualitativas implements Serializable {
    private static final long serialVersionUID = 1L;

    @SequenceGenerator(name = "SEQ_CUALITATIVAS", sequenceName = "SEQ_CUALITATIVAS", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CUALITATIVAS")
    @Basic(optional = false)
    @Column(name = "ID_CUALITATIVAS")
    private Long idCualitativas;

    
    @Column(name = "CUALITATIVA")
    private String cualitativa;
    
    @Column(name = "DESCRIPCION")
    private String descripcion;
    
    @Column(name = "PONDERACION")
    private Long ponderacion;

    public Long getIdCualitativas() {
        return idCualitativas;
    }

    public void setIdCualitativas(Long idCualitativas) {
        this.idCualitativas = idCualitativas;
    }

    public String getCualitativa() {
        return cualitativa;
    }

    public void setCualitativa(String cualitativa) {
        this.cualitativa = cualitativa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getPonderacion() {
        return ponderacion;
    }

    public void setPonderacion(Long ponderacion) {
        this.ponderacion = ponderacion;
    }
    
}
