package org.serratec.backend.apiaula5.entity;

import jakarta.persistence.Column;
import org.serratec.backend.apiaula5.enums.Categoria;
import org.serratec.backend.apiaula5.enums.Combustivel;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Embeddable
public class Caracteristica {


    @Column(name = "renavem")
    private String renavam;
    @Column(name = "chassi")
    private String chassi;
    @Column(name ="cor")
    private String cor;
    @Column(name = "ano")
    private Integer ano;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    private Combustivel combustivel;
}
