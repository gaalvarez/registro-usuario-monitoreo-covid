package org.monitoreocovid.registrousuario.repository;

import org.monitoreocovid.registrousuario.model.AsistenteEntity;
import org.monitoreocovid.registrousuario.model.AsistenteEventoEntity;
import org.monitoreocovid.registrousuario.model.EventoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface AsistenteEventoRepository extends JpaRepository<AsistenteEventoEntity, Integer> {

    @Query("SELECT a FROM AsistenteEventoEntity a WHERE a.asistente.idAsistente = ?1 AND a.evento.idEvento = ?2")
    Optional<AsistenteEventoEntity> findByIdEventoAndIdAsistente(Integer idAsistente, Integer idEvento);
}
