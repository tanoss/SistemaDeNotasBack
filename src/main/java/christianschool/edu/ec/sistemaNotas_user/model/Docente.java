
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
@Table(name = "DOCENTE")
public class Docente implements Serializable{
     private static final long serialVersionUID = 1L;

    @SequenceGenerator(name = "SEQ_DOCENTE", sequenceName = "SEQ_DOCENTE", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_DOCENTE")

    @Basic(optional = false)
    @Column(name = "ID_DOCENTE")
    private Long idDocente;
    
    @Basic(optional = false)
    @Size(min = 1, max = 60)
    @NotNull
    @Column(name = "ESPECIALIDAD")
    private String especialidad;
    
    @Column(name = "ID_PERSONA")
    private Long idPersona;

    public Long getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Long idDocente) {
        this.idDocente = idDocente;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }
    
}
