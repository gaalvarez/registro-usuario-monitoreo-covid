package org.monitoreocovid.registrousuario.controller;

import org.monitoreocovid.registrousuario.dto.RegistroDTO;
import org.monitoreocovid.registrousuario.exception.RegistroAsistenteDuplicadoException;
import org.monitoreocovid.registrousuario.model.EventoEntity;
import org.monitoreocovid.registrousuario.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/registros")
public class RegistroController {

    @Autowired
    private RegistroService registroService;

    @PostMapping()
    @ExceptionHandler(value = RegistroAsistenteDuplicadoException.class)
    ResponseEntity<RegistroDTO> registrarAsistente(@RequestBody RegistroDTO registro) {
        return ResponseEntity.ok().body(this.registroService.registrarAsistente(registro));
    }

    @GetMapping(value="/eventos")
    ResponseEntity<List<EventoEntity>> listarEventos() {
        return ResponseEntity.ok().body(this.registroService.listarEventos());
    }
}
