package org.serratec.backend.aula31;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import java.time.LocalDate;

    @Table(name = "produto")

    @Entity
    public class Produto {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @Column(name = "descricao", length = 450, nullable = false)
        private String descricao;

        @Column(name = "valor", length = 250, nullable = false)
        private Double valor;

        @Column(name = "data_cadastro", length = 100)
        private LocalDate dataCadastro;

        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public String getDescricao() {
            return descricao;
        }
        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }
        public Double getValor() {
            return valor;
        }
        public void setValor(Double valor) {
            this.valor = valor;
        }
        public LocalDate getDataCadastro() {
            return dataCadastro;
        }
        public void setDataCadastro(LocalDate dataCadastro) {
            this.dataCadastro = dataCadastro;
        }
        @Override
        public String toString() {
            return "Produto{" + "id=" + id + ", descricao=" + descricao + ", valor=" + valor + ", dataCadastro="
                    + dataCadastro + '}';
        }

    }

