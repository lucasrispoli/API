package org.serratec.backend.apiaula5.exeption;

public class EntidadeNaoEncontradaException extends RuntimeException {

    String titulo;

    public EntidadeNaoEncontradaException(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
