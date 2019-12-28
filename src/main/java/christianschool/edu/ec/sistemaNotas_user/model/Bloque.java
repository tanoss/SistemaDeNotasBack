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
@Table(name = "BLOQUE")
public class Bloque implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @SequenceGenerator (name = "SEQ_BLOQUE",sequenceName = "SEQ_BLOQUE", allocationSize=1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator= "SEQ_BLOQUE")
    @Basic(optional = false)
    
    @Column(name = "ID_BLOQUE") 
    private Long idBloque;
    
     @Column(name = "QUIMESTRE") 
    private String quimestre;

    public Long getIdBloque() {
        return idBloque;
    }

    public void setIdBloque(Long idBloque) {
        this.idBloque = idBloque;
    }

    public String getQuimestre() {
        return quimestre;
    }

    public void setQuimestre(String quimestre) {
        this.quimestre = quimestre;
    }
    


}
