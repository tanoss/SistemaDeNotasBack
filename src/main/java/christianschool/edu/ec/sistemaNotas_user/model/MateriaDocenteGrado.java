
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
@Table(name = "MATERIA_DOCENTE_GRADO")

public class MateriaDocenteGrado implements Serializable {
    private static final long serialVersionUID = 1L;

    @SequenceGenerator(name = "SEQ_MATERIA_DOCENTE_GRADO", sequenceName = "SEQ_MATERIA_DOCENTE_GRADO", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_MATERIA_DOCENTE_GRADO")

    @Basic(optional = false)
    @Column(name = "ID_MATERIA_DOCENTE_GRADO")
    private Long idMateriaDocenteGrado;

    @Column(name = "ID_MATERIA")
    private Long idMateria;
    
    @Column(name = "ID_DOCENTE")
    private Long idDocente;
    
    @Column(name = "ID_GRADO_PARALELO")
    private Long idGrado;

    public Long getIdMateriaDocenteGrado() {
        return idMateriaDocenteGrado;
    }

    public void setIdMateriaDocenteGrado(Long idMateriaDocenteGrado) {
        this.idMateriaDocenteGrado = idMateriaDocenteGrado;
    }

    public Long getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Long idMateria) {
        this.idMateria = idMateria;
    }

    public Long getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Long idDocente) {
        this.idDocente = idDocente;
    }

    public Long getIdGrado() {
        return idGrado;
    }

    public void setIdGrado(Long idGrado) {
        this.idGrado = idGrado;
    }

    
}
