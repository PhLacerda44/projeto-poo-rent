package br.com.dighitink.modelo;

public class Aluguel {
   
    private Veiculo  veiculo;
    private Cliente  cliente;
    private Integer  quantidadeDias;

    //////////////////////////////////////////////////////////
    
    //Encapsulamento Veículo
    public Veiculo getVeiculo(){
        return veiculo;
    }
    public void setVeiculo(Veiculo veiculo){
        this.veiculo = veiculo;
    }


    //Encapsulamento Cliente
    public Cliente getCliente(){
        return cliente;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    
    //Encapsuamento Quantidade de dias
    public Integer getQuantidadededias(){
        return quantidadeDias;
    }
    public void setQuantidadededias(Integer quantidadeDias){
        this.quantidadeDias = quantidadeDias;
    }

    //////////////////////////////////////////////////////////////

    public void mostrarDadosAluguel(){

        Double valorDiaria = 150.00;
        Double totalAluguel = valorDiaria*quantidadeDias;

        System.out.println("Dados do aluguel: ");
        System.out.println("###########################");
        System.out.println("\nCliente: " + cliente.getNome());
        System.out.println("\nVeículo Alugado: " + veiculo.getModelo() + "-"+veiculo.getAno());
        System.out.println("\nQuantidade de dias: "+ quantidadeDias);
        System.out.println("\nTotal do aluguel: "+totalAluguel);
    }

    public Double totalapagar(){
        Double valordodia = 150.00;
        Double total = valordodia*quantidadeDias;
        return total;
    
    }

    
}
