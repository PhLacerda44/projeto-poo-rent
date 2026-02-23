package br.com.dighitink.modelo;

import lombok.Getter;
import lombok.Setter;

    public class Aluguel {

        @Getter @Setter
        private Integer id;

        @Getter @Setter
        private Veiculo veiculo;

        @Getter @Setter
        private Cliente cliente;

        @Getter @Setter
        private Integer quantidadeDias;

      
        public Double getTotalAluguel() {
            if (veiculo == null || quantidadeDias == null) {
                return 0.0;
            }
            return veiculo.getValorDiaria() * quantidadeDias;
        }

        // Método para mostrar os dados do aluguel
        public void mostrarDadosAluguel() {

            Double valorDiaria = veiculo.getValorDiaria();
            Double totalAluguel = getTotalAluguel();

            System.out.println("############################");
            System.out.println("        Dados do aluguel    ");
            System.out.println("############################");
            System.out.println("\nCliente: " + cliente.getNome());
            System.out.println("\nVeículo Alugado: " + veiculo.getModelo());
            System.out.println("\nValor da diária: " + valorDiaria);
            System.out.println("\nQuantidade de dias: " + quantidadeDias);
            System.out.println("\nTotal do aluguel: " + totalAluguel);
        }

        /**
         * 
         * @return
         */
        public Double totalapagar() {
            return veiculo.getValorDiaria() * quantidadeDias;
        }

        public void setTotalAluguel(double double1) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'setTotalAluguel'");
        }
}

    



    
    

    
