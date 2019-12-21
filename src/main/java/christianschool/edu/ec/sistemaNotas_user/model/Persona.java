/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christianschool.edu.ec.sistemaNotas_user.model;

/**
 *
 * @author willy
 */
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
@Table(name = "PERSONA")
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    @SequenceGenerator(name = "SEQ_PERSONA", sequenceName = "SEQ_PERSONA", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PERSONA")
    @Basic(optional = false)
    @Column(name = "ID_PERSONA")
    private Long idPersona;

    
    @Column(name = "ID_TIPO_USUARIO")
    private Long idTipoUsuario;

    @Basic(optional = false)
    @Size(min = 1, max = 60)
    @NotNull
    @Column(name = "CEDULA")
    private String cedula;

    @Basic(optional = false)
    @Size(min = 1, max = 60)
    @NotNull
    @Column(name = "NOMBRE")
    private String nombre;

    @Basic(optional = false)
    @Size(min = 1, max = 60)
    @NotNull
    @Column(name = "APELLIDO")
    private String apellido;

    @Basic(optional = false)
    @Size(min = 1, max = 60)
    @NotNull
    @Column(name = "CORREO")
    private String correo;

    @Basic(optional = false)
    @Size(min = 1, max = 60)
    @NotNull
    @Column(name = "CLAVE")
    private String clave;

    public Persona() {
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public Long getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(Long idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }
    
    

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

}
