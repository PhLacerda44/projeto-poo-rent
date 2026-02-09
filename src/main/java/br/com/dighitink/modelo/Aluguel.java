package br.com.dighitink.modelo;

import lombok.Getter;

import lombok.Setter;


public class Aluguel {
   
    @Getter @Setter
    private Veiculo  veiculo;

    @Getter @Setter
    private Cliente  cliente;

    @Getter @Setter
    private Integer  quantidadeDias;

    //* Código que mostra meu aluguel, cliente, veículo, quantidade de dias e valor da diária  */
   public void mostrarDadosAluguel() {

        Double valorDiaria = veiculo.getValorDiaria();
        Double totalAluguel = valorDiaria * quantidadeDias;

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

  


    

    

}
    
    

    
