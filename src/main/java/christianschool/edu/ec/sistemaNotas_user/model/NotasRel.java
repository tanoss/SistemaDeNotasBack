
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
@Table(name = "NOTAS")
public class NotasRel implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @SequenceGenerator(name = "SEQ_NOTAS", sequenceName = "SEQ_NOTAS", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_NOTAS")
    @Basic(optional = false)
    @Column(name = "ID_NOTAS")
    private Long idNotas;

    @JoinColumn(name = "ID_RUBRICA", referencedColumnName = "ID_RUBRICA")
    @ManyToOne(optional = false)
    private Rubrica rubrica;

    @Basic(optional = false)
    @Size(min = 1, max = 60)
    @NotNull
    @Column(name = "NOTA")
    private Long nota;

    public Long getIdNotas() {
        return idNotas;
    }

    public void setIdNotas(Long idNotas) {
        this.idNotas = idNotas;
    }

    public Rubrica getRubrica() {
        return rubrica;
    }

    public void setRubrica(Rubrica rubrica) {
        this.rubrica = rubrica;
    }

    public Long getNota() {
        return nota;
    }

    public void setNota(Long nota) {
        this.nota = nota;
    }
}
