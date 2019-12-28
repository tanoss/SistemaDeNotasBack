
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
@Table(name = "RUBRICA")
public class Rubrica implements Serializable{
    private static final long serialVersionUID = 1L;

    @SequenceGenerator(name = "SEQ_RUBRICA", sequenceName = "SEQ_RUBRICA", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_RUBRICA")
    @Basic(optional = false)
    @Column(name = "ID_RUBRICA")
    private Long idRubrica;

    @Column(name = "NOMBRE_RUBRICA")
    private String nombreRubrica;
    
    @Column(name = "PORCENTAJE")
    private Long porcentaje;
    
    public Long getIdRubrica() {
        return idRubrica;
    }

    public void setIdRubrica(Long idRubrica) {
        this.idRubrica = idRubrica;
    }

    public String getNombreRubrica() {
        return nombreRubrica;
    }

    public void setNombreRubrica(String nombreRubrica) {
        this.nombreRubrica = nombreRubrica;
    }

    public Long getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Long porcentaje) {
        this.porcentaje = porcentaje;
    }
    
}
