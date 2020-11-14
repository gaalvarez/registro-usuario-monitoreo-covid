package org.monitoreocovid.registrousuario.repository;

import org.monitoreocovid.registrousuario.model.EventoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<EventoEntity, Integer> {
}
