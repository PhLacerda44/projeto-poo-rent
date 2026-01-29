package br.com.dighitink.modelo;

public class Aluguel {
   
    public Veiculo  veiculo;
    public Cliente  cliente;
    public Integer  quantidadeDias;


    public void mostrarDadosAluguel(){

        Double valorDiaria = 150.00;
        Double totalAluguel = valorDiaria*quantidadeDias;

        System.out.println("Dados do aluguel:");
        System.out.println("Cliente:" + cliente.nome);
        System.out.println("Veículo Alugado:" + veiculo.modelo + "-"+veiculo.ano);
        System.out.println("Quantidade de dias:"+ quantidadeDias);
        System.out.println("Total do aluguel: "+totalAluguel);
    }

    public Double totalapagar(){
        Double valordodia = 150.00;
        Double total = valordodia*quantidadeDias;
        return total;
    
    }

    
}
