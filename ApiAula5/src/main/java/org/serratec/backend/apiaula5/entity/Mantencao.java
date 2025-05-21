package org.serratec.backend.apiaula5.entity;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import jakarta.persistence.*;

@Entity
public class Mantencao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private String obs;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id_veiculo")
    private Veiculo veiculo;


    @ManyToMany
    @JoinTable(name = "manutencao_servico",
            joinColumns = @JoinColumn(name="id_manutencao"),
            inverseJoinColumns = @JoinColumn(name="id_servico"))


    private List<Servico> servico;

    public List<Servico> getServico() {
        return servico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
