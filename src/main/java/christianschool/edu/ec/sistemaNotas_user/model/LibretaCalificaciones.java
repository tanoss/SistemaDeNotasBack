
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
@Table(name = "LISTA_CALIFICACIONES")
public class LibretaCalificaciones implements Serializable {
    private static final long serialVersionUID = 1L;

    @SequenceGenerator(name = "SEQ_LISTA_CALIFICACIONES", sequenceName = "SEQ_LISTA_CALIFICACIONES", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_LISTA_CALIFICACIONES")
    @Basic(optional = false)
    @Column(name = "ID_LIBRETA")
    private Long idLibreta;
    
    @Column(name = "PROMEDIO_FINAL")
    private Long promedioFinal;

    public Long getIdLibreta() {
        return idLibreta;
    }

    public void setIdLibreta(Long idLibreta) {
        this.idLibreta = idLibreta;
    }

    public Long getPromedioFinal() {
        return promedioFinal;
    }

    public void setPromedioFinal(Long promedioFinal) {
        this.promedioFinal = promedioFinal;
    }
    
}
