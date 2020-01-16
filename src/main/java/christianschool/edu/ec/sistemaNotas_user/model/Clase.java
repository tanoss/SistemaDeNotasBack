
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
@Table(name = "CLASE")

public class Clase implements Serializable{
   
    private static final long serialVersionUID = 1L;

    @SequenceGenerator(name = "SEQ_CLASE", sequenceName = "SEQ_CLASE", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CLASE")

    @Basic(optional = false)
    @Column(name = "ID_CLASE")
    private Long idClase;

    @Column(name = "ID_MATRICULA")
    private Long idMatricula;

    @Column(name = "ID_MATERIA_DOCENTE_GRADO")
    private Long idMateriaDocenteGrado;

    public Long getIdClase() {
        return idClase;
    }

    public void setIdClase(Long idClase) {
        this.idClase = idClase;
    }

    public Long getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(Long idMatricula) {
        this.idMatricula = idMatricula;
    }

    public Long getIdMateriaDocenteGrado() {
        return idMateriaDocenteGrado;
    }

    public void setIdMateriaDocenteGrado(Long idMateriaDocenteGrado) {
        this.idMateriaDocenteGrado = idMateriaDocenteGrado;
    }

    
}
