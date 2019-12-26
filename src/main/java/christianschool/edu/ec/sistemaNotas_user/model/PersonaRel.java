/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author willy
 */
@Entity
@Table(name = "PERSONA")
public class PersonaRel implements Serializable {

    private static final long serialVersionUID = 1L;

    @SequenceGenerator(name = "SEQ_PERSONA", sequenceName = "SEQ_PERSONA", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PERSONA")
    @Basic(optional = false)
    @Column(name = "ID_PERSONA")
    private Long idPersona;

    @JoinColumn(name = "ID_TIPO_USUARIO", referencedColumnName = "ID_TIPO_USUARIO")
    @ManyToOne(optional = false)
    private TipoUsuario tipoUsuario;

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
    @Column(name = "DIRECCION")
    private String direccion;

    @Basic(optional = false)
    @Size(min = 1, max = 60)
    @Column(name = "TELEFONO_CONVENCIONAL")
    private String telefonoConvencional;

    @Basic(optional = false)
    @Size(min = 1, max = 60)
    @Column(name = "TELEFONO_CELULAR")
    private String telefonoCelular;

    @Basic(optional = false)
    @Size(min = 1, max = 60)
    @Column(name = "REFERENCIA_PERS_NOMBRE")
    private String referenciaPersNombre;
             
    @Basic(optional = false)
    @Size(min = 1, max = 60)
    @Column(name = "REFERENCIA_PERS_TELF")
    private String referenciaPersTelf;

    @Basic(optional = false)
    @Size(min = 1, max = 60)
    @NotNull
    @Column(name = "CLAVE")
    private String clave;

    public PersonaRel() {
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonoConvencional() {
        return telefonoConvencional;
    }

    public void setTelefonoConvencional(String telefonoConvencional) {
        this.telefonoConvencional = telefonoConvencional;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public String getReferenciaPersNombre() {
        return referenciaPersNombre;
    }

    public void setReferenciaPersNombre(String referenciaPersNombre) {
        this.referenciaPersNombre = referenciaPersNombre;
    }

    public String getReferenciaPersTelf() {
        return referenciaPersTelf;
    }

    public void setReferenciaPersTelf(String referenciaPersTelf) {
        this.referenciaPersTelf = referenciaPersTelf;
    }
    
    

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

}
