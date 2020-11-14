package org.monitoreocovid.registrousuario.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class RegistroAsistenteDuplicadoException extends RuntimeException {

        public RegistroAsistenteDuplicadoException() {
            super();
        }
        public RegistroAsistenteDuplicadoException(String message, Throwable cause) {
            super(message, cause);
        }
        public RegistroAsistenteDuplicadoException(String message) {
            super(message);
        }
        public RegistroAsistenteDuplicadoException(Throwable cause) {
            super(cause);
        }

}
