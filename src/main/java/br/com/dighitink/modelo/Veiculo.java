package br.com.dighitink.modelo;

import lombok.Getter;
import lombok.Setter;

public class Veiculo {

    @Getter @Setter
   private String modelo;

    @Getter @Setter
   private String marca;

    @Getter @Setter
   private Integer ano;

    @Getter @Setter
   private Double valorDiaria;



}
