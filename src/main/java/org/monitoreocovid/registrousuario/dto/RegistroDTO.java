package org.monitoreocovid.registrousuario.dto;

public class RegistroDTO {

    private Integer idEvento;
    private String nombres;
    private String apellidos;
    private String correo;
    private String numeroCelular;
    private String numeroIdentificacion;
    private Integer idAsistenteEvento;

    public Integer getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Integer idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public Integer getIdAsistenteEvento() {
        return idAsistenteEvento;
    }

    public void setIdAsistenteEvento(Integer idAsistenteEvento) {
        this.idAsistenteEvento = idAsistenteEvento;
    }
}
