
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
@Table(name = "LIBRETA_CALIFICACIONES")
public class LibretaCalificacionesRel implements Serializable {
    private static final long serialVersionUID = 1L;

    @SequenceGenerator(name = "SEQ_LIBRETA_CALIFICACIONES", sequenceName = "SEQ_LIBRETA_CALIFICACIONES", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_LIBRETA_CALIFICACIONES")
    @Basic(optional = false)
    
    @Column(name = "ID_LIBRETA")
    private Long idLibreta;
    
    
    @JoinColumn(name = "ID_PERSONA", referencedColumnName = "ID_PERSONA")
    @ManyToOne(optional = false)
    private Persona persona;
    
    @JoinColumn(name = "ID_CURSO_GRADO", referencedColumnName = "ID_CURSO_GRADO")
    @ManyToOne(optional = false)
    private CursoGrado cursoGrado;

    @JoinColumn(name = "ID_PARALELO", referencedColumnName = "ID_PARALELO")
    @ManyToOne(optional = false)
    private Paralelo paralelo;
    
    @JoinColumn(name = "ID_BLOQUE", referencedColumnName = "ID_BLOQUE")
    @ManyToOne(optional = false)
    private Bloque bloque;
    
    @JoinColumn(name = "ID_MATERIA_NOTAS", referencedColumnName = "ID_MATERIA_NOTAS")
    @ManyToOne(optional = false)
    private MateriaNotas materiaNotas;
    
    @JoinColumn(name = "ID_PERIODO", referencedColumnName = "ID_PERIODO")
    @ManyToOne(optional = false)
    private PeriodoLectivo periodoLectivo;
    
    @JoinColumn(name = "ID_CUALITATIVAS", referencedColumnName = "ID_CUALITATIVAS")
    @ManyToOne(optional = false)
    private Cualitativas cualitativas;
    
    
    @Column(name = "PROMEDIO_FINAL")
    private Long promedioFinal;

    public Long getIdLibreta() {
        return idLibreta;
    }

    public void setIdLibreta(Long idLibreta) {
        this.idLibreta = idLibreta;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public CursoGrado getCursoGrado() {
        return cursoGrado;
    }

    public void setCursoGrado(CursoGrado cursoGrado) {
        this.cursoGrado = cursoGrado;
    }

    public Paralelo getParalelo() {
        return paralelo;
    }

    public void setParalelo(Paralelo paralelo) {
        this.paralelo = paralelo;
    }

    public Bloque getBloque() {
        return bloque;
    }

    public void setBloque(Bloque bloque) {
        this.bloque = bloque;
    }

    public MateriaNotas getMateriaNotas() {
        return materiaNotas;
    }

    public void setMateriaNotas(MateriaNotas materiaNotas) {
        this.materiaNotas = materiaNotas;
    }

    public PeriodoLectivo getPeriodo() {
        return periodoLectivo;
    }

    public void setPeriodo(PeriodoLectivo periodoLectivo) {
        this.periodoLectivo = periodoLectivo;
    }

    public Cualitativas getCualitativas() {
        return cualitativas;
    }

    public void setCualitativas(Cualitativas cualitativas) {
        this.cualitativas = cualitativas;
    }

    public Long getPromedioFinal() {
        return promedioFinal;
    }

    public void setPromedioFinal(Long promedioFinal) {
        this.promedioFinal = promedioFinal;
    }
    
}
