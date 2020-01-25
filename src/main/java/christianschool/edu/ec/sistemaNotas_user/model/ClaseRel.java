
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "CLASE")
public class ClaseRel implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @SequenceGenerator(name = "SEQ_CLASE", sequenceName = "SEQ_CLASE", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CLASE")
    @Basic(optional = false)
    @Column(name = "ID_CLASE")
    private Long idClase;

    @JoinColumn(name = "ID_ESTUDIANTE", referencedColumnName = "ID_ESTUDIANTE")
    @ManyToOne(optional = false)
    private Estudiante estudiante;
    
    @JoinColumn(name = "ID_MATERIA_DOCENTE_GRADO", referencedColumnName = "ID_MATERIA_DOCENTE_GRADO")
    @ManyToOne(optional = false)
    private MateriaDocenteGrado materiaDocenteGrado;

    public Long getIdClase() {
        return idClase;
    }

    public void setIdClase(Long idClase) {
        this.idClase = idClase;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

   

    public MateriaDocenteGrado getMateriaDocenteGrado() {
        return materiaDocenteGrado;
    }

    public void setMateriaDocenteGrado(MateriaDocenteGrado materiaDocenteGrado) {
        this.materiaDocenteGrado = materiaDocenteGrado;
    }

    
}
