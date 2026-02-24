package br.com.dighitink.modelo;

import lombok.Getter;
import lombok.Setter;

    public class Aluguel {

        @Getter @Setter
        private Integer id;

        @Getter @Setter
        private Cliente cliente;

        @Getter @Setter
        private Veiculo veiculo;

        @Getter @Setter
        private Integer quantidadeDias;

        @Getter @Setter
        private Double totalAluguel; 
}

    



    
    

    
