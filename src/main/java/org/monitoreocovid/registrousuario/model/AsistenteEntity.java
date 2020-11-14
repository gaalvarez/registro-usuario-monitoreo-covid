package org.monitoreocovid.registrousuario.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "asistente", schema = "monitoreo_covid", catalog = "")
public class AsistenteEntity {
    private int idAsistente;
    private String nombres;
    private String apellidos;
    private String correo;
    private String numeroCelular;
    private String numeroIdentificacion;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asistente", nullable = false)
    public Integer getIdAsistente() {
        return idAsistente;
    }

    public void setIdAsistente(Integer idAsistente) {
        this.idAsistente = idAsistente;
    }

    @Basic
    @Column(name = "nombres", nullable = false, length = 200)
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Basic
    @Column(name = "apellidos", nullable = false, length = 200)
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Basic
    @Column(name = "correo", nullable = false, length = 50)
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Basic
    @Column(name = "numero_celular", nullable = true, length = 12)
    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    @Basic
    @Column(name = "numero_identificacion", nullable = false, length = 30)
    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AsistenteEntity that = (AsistenteEntity) o;
        return idAsistente == that.idAsistente &&
                Objects.equals(nombres, that.nombres) &&
                Objects.equals(apellidos, that.apellidos) &&
                Objects.equals(correo, that.correo) &&
                Objects.equals(numeroCelular, that.numeroCelular) &&
                Objects.equals(numeroIdentificacion, that.numeroIdentificacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAsistente, nombres, apellidos, correo, numeroCelular, numeroIdentificacion);
    }
}
