
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
@Table(name = "MATERIA_NOTAS")
public class MateriaNotasRel implements Serializable {
    private static final long serialVersionUID = 1L;

    @SequenceGenerator(name = "SEQ_MATERIA_NOTAS", sequenceName = "SEQ_MATERIA_NOTAS", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_MATERIA_NOTAS")
    @Basic(optional = false)
    @Column(name = "ID_MATERIA_NOTAS")
    private Long idMateriaNotas;

    @JoinColumn(name = "ID_MATERIA", referencedColumnName = "ID_MATERIA")
    @ManyToOne(optional = false)
    private Materia materia;
    
    @JoinColumn(name = "ID_NOTAS", referencedColumnName = "ID_NOTAS")
    @ManyToOne(optional = false)
    private Notas notas;
    
    @Column(name = "PROMEDIO")
    private Long promedio;

    public Long getIdMateriaNotas() {
        return idMateriaNotas;
    }

    public void setIdMateriaNotas(Long idMateriaNotas) {
        this.idMateriaNotas = idMateriaNotas;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Notas getNotas() {
        return notas;
    }

    public void setNotas(Notas notas) {
        this.notas = notas;
    }

    public Long getPromedio() {
        return promedio;
    }

    public void setPromedio(Long promedio) {
        this.promedio = promedio;
    }

}
