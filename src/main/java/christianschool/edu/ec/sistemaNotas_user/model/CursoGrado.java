
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
@Table(name = "CURSO_GRADO")
public class CursoGrado implements Serializable {
    private static final long serialVersionUID = 1L;

    @SequenceGenerator(name = "SEQ_CURSO_GRADO", sequenceName = "SEQ_CURSO_GRADO", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CURSO_GRADO")
    @Basic(optional = false)
    
    @Column(name = "ID_CURSO_GRADO")
    private Long idCursoGrado;

    
    @Column(name = "CURSO")
    private Long curso;

    public Long getIdCursoGrado() {
        return idCursoGrado;
    }

    public void setIdCursoGrado(Long idCursoGrado) {
        this.idCursoGrado = idCursoGrado;
    }

    public Long getCurso() {
        return curso;
    }

    public void setCurso(Long curso) {
        this.curso = curso;
    }

}
