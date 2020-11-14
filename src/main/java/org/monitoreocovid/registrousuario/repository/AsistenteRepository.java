package org.monitoreocovid.registrousuario.repository;

import org.monitoreocovid.registrousuario.model.AsistenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AsistenteRepository extends JpaRepository<AsistenteEntity, Integer> {

    Optional<AsistenteEntity> findByNumeroIdentificacion(String numeroIdentificacion);
}
