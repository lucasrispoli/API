package org.serratec.backend.apiaula5.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity(name = "veiculo")
@Table
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(max = 7, min = 7, message = "Placa inválida")
    @Column(name = "placa")
    private String placa;

    @NotBlank
    @Column(name = "marca")
    private String marca;

    @NotBlank
    @Column(name = "modelo")
    private String modelo;

    @Embedded
    @Column(name = "caracteristicas")
    private Caracteristica caracteristica;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Caracteristica getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(Caracteristica caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public String toString() {
        return "Veiculo [id=" + id + ", placa=" + placa + ", marca=" + marca + ", modelo=" + modelo
                + ", caracteristica=" + caracteristica + "]";
    }
}
