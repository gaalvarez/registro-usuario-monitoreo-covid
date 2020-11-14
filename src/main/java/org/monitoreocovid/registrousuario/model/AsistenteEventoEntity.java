package org.monitoreocovid.registrousuario.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "rel_asistente_evento", schema = "monitoreo_covid", catalog = "")
public class AsistenteEventoEntity {
    private Integer idAsistenteEvento;
    private AsistenteEntity asistente;
    private EventoEntity evento;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asistente_evento", nullable = false)
    public Integer getIdAsistenteEvento() {
        return idAsistenteEvento;
    }

    public void setIdAsistenteEvento(Integer idAsistenteEvento) {
        this.idAsistenteEvento = idAsistenteEvento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AsistenteEventoEntity that = (AsistenteEventoEntity) o;
        return idAsistenteEvento == that.idAsistenteEvento;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAsistenteEvento);
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_asistente", referencedColumnName = "id_asistente", nullable = false)
    public AsistenteEntity getAsistente() {
        return asistente;
    }

    public void setAsistente(AsistenteEntity asistente) {
        this.asistente = asistente;
    }

    @ManyToOne
    @JoinColumn(name = "id_evento", referencedColumnName = "id_evento", nullable = false)
    public EventoEntity getEvento() {
        return evento;
    }

    public void setEvento(EventoEntity evento) {
        this.evento = evento;
    }
}
