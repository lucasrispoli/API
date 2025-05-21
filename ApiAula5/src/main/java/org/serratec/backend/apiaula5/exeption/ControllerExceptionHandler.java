package org.serratec.backend.apiaula5.exeption;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ControllerExceptionHandler extends ResponseEntityExceptionHandler {

@ExceptionHandler(EntidadeNaoEncontradaException.class)
    public ResponseEntity<Object>heandlerEntidadeNaoEncontradaException(EntidadeNaoEncontradaException exception, WebRequest webRequest) {

        HttpStatus status = HttpStatus.BAD_REQUEST;

        ErrorRsposta erro = new ErrorRsposta(status.value(), exception.getTitulo(), LocalDateTime.now());


        return handleExceptionInternal(exception,erro,new HttpHeaders(),status,webRequest);
    }
}
