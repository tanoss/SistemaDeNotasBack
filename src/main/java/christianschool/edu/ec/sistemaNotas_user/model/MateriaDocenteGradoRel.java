
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
@Table(name = "MMATERIA_DOCENTE_GRADO")
public class MateriaDocenteGradoRel implements Serializable{
    private static final long serialVersionUID = 1L;

    @SequenceGenerator(name = "SEQ_MATERIA_DOCENTE_GRADO", sequenceName = "SEQ_MATERIA_DOCENTE_GRADO", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_MATERIA_DOCENTE_GRADO")
    @Basic(optional = false)
    @Column(name = "ID_MATERIA_DOCENTE_GRADO")
    private Long idMateriaDocenteGrado;

    @JoinColumn(name = "ID_MATERIA", referencedColumnName = "ID_MATERIA")
    @ManyToOne(optional = false)
    private Materia materia;

    @JoinColumn(name = "ID_DOCENTE", referencedColumnName = "ID_DOCENTE")
    @ManyToOne(optional = false)
    private Docente docente;
    
    @JoinColumn(name = "ID_GRADO", referencedColumnName = "ID_GRADO")
    @ManyToOne(optional = false)
    private Grado grado;

    public Long getIdMateriaDocenteGrado() {
        return idMateriaDocenteGrado;
    }

    public void setIdMateriaDocenteGrado(Long idMateriaDocenteGrado) {
        this.idMateriaDocenteGrado = idMateriaDocenteGrado;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Grado getGrado() {
        return grado;
    }

    public void setGrado(Grado grado) {
        this.grado = grado;
    }

   
}
