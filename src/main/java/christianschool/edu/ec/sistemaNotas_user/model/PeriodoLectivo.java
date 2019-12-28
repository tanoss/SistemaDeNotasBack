
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
@Table(name = "PERIODO_LECTIVO")
public class PeriodoLectivo implements Serializable{
    private static final long serialVersionUID = 1L;

    @SequenceGenerator(name = "SEQ_PERIODO_LECTIVO", sequenceName = "SEQ_PERIODO_LECTIVO", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PERIODO_LECTIVO")
    @Basic(optional = false)
    @Column(name = "ID_PERIODO")
    private Long idPeriodo;
    
    @Column(name = "PERIODO")
    private Long periodo;

    public Long getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(Long idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public Long getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Long periodo) {
        this.periodo = periodo;
    }
}
