
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
@Table(name = "LIBRETA")
public class Libreta implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @SequenceGenerator(name = "SEQ_LIBRETA", sequenceName = "SEQ_LIBRETA", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_LIBRETA")

    @Basic(optional = false)
    @Column(name = "ID_LIBRETA")
    private Long idLibreta;

    @Column(name = "ID_CLASE")
    private Long idClase;
    
    @Column(name = "ID_PERIODO_LECTIVO")
    private Long idPeriodoLectivo;
    
    @NotNull
    @Column(name = "NOTA_QUIMESTRE_1")
    private Float notaQuimestre1;
    
    @NotNull
    @Column(name = "NOTA_QUIMESTRE_2")
    private Float notaQuimestre2;
    
    @NotNull
    @Column(name = "PROMEDIO_FINAL")
    private Float promedioFinal;

    public Long getIdLibreta() {
        return idLibreta;
    }

    public void setIdLibreta(Long idLibreta) {
        this.idLibreta = idLibreta;
    }

    public Long getIdClase() {
        return idClase;
    }

    public void setIdClase(Long idClase) {
        this.idClase = idClase;
    }

    public Long getIdPeriodoLectivo() {
        return idPeriodoLectivo;
    }

    public void setIdPeriodoLectivo(Long idPeriodoLectivo) {
        this.idPeriodoLectivo = idPeriodoLectivo;
    }

    public Float getNotaQuimestre1() {
        return notaQuimestre1;
    }

    public void setNotaQuimestre1(Float notaQuimestre1) {
        this.notaQuimestre1 = notaQuimestre1;
    }

    public Float getNotaQuimestre2() {
        return notaQuimestre2;
    }

    public void setNotaQuimestre2(Float notaQuimestre2) {
        this.notaQuimestre2 = notaQuimestre2;
    }

    public Float getPromedioFinal() {
        return promedioFinal;
    }

    public void setPromedioFinal(Float promedioFinal) {
        this.promedioFinal = promedioFinal;
    }
    
    
}

