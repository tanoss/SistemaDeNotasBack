
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
@Table(name = "MATERIA_DOCENTE")
public class MateriaDocenteRel implements Serializable {
    private static final long serialVersionUID = 1L;

    @SequenceGenerator(name = "SEQ_MATERIA_DOCENTE", sequenceName = "SEQ_MATERIA_DOCENTE", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_MATERIA_DOCENTE")
    @Basic(optional = false)
    @Column(name = "ID_MATERIA_DOCENTE")
    private Long idMateriaDocente;

    @JoinColumn(name = "ID_PERSONA", referencedColumnName = "ID_PERSONA")
    @ManyToOne(optional = false)
    private Persona persona;

    @JoinColumn(name = "ID_MATERIA", referencedColumnName = "ID_MATERIA")
    @ManyToOne(optional = false)
    private Materia materia;

    public Long getIdMateriaDocente() {
        return idMateriaDocente;
    }

    public void setIdMateriaDocente(Long idMateriaDocente) {
        this.idMateriaDocente = idMateriaDocente;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    
}
