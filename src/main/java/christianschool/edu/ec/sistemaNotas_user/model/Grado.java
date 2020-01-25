
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
@Table(name = "GRADO")
public class Grado implements Serializable{
    private static final long serialVersionUID = 1L;

    @SequenceGenerator(name = "SEQ_GRADO", sequenceName = "SEQ_GRADO", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GRADO")

    @Basic(optional = false)
    @Column(name = "ID_GRADO")
    private Long idGrado;

    @Basic(optional = false)
    @NotNull
    @Column(name = "GRADO")
    private Long grado;
    
    @Basic(optional = false)
    @Column(name = "NOMBRE_GRADO")
    private String nombreGrado;

    public Long getIdGrado() {
        return idGrado;
    }

    public void setIdGrado(Long idGrado) {
        this.idGrado = idGrado;
    }

    public Long getGrado() {
        return grado;
    }

    public void setGrado(Long grado) {
        this.grado = grado;
    }

    public String getNombreGrado() {
        return nombreGrado;
    }

    public void setNombreGrado(String nombreGrado) {
        this.nombreGrado = nombreGrado;
    }

    
}
