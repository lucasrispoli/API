package org.serratec.backend.apiaula5.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
public enum Combustivel {
 DIESEL(1,"DIESEL"),FLEX(2,"FLEX"),GASOLINA(3,"GASOLINA");

  private Integer codigo;
   private String descricao;

    Combustivel(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    @JsonCreator
    public static Combustivel verificarCombustivel(Integer valor) {
        for (Combustivel combustivel : Combustivel.values()) {
            if (valor.equals(combustivel.getCodigo())) {
                return combustivel;
            }
        }
        throw new EnumConstantNotPresentException(Combustivel.class, valor.toString());
    }
}
