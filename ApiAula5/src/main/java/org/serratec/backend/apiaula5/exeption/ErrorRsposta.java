package org.serratec.backend.apiaula5.exeption;
import java.time.LocalDateTime;
import java.util.List;

public class ErrorRsposta extends RuntimeException {

    private Integer status;
    private String titulo;
    private LocalDateTime dataHora;

    public ErrorRsposta(Integer status, String titulo, LocalDateTime dataHora) {
        this.status = status;
        this.titulo = titulo;
        this.dataHora = dataHora;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}